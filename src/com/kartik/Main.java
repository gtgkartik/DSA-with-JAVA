package com.kartik;

import com.kartik.Animal;
public class Main {

    public static void main(String[] args) {
        Message m1 = new Message() ;
        Animal a1 = new Animal();
        a1.talk();
        m1.hello();
    }
}

class Message {
    static void hello(){
        System.out.println("Helo world");
    }
}
