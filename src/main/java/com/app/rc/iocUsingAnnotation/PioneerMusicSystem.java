/*******************************************************************************
 * NAME: PioneerMusicSystem.java
 * FQN: GettingStartedWithSpringMVC.com.app.rc.iocUsingAnnotation.PioneerMusicSystem.java
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

import org.springframework.stereotype.Component;

/**
 * @author iHSPA
 */
@Component
public class PioneerMusicSystem implements IMusicSystem {

    @Override
    public String musicSystemName ( ) {
        return "Pioneer Music Systems";
    }

    @Override
    public String features ( ) {
        return "Huge Bass & Sub-Woofers";
    }

}
