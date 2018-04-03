package com.in28minutes.spring.basic.springin5steps.basic;

import com.in28minutes.spring.basic.springin5steps.SpringIn5StepsBasicApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class BinarySearchXMLConfigurationTest {

    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario(){
        //call method on binary search
        int result = binarySearch.binarySearch(new int[]{}, 5);
        assertEquals(3, result);

    }

}
