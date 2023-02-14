package com.example.sakura;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SakuraConfig.class);

        chenyang cy = context.getBean("chenyang", chenyang.class);

        chenyang cy2 = context.getBean("getCy", chenyang.class);

        if (cy == cy2){
            System.out.println("111");
        }else {
            System.out.println("222");
        }
        System.out.println(cy.hashCode());
        System.out.println(cy2.hashCode());
        System.out.println(cy.toString());
    }
}
