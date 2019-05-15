package com.company;

public class demo {
    public static int parseInt(String str){
        int a = 0;
        try{
             a = Integer.parseInt(str);
        }catch (Exception e){
            System.out.println(e);
        }
        return a;

    }

    public static void main(String[] args) {
        String string = "123567";
       String string2 = "sda55dsad54535";

        System.out.println(parseInt(string));
        System.out.println(parseInt(string2));
    }
}
