package com;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by lwz on 2020/12/28.
 *
 * 1.创建Stream
 *
 * 2.中间操作
 *
 *3.终止操作
 */
public class StreamTest {

    public void test1(){
        //
        List<String> list  = new ArrayList<String>();

        Stream<String> stream1 = list.stream();
        //
        int array[] ={2,3};
        IntStream stream = Arrays.stream(array);

        //
        Stream<String> stream3 = Stream.of("aa", "bb", "cc");


        //

        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));




    }



}
