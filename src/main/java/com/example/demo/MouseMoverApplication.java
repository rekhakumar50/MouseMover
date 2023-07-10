package com.example.demo;

import java.awt.AWTException;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MouseMoverApplication {
	
	static {
        System.setProperty("java.awt.headless", "false");
	}

	public static void main(String[] args) throws BeansException, AWTException, InterruptedException {
		ConfigurableApplicationContext cx =	SpringApplication.run(MouseMoverApplication.class, args);
		cx.getBean(MouseMover.class).moveMouse();
		
	}

}
