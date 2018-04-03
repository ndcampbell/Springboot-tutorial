package com.in28minutes.spring.basic.springin5steps;

import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basic.springin5steps.basic.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
        //BinarySearchImpl binarySearch  = new BinarySearchImpl(new QuickSortAlgorithm());
        try( AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class)) {
            //ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);

            BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

            int result = binarySearch.binarySearch(new int[]{2, 4, 6}, 3);

            System.out.println(result);
        }

	}
}