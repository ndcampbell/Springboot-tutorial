package com.in28minutes.spring.basic.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by dcampbell on 4/2/18.
 */

@Component
public class SomeExternalService {

    //external.service.url
    @Value("${external.service.url}")
    private String url;

    public String returnServiceURL() {
        return url;
    }
}
