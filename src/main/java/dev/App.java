package dev;

import dev.ihm.Menu;


import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
    	
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");

      

        Menu menu = context.getBean(Menu.class);
       

        menu.afficher();
        context.getBean(Scanner.class).close();
        context.close();


    }
}
