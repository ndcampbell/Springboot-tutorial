package com.in28minutes.spring.basic.springin5steps;

import com.in28minutes.spring.basic.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basic.springin5steps.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	public static void main(String[] args) {
        //BinarySearchImpl binarySearch  = new BinarySearchImpl(new QuickSortAlgorithm());
        try( AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class)) {
            //ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
            SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
            String url = service.returnServiceURL();
            System.out.println(url);
        }

	}
}