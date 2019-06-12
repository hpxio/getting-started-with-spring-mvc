/*******************************************************************************
 * NAME: IMigrationOperation.java
 * FQN: GettingStartedWithSpringMVC.com.app.rc.inversionOfControl.IMigrationOperation.java
 * DATE: 01-Apr-2019
 * AUTHOR: iHSPA
 * DESCRIPTION: Interface used to demonstrate Spring Containers using XML Configurations.
 * -----------------------------------------------------------------------------
 * CHANGELOG:
 * 2019-04-01:iHSPA-> File created.
 * 2019-04-06:iHSPA-> Converted example to more generic one, using car categories example.
 * -----------------------------------------------------------------------------
 * Copyright @ 2019, Harsh Poddar
 ******************************************************************************/

package com.app.rc.iocUsingXml;

/**
 * OBJECTIVE: Create an application where we can select manufacturing of different classes(Sedan, SUV, Hatch Back) of
 * car. Also, make sure the selection of class(model)is configurable.
 */
public interface ICarClass {

    public String className ( );
}
