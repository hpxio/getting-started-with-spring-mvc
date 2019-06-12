/*******************************************************************************
 * NAME: MultiValuedCI.java
 * FQN: GettingStartedWithSpringMVC.com.app.rc.diUsingXml.MultiValuedCI.java
 * DATE: 09-Apr-2019
 * AUTHOR: iHSPA
 * DESCRIPTION: Short description of what this Class does.
 * CHANGELOG:
 * Copyright @ 2019, Harsh Poddar (RC)
 ******************************************************************************/

/**
 * 
 */
package com.app.rc.xmlInjections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Demonstrate CI/SI using multivalued bean dependency injection.<br/>
 * Uses: src/main/resources/multivaluedCiContext.xml<br/>
 * Learning: Beans are not restricted to just public classes,
 * however it is discouraged to configure in such a manner to
 * avoid confusion and provide maintainability.
 * 
 * @author iHSPA
 */
public class MultiValuedCI {

    public static void main ( String[] args ) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext ( "multivaluedCiContext.xml" );

        // Using CI to injct values //
        Employee e = ctx.getBean ( "employee", Employee.class );
        System.out.println ( e.getId ( ) + ";" + e.getName ( ) );

        // Using SI to inject values //
        Employee eSI = ctx.getBean ( "employeeSI", Employee.class );
        System.out.println ( eSI.getId ( ) + ";" + eSI.getName ( ) );

        ctx.close ( );
    }
}

/**
 * Demonstrate ban creation using CI/SI in the Spring Container.
 * Uses: src/main/resources/multivaluedCiContext.xml
 * 
 * @author iHSPA
 */
class Employee {

    private int id;

    private String name;

    public Employee ( ) {

    }

    public Employee ( int id, String name ) {
        this.id = id;
        this.name = name;
    }

    public int getId ( ) {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }
}
