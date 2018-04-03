package com.in28minutes.spring.basic.springin5steps;

import com.in28minutes.spring.basic.componentscan.ComponentDAO;
import com.in28minutes.spring.basic.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.spring.basic.componentscan")
public class SpringIn5StepsComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {
        //BinarySearchImpl binarySearch  = new BinarySearchImpl(new QuickSortAlgorithm());

        //ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsComponentScanApplication.class)) {
			ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);

			LOGGER.info("{}", componentDao);
		}
	}
}