package com.ouliang.util;

import java.lang.reflect.Field;

public class RelectUtil {
    //作用:将任意类型对象内容转换为JSON格式字符串返回
    //参数:一个高级引用类型对象 student对象, Dopt对象
    public static String jsonObject(Object obj) {


        Class classFile = null;
        Field freldArray[] = null;
        StringBuffer str = new StringBuffer("{");
        //获取当前对象隶属的class文件
        classFile = obj.getClass();
        //获得clss文件所有属性
        freldArray = classFile.getDeclaredFields();
        //获取当前对象所有属性的值

        for (int i =0;i<freldArray.length;i++) {
            Field field =freldArray[i];
            field.setAccessible(true);//确保私有访问权限属性可以再class文件外使用
            String fieldName = field.getName();//获取属性名称
            Object value = null;
            try {
                value = field.get(obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            //将获得的属性及其值拼接为JSON格式字符串
            str.append("\"");
            str.append(fieldName);
            str.append("\":");
            str.append("\"");
            str.append(value);
            str.append("\"");//拼接结果     "sid":"10"
            if(i<freldArray.length-1){
                str.append(",");
            }
        }
        str.append("}");
        return str.toString();
    }
}


