package com.firstjavaprogram;

public class LivingBeing {

    public static void main(String args[]){
        Human kartik = new Human();
        kartik.talk();
        Animal lion = new Animal();
        lion.talk();
    }
}

class Human {
    void talk(){
        System.out.print("Humans can talk ");
    }


}

class Animal {
    void talk(){
        System.out.print("Animals cannot talk ");
    }
}
