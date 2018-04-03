package com.in28minutes.spring.basic.springin5steps.cdi;

import com.in28minutes.spring.basic.springin5steps.SpringIn5StepsBasicApplication;
import com.in28minutes.spring.basic.springin5steps.basic.BinarySearchImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

    @InjectMocks
    SomeCdiBusiness business;

    @Mock
    SomeCdiDao daoMock;

    @Test
    public void testBasic(){
        when(daoMock.getData()).thenReturn(new int[]{2,4});
        int actualResult = business.findGreatest();
        assertEquals(4, actualResult);


    }

}
