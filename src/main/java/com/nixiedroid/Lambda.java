package com.nixiedroid;

import com.nixiedroid.interfaces.StringProto;
import com.nixiedroid.interfaces.TwoIntsProto;
import com.nixiedroid.interfaces.TwoValuesProto;
import com.nixiedroid.interfaces.StaticStringProto;

public class Lambda {
    /**
     * Calculates sum of two ints inside lambda
     * @param first
     * @param second
     * @return sum
     */
    public static int sum(int first, int second){
        TwoIntsProto sum;
        sum = (a,b)->a+b;
        return sum.calculate(first,second);

    }
    /**
     * Calculates some big multiline
     * equation using lambda
     * @param first
     * @param second
     * @return something
     */
    public static int someBigEquation(int first, int second){
        TwoIntsProto lambda;
        lambda = (a,b)->{
            int x = a+b;
            int y = a-b;
            return x*y+Math.max(a,b);
        };
        return lambda.calculate(first,second);
    }
    public static double sum(double first, double second){
      //  TwoIntsProto lambda;
        TwoValuesProto<Double> lambda;
        lambda = (a,b)->a+b;
        return lambda.calculate(first,second);
    }
    public static String greeting(){
        StaticStringProto string;
        string = ()->"hello";
        return string.get();
    }
    public static String appendString(final String string){
        if (string != null) {
            StringProto stringProto;
            stringProto = a->a+" world";
            return stringProto.get(string);
        }
        else return "Empty String";
    }


}
