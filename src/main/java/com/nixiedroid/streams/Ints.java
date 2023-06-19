package com.nixiedroid.streams;

import java.util.Arrays;

public class Ints {
    public static long countPositiveNumbers(int[] values){
        if (values!=null){
            return Arrays.stream(values).filter(f->f>0).count();
        }
       return 0;
    }
}
