/*******************************************************************************
 * NAME: DefaultBeanScope.java
 * FQN: GettingStartedWithSpringMVC.com.app.rc.beanScopes.DefaultBeanScope.java
 * DATE: 06-Apr-2019
 * AUTHOR: iHSPA
 * DESCRIPTION: Class demonstrate default scope for a Spring Bean.
 * ----------------------------------------------------------------------------
 * CHANGELOG:
 * 2019-04-06:iHSPA-> File created.
 * ----------------------------------------------------------------------------
 * Copyright @ 2019, Harsh Poddar
 ******************************************************************************/

/**
 * 
 */
package com.app.rc.beanScopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author iHSPA
 */
public class SingletonScope {

    public static void main ( String[] args ) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ( "beanScopesContext.xml" );

        IManufacturerInfo skodaCompany = context.getBean ( "skoda", Skoda.class );
        IManufacturerInfo skodaBetaCompany = context.getBean ( "skoda", Skoda.class );

        skodaCompany.setManufacturerInfo ( "Skoda", "France" );
        skodaBetaCompany.setManufacturerInfo ( "Skoda Motors", "Britain" );

        // Compare if the two objects are same //
        if ( skodaCompany.equals ( skodaBetaCompany ) ) {
            System.out.println ( "Equal..." );
        }

        if ( skodaCompany == skodaBetaCompany ) {
            System.out.println ( "Equal..." );
        }

        // Get the memory address of the two beans //
        System.out.println ( "skodaCompany:: " + skodaCompany );
        System.out.println ( "skodaBetaCompany:: " + skodaBetaCompany );

        context.close ( );
    }

}
