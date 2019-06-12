/*******************************************************************************
 * NAME: PrototypeScope.java FQN:
 * GettingStartedWithSpringMVC.com.app.rc.beanScopes.PrototypeScope.java
 * DATE: 07-Apr-2019 AUTHOR: iHSPA DESCRIPTION: Demonstrate
 * Prototype Scope of a Spring Bean.
 * ----------------------------------------------------------------------------
 * CHANGELOG: 2019-04-07:iHSPA-> File created.
 * ----------------------------------------------------------------------------
 * Copyright @ 2019, Harsh Poddar (RC)
 ******************************************************************************/

package com.app.rc.beanScopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeScope {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "beanScopesContext.xml");

        IManufacturerInfo fiat = context.getBean("fiat",
                Fiat.class);

        System.out.println(fiat.getManufacturerInfo());
        context.close();
    }

}
