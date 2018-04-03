package com.in28minutes.spring.basic.springin5steps;

import com.in28minutes.spring.basic.springin5steps.cdi.SomeCdiBusiness;
import com.in28minutes.spring.basic.springin5steps.cdi.SomeCdiDao;
import com.in28minutes.spring.basic.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

	public static void main(String[] args) {
        //BinarySearchImpl binarySearch  = new BinarySearchImpl(new QuickSortAlgorithm());

        //ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsCdiApplication.class, args);
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class)) {
            SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);

            LOGGER.info("{} dao-{}", someCdiBusiness, someCdiBusiness.getSomeCDIDAO());
        }
	}
}