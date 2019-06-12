/*******************************************************************************
 * NAME: GetObjectData.java
 * FQN: GettingStartedWithSpringMVC.com.app.rc.dependencyInjection.GetObjectData.java
 * DATE: 01-Apr-2019
 * AUTHOR: iHSPA
 * DESCRIPTION: POJO Class for CI/SI Dependency Injections demo.
 * CHANGELOG:
 * 2019-04-01:iHSPA-> File created.
 * Copyright @ 2019, Harsh Poddar
 ******************************************************************************/

/**
 * 
 */
package com.app.rc.diUsingXml;

/**
 * @author iHSPA
 */
public class SedanCarModel implements ICarAssembly {
    // Above Example shows : Sedan Model is an assembly for a car type //

    // Some Sedan specific attributes which is also part of Car Assembly //
    private String trunckSapce = null;

    // Some generic attributes of a Car //
    private String transmissionType = null;

    public SedanCarModel ( ) {
    }

    public SedanCarModel ( String objectName, String toc ) {
        this ( );
        this.trunckSapce = objectName;
        this.transmissionType = toc;
    }

    @Override
    public void define4Wheels ( ) {
        System.out.println ( "Getting all the data..." );
    }

    @Override
    public void defineCarChassis ( int id ) {
        System.out.println ( "Getting data by ID: " + id );
    }

    @Override
    public String toString ( ) {
        return "SedanCarModel [trunckSapce=" + trunckSapce + ", transmissionType=" + transmissionType + "]";
    }

}
