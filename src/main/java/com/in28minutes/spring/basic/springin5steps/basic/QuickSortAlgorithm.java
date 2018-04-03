package com.in28minutes.spring.basic.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by dcampbell on 10/18/17.
 */

@Component
@Qualifier("quick")
public class QuickSortAlgorithm  implements SortAlgorithm{

    public int[] sort(int[] numbers) {
        return numbers;
    }
}
