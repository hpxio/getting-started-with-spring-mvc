/*******************************************************************************
 * NAME: Skoda.java
 * FQN: GettingStartedWithSpringMVC.com.app.rc.beanScopes.Skoda.java
 * DATE: 06-Apr-2019
 * AUTHOR: iHSPA
 * DESCRIPTION: Demonstration of Singleton Scope of a Spring Bean
 * ----------------------------------------------------------------------------
 * CHANGELOG:
 * 2019-04-06:iHSPA-> File created.
 * ----------------------------------------------------------------------------
 * Copyright @ 2019, Harsh Poddar (RC)
 ******************************************************************************/

package com.app.rc.beanScopes;

/**
 * Sample POJO class to be used for scope demonstration.
 * 
 * @author iHSPA
 */
public class Skoda implements IManufacturerInfo { // The manufacturer information //

    // Some dummy data //
    private String name;

    private String country;

    public Skoda ( ) {
    }

    public Skoda ( String name ) {
        this.name = name;
    }

    public String getName ( ) {
        return this.name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    // @Override
    // public String toString ( ) {
    // return "Skoda [name=" + name + ", country=" + country + "]";
    // }

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
        return registeredName ( ) + "::" + countryOfOrigin ( );
    }

    @Override
    public void setManufacturerInfo ( String name, String country ) {
        this.name = name;
        this.country = country;
    }
}
