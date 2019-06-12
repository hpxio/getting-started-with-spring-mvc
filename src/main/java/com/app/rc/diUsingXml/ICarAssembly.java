/*******************************************************************************
 * NAME: IObjectsData.java (Interface)
 * FQN: GettingStartedWithSpringMVC.com.app.rc.dependencyInjection.IObjectsData.java
 * DATE: 01-Apr-2019
 * AUTHOR: iHSPA
 * DESCRIPTION: Implementation to use for CI/SI Dependency Injections demo.
 * CHANGELOG:
 * 2019-04-01:iHSPA-> File created.
 * Copyright @ 2019, Harsh Poddar
 ******************************************************************************/

/**
 * 
 */
package com.app.rc.diUsingXml;

/**
 * <p>
 * <b>Objective:</b> Create a class and demonstrate Dependency Injection.
 * Dependency injection is the mechanism of delegating the supply of objects
 * required for any class to work. Example, a car class might need engine class
 * to assemble as a final product. So to finally compile as a single unit engine
 * class object should be provided.<br/>
 * Spring provides mechanism to facilitate this scenario by automatically
 * creating and providing the required reference to the executing program. We
 * will also see AutoWiring concept in this context.<br/>
 * There are two ways of creating DI:
 * <ol>
 * <li>Constructor Injection</li>
 * <li>Setter Injection</li>
 * </ol>
 * </p>
 * 
 * @author iHSPA
 */
public interface ICarAssembly {

    public void define4Wheels ( );

    public void defineCarChassis ( int id );

}
