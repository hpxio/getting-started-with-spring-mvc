/*******************************************************************************
 * NAME: Fiat.java
 * FQN: GettingStartedWithSpringMVC.com.app.rc.beanScopes.Fiat.java
 * DATE: 07-Apr-2019
 * AUTHOR: iHSPA
 * DESCRIPTION: Demonstrate Init-Method & Destroy-Method properties of Spring Bean.
 * ----------------------------------------------------------------------------
 * CHANGELOG:
 * 2019-04-07:iHSPA-> File created.
 * ----------------------------------------------------------------------------
 * Copyright @ 2019, Harsh Poddar (RC)
 ******************************************************************************/

/**
 * 
 */
package com.app.rc.beanScopes;

/**
 * <p>
 * Demonstrate Spring Beans Methods.<br/>
 * Special Note: Defining init and destroy methods<br/>
 * <i>When using XML configuration</i><br/>
 * <b><i>Access modifier</b></i>: The method can have any access modifier (public, protected, private)<br/>
 * <b><i>Return type</b></i>: The method can have any return type. If you give a return type just note that
 * you will not be able to capture the return value. As a result, "void" is commonly used.<br/>
 * <b><i>Method name</b></i>: The method can have any method name.<br/>
 * <b><i>Arguments</b></i>: The method can not accept any arguments. The method should be no-arg.<br/>
 * </p>
 * 
 * @author iHSPA
 */
public class Fiat implements IManufacturerInfo {

    private String name;

    private String country;

    public Fiat ( ) {
    }

    public Fiat ( String name, String country ) {
        this.name = name;
        this.country = country;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getCountry ( ) {
        return country;
    }

    public void setCountry ( String country ) {
        this.country = country;
    }

    @Override
    public String registeredName ( ) {
        return name;
    }

    @Override
    public String countryOfOrigin ( ) {
        return country;
    }

    @Override
    public String getManufacturerInfo ( ) {
        return "Name:" + name + ", Country:" + country;
    }

    @Override
    public void setManufacturerInfo ( String name, String country ) {
        this.name = name;
        this.country = country;
    }

    /**
     * Method invoked by init-method property from Spring Bean
     */
    public void fiatInitMethod ( ) {
        System.out.println ( "You're in Fiat Class..." );
    }

    /**
     * Method invoked by destroy-method property from Spring Bean
     * 
     * @Issue
     *        This method is not invoked when Spring Bean dies. Go through reason online.
     * @Resolution
     *             For "prototype" scoped beans, Spring does not call the destroy method.
     *             In contrast to the other scopes, Spring does not manage the complete lifecycle of a prototype bean:
     *             the container instantiates, configures, and otherwise assembles a prototype object, and hands it to
     *             the client, with no further record of that prototype instance.
     *             Thus, although initialization lifecycle callback methods are called on all objects regardless of
     *             scope, in the case of prototypes, configured destruction lifecycle callbacks are not called. The
     *             client code must clean up prototype-scoped objects and release expensive resources that the prototype
     *             bean(s) are holding.
     */
    public void fiatDestroyMethod ( ) {
        System.out.println ( "You're leaving Fiat Class..." );
    }

}
