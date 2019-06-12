/*******************************************************************************
 * NAME: MigrationCreation.java
 * FQN: GettingStartedWithSpringMVC.com.app.rc.inversionOfControl.MigrationCreation.java
 * DATE: 01-Apr-2019
 * AUTHOR: iHSPA
 * DESCRIPTION: Demonstrate XML Configuration usage. (See App.java)
 * -----------------------------------------------------------------------------
 * CHANGELOG:
 * 2019-04-01:iHSPA-> File created.
 * 2019-04-06:iHSPA-> Converted example to more generic one, using car categories example.
 * -----------------------------------------------------------------------------
 * Copyright @ 2019, Harsh Poddar
 ******************************************************************************/

package com.app.rc.iocUsingXml;

public class SedanCars implements ICarClass {

    /*
     * Some Sedan only properties.
     * These properties will only be inherited by
     * Sedan Cars like Skoda Laura, Honda City, etc.
     */
    float trunchVolume;

    @Override
    public String className ( ) {
        return "This is Sedan Car...";
    }
}
