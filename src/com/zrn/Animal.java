package com.zrn;

/**
 * Created by Administrator on 2017/10/30.
 */
public class Animal {
    public void eat() {
    }

    public void roam() {
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Dog();//可以将父类引用指向各个子类对象
//        animals[1] = new Cat();
//        animals[2] = new Wolf();
//        animals[3] = new Hippo();
//        animals[4] = new Lion();
        for (int i = 0; i < animals.length; i++) {//可以用数组的方式将子类对象逐个调出来当做是父类操作
            animals[i].eat();//当i为0的时候可以调用dog的eat
            animals[i].roam();//当i为1的时候可以调用cat的roam
        }
    }
}
