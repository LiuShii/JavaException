package com.company;

import javax.annotation.processing.Messager;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyException extends Exception{
    MyException(String messager){
        super(messager);
    }
}
public class demo {
    public static int parseInt(String str) throws MyException {
        int a = 0;
        if(!isnum(str)){
            throw new MyException("不是数字");
        }
        a = Integer.parseInt(str);



        return a;

    }
    static Boolean isnum(String str){
        Pattern pattern = Pattern.compile("\\d*");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static void main(String[] args) throws MyException{
        String string = "123567";
        String string2 = "sda55dsad54535";

        System.out.println(parseInt(string));
        System.out.println(parseInt(string2));
    }
}
