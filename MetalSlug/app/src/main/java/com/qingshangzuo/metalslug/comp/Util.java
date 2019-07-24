package com.qingshangzuo.metalslug.comp;


import java.util.Random;

public class Util {

    public static Random random = new Random();

    public static int rand(int range){
        if(range == 0){
            return 0;
        }

        return Math.abs(random.nextInt() % range);
    }
}
