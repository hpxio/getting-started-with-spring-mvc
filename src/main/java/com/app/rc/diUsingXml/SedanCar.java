/*******************************************************************************
 * NAME: MigrationCreation.java
 * FQN: GettingStartedWithSpringMVC.com.app.rc.dependencyInjection.MigrationCreation.java
 * DATE: 01-Apr-2019
 * AUTHOR: iHSPA
 * DESCRIPTION: Demonstrate Constructor Injection.
 * CHANGELOG:
 * 2019-04-01:iHSPA-> File created.
 * Copyright @ 2019, Harsh Poddar
 ******************************************************************************/

/**
 * 
 */
package com.app.rc.diUsingXml;

/**
 * Constructor Injection
 * 
 * @author iHSPA
 */
public class SedanCar {
    // Above example shows: Has-A relationship, like Engine //

    // Object dependency has-a relation : SedanCar has Sedan Assembly //
    private SedanCarModel model;

    // Another non-dependency type data member //
    private String modelName;

    public SedanCar ( SedanCarModel model, String modelName ) {
        super ( );
        this.model = model;
        this.modelName = modelName;
    }

    public SedanCar ( ) {
    }

    // Called as Helper Constructor - used by Constructor Injection from Bean
    public SedanCar ( SedanCarModel model ) {
        System.out.println ( "Constructor Injection invoked..." );
        this.model = model;
    }

    public void getData ( ) {
        model.defineCarChassis ( 23 );
    }

    /**
     * Demonstration of Injecting Literal Values using Setter Injection
     * 
     * @param session
     */
    public void setModelName ( String modelName ) {
        this.modelName = modelName;
    }

    public void getModelName ( ) {
        System.out.println ( "Model Name: " + modelName );
    }

    @Override
    public String toString ( ) {
        return "SedanCar [model=" + model + ", modelName=" + modelName + "]";
    }
}
