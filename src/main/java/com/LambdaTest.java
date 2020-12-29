package com;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * Created by lwz on 2020/12/28.
 *
 *
 */
public class LambdaTest {

    public void test1(){
        /**
         *  无参数 无返回值
         */
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Hello");
                }
            };

            Runnable r1 = () -> System.out.println("Hello Lambda");

    }
    //China!234
    @Test
    public  void test2(){
        /**
         * 有参数 无返回值
         * lambda表达式就是多接口中抽象方法的实现
         */

        Consumer<String> con = (x)-> System.out.println(x);

        con.accept("bu");
    }

    @Test
    public  void test3(){
        /**
         * 有参数 无返回值 如果只有一个参数 小括号可以不写
         */

        Consumer<String> con = (x)-> System.out.println(x);

        con.accept("bu");
    }


    @Test
    public  void test4(){
        /**
         * 有参数 无返回值 只有2个参数 并且lambda体中有多条语句
         */

        Comparator<Integer> con = (x,y)->{
            System.out.println(x+y);
            return Integer.compare(x,y);
        };
       con.compare(7, 6);

    }


    @Test
    public  void test5(){
        /**
         * 有参数 无返回值 只有2个参数 并且lambda体中有多条语句
         */

        Comparator<Integer> con = (x,y)->{
            System.out.println(x+y);
            return Integer.compare(x,y);
        };
        con.compare(7, 6);

    }

    @Test
    public  void test6(){
        /**
         * 若lambda只有一条语句  大括号返回值 都可以不写
         */

        Comparator<Integer> con = (x,y)->  Integer.compare(x,y);

        System.out.println( con.compare(7, 6));

    }
}
