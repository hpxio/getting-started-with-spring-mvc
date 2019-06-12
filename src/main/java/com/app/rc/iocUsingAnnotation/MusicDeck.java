/*******************************************************************************
 * NAME: MusicDeck.java
 * FQN: GettingStartedWithSpringMVC.com.app.rc.iocUsingAnnotation.MusicDeck.java
 * DATE: 07-Apr-2019
 * AUTHOR: iHSPA
 * DESCRIPTION: Short description of what this Class does.
 * CHANGELOG:
 * Copyright @ 2019, Harsh Poddar (RC)
 ******************************************************************************/

/**
 * 
 */
package com.app.rc.iocUsingAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author iHSPA
 */
public class MusicDeck {

    /**
     * <p>
     * Constructing Spring using <b>Java Annotations</b>.
     * To generate a Spring Container using this, we follow following
     * steps:
     * <ol>
     * <li>Create a Spring Bean - Add <tt>context:component-scan</tt></li>
     * <li>Define Interface and POJO Class and mark them as <tt>@Component</tt></li>
     * <li>Instantiate Spring Container</li>
     * <li>Get the class context from the container</li>
     * <li>Use the desired method</li>
     * <li>Close the context</li>
     * </ol>
     * </p>
     * <p>
     * Uses: src/main/resource/beanAnnotationsContext.xml
     * </p>
     */
    public static void main ( String[] args ) {

        // Same as XML - Instantiate the Spring Container //
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ( "beanAnnotationsContext.xml" );

        // Get the bean context -0 instantiate the bean //
        IMusicSystem pioneer = context.getBean ( "pioneerMusicSystem", PioneerMusicSystem.class );
        /*
         * Note that, if we do not provide Component name, Spring me assign a default name
         * for it by making the first letter of class as small followed by camel case for
         * consecutive words.
         */

        // Use the methods //
        System.out.println ( pioneer.musicSystemName ( ) );
        System.out.println ( pioneer.features ( ) );

        // Close the context //
        context.close ( );
    }
}
