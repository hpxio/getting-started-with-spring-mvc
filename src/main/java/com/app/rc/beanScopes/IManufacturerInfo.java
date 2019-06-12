/*******************************************************************************
 * NAME: IManufacturerInfo.java
 * FQN: GettingStartedWithSpringMVC.com.app.rc.beanScopes.IManufacturerInfo.java
 * DATE: 06-Apr-2019
 * AUTHOR: iHSPA
 * DESCRIPTION: Demonstrate scope.
 * ----------------------------------------------------------------------------
 * CHANGELOG:
 * 2019-04-06:iHSPA-> File created.
 * ----------------------------------------------------------------------------
 * Copyright @ 2019, Harsh Poddar (RC)
 ******************************************************************************/

/**
 * 
 */
package com.app.rc.beanScopes;

/**
 * @author iHSPA
 */
public interface IManufacturerInfo {

    public String registeredName ( );

    public String countryOfOrigin ( );

    public String getManufacturerInfo ( );

    public void setManufacturerInfo ( String name, String country );

}
