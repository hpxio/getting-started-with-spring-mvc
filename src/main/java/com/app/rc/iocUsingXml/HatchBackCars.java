/*******************************************************************************
 * NAME: MigrationExecution.java
 * FQN: GettingStartedWithSpringMVC.com.app.rc.inversionOfControl.MigrationExecution.java
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

public class HatchBackCars implements ICarClass {

    /*
     * Some Hatch Back only properties.
     * These properties will only be inherited by
     * Hatch Back Cars like Fiat Punto, Tata Indica, etc.
     */
    float legSpace; // etc //

    @Override
    public String className ( ) {
        return "This is Hatch Back Car...";
    }
}
