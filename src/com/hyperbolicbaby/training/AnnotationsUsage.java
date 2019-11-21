package com.hyperbolicbaby.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsUsage {
    public static void main(String[] args) {
        // Load XML Configuration
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/hyperbolicbaby/training/applicationContext.xml");
        // Ask to bean container for the desired bean
        Employee anEmployee = context.getBean("experimentedCommercial", Employee.class); // We referenced the ExperimentedCommercial, but with the first letter "e" in lowercase
        // To use the bean
        System.out.println(anEmployee.getReport());
        System.out.println(anEmployee.getTasks());

        // A test
        System.out.println("anEmployee instanceof ExperimentedCommercial??? " + (anEmployee instanceof ExperimentedCommercial));
        // To close the context
        context.close();
    }
}
