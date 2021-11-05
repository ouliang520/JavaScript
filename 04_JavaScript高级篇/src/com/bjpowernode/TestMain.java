package com.bjpowernode;

/**
 * 2020/5/8 JAVA方法重载
 */
public class TestMain {

    public static void main(String[] args) {

        //test(null);
        test(10,20,30);
        //test("abc")
    }


    //int...args:动态参数，Java实现方法重载基础
    public static void test(int...args){
        System.out.println("test method is run...");
    }

    public static  void test1(String param){

    }
    public static void test1(Integer param1,String param2){

    }
}
