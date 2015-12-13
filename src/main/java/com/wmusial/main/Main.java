package com.wmusial.main;

import com.wmusial.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Person person = context.getBean("person", Person.class);

        person.speak();

        System.out.println(person);

        context.close();

    }
}
