/*******************************************************************************
 * NAME: App.java FQN:
 * GettingStartedWithSpringMVC.com.app.rc.App.java DATE:
 * 01-Apr-2019 AUTHOR: iHSPA DESCRIPTION: Starting point of
 * the project. Demonstrates basic Spring Bean, Spring
 * Container & ApplicationConfig.xml usage.
 * -----------------------------------------------------------------------------
 * CHANGELOG: 2019-04-01:iHSPA-> File created.
 * 2019-04-02:iHSPA-> ClassPathXmlApplicationContext changed
 * to read XML from classpath. 2019-04-06:iHSPA-> Converted
 * example to more generic one. Using Car categories.
 * -----------------------------------------------------------------------------
 * Copyright @ 2019, Harsh Poddar
 ******************************************************************************/

package com.app.rc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.rc.iocUsingXml.HatchBackCars;
import com.app.rc.iocUsingXml.ICarClass;
import com.app.rc.iocUsingXml.SedanCars;

/**
 * Hello world!
 */
public class App {

    /**
     * <p>
     * In example <b>Section-A</b>, we achieved the
     * selection of object but it is hard-coded. Spring
     * allows us to make this configurable using the Spring
     * <tt>IOC & DI</tt>. IOC, in a nut shell is outsourcing
     * the creation and management of objects. DI on the
     * other hand is .... <br/>
     * <br/>
     * To achieve above freedom of configuration we use
     * <b>Spring Object</b> factory which fetches the
     * required object as per the configured container
     * definition. <br/>
     * Spring containers can be created using three
     * techniques :
     * <tt>Using XML, Annotation or Java code</tt>, all of
     * which will be covered in the above sections. <br/>
     * <br/>
     * </p>
     */
    @SuppressWarnings("unused")
    private static void info() {
        // For information only //
    }

    // This is older technique and is fnot efficient for
    // such scenarios //
    // private static MigrationCreation createData = new
    // MigrationCreation ( );

    // Using the 'Code-To-Interface technique (modern way)
    // //
    private static ICarClass createData = new SedanCars();

    // Refer to the IMigrationOperation interface
    // documentation for objective //
    private static ICarClass loadData = new HatchBackCars();

    public static void main(String[] args) {

        // ----SECTION-A-------------------------------------------------------------------------------------------//
        System.out.println("Using Traditional Method...");
        System.out.println(createData.className());
        System.out.println(loadData.className());
        // -----SECTION-A-------------------------------------------------------------------------------------------//

        // ----SECTION-B-------------------------------------------------------------------------------------------//
        System.out.println(
                "Using XML Container & Spring Controller...");
        containerUsingXml();
        // -----SECTION-B-------------------------------------------------------------------------------------------//

    }

    /**
     * <p>
     * Let's first go through the first method of creating a
     * Container, using <b>XML</b>. To generate a Spring
     * Container using this, we follow following steps:
     * <ol>
     * <li>Create a Spring Bean</li>
     * <li>Configure Spring Container</li>
     * <li>Get the class context from the container</li>
     * <li>Close the context</li>
     * </ol>
     * </p>
     */
    public static void containerUsingXml() {

        // Creation of Spring Container //
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        // Get context of class //
        ICarClass sedan = context.getBean("sedanCars",
                ICarClass.class);

        // Use the methods //
        System.out.println(sedan.className());

        // Close the context //
        context.close();
    }
}
