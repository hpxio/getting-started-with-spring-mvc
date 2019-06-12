/*******************************************************************************
 * NAME: exec.java
 * FQN: GettingStartedWithSpringMVC.com.app.rc.dependencyInjection.exec.java
 * DATE: 01-Apr-2019
 * AUTHOR: iHSPA
 * DESCRIPTION: Demonstrate CI/SI Dependency Injections.
 * CHANGELOG:
 * 2019-04-01:iHSPA-> File created.
 * 2019-04-02:iHSPA-> ClassPathXmlApplicationContext changed to read XML from classpath.
 * Copyright @ 2019, Harsh Poddar
 ******************************************************************************/

/**
 * 
 */
package com.app.rc.diUsingXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author iHSPA
 */
public class exec {

    /**
     * @param args
     */
    public static void main ( String[] args ) {

        // Create Spring Controller //
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ( "applicationContext.xml" );

        // Get class context from Spring Bean - Constructor Injection //
        SedanCar sedanCar = context.getBean ( "sedanCar", SedanCar.class );

        // Get class context from Spring Bean - Setter Injection //
        SpecialPurposeSedan specialPurposeSedan = context.getBean ( "specialPurposeSedan", SpecialPurposeSedan.class );

        // Call required method //
        sedanCar.getData ( );
        // Setting Literal Value using Setter Injection //
        sedanCar.getModelName ( );
        // Setter Injection - Basics //
        specialPurposeSedan.startExec ( );

        // Close the used context //
        context.close ( );
    }
}
