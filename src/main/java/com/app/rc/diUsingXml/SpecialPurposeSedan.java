/*******************************************************************************
 * NAME: MigrationExecution.java
 * FQN: GettingStartedWithSpringMVC.com.app.rc.dependencyInjection.MigrationExecution.java
 * DATE: 01-Apr-2019
 * AUTHOR: iHSPA
 * DESCRIPTION: Demonstrate Setter Injection.
 * CHANGELOG:
 * 2019-04-01:iHSPA-> File created.
 * Copyright @ 2019, Harsh Poddar
 ******************************************************************************/

/**
 * 
 */
package com.app.rc.diUsingXml;

/**
 * Setter Injection
 */
public class SpecialPurposeSedan {
    // Above example shows:Has-A relationship, like Car has a Engine //

    // Object dependency has-a relation : Sedan Car has Sedan Assembly //
    private SedanCarModel model;

    private String specialPurposeFeatures;

    /**
     * 
     */
    public SpecialPurposeSedan ( ) {
    }

    public SedanCarModel getModel ( ) {
        return model;
    }

    public void setModel ( SedanCarModel model ) {
        this.model = model;
    }

    public String getSpecialPurposeFeatures ( ) {
        return specialPurposeFeatures;
    }

    public void setSpecialPurposeFeatures ( String specialPurposeFeatures ) {
        this.specialPurposeFeatures = specialPurposeFeatures;
    }

    @Override
    public String toString ( ) {
        return "SpecialPurposeSedan [model=" + model + ", specialPurposeFeatures=" + specialPurposeFeatures + "]";
    }

    /**
     * Using Model methods as per desire later
     */
    public void startExec ( ) {
        System.out.println ( "Setter Injection invoked..." );
        model.define4Wheels ( );
    }
}
