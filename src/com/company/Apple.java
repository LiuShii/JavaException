package com.company;


public class Apple {

    private String color;
    private int weight;
    public Apple(String color,int weight){
        this.color = color;
        this.weight = weight;
    }

    public static void ConsumerApple(Apple[] apps,Consumer<Apple> c){
        for(Apple app:apps){
            c.accept(app);
        }
    }

    public static void main(String[] args) {


        Apple[] apps=new Apple[]{
                new Apple("blue",15),
                new Apple("red",20),
                new Apple("green",150)
        };



        ConsumerApple(apps, new Consumer<Apple>() {
            @Override
            public void accept(Apple apple) {
                System.out.println(apple.color+" "+apple.weight);
            }
        });


    }

}
