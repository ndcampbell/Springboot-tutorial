package com.in28minutes.spring.basic.springin5steps.cdi;

import org.springframework.stereotype.Component;

import javax.inject.Named;

/**
 * Created by dcampbell on 3/7/18.
 */

@Named
public class SomeCdiDao {

    public int[] getData() {
        return new int[] {5, 89, 100};
    }

}
