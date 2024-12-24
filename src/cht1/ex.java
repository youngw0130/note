package cht1;

import java.sql.SQLOutput;

class Animal {
    public void makeSound() {
        System.out.println("몇몇동물소리");
    }
    public void eat() {
        System.out.println("동물들이 먹는것들");
    }
}

abstract class Dog extends Animal {
    abstract void name();
    public void makeSound() {
        System.out.println("멍멍,왈왈");
    }
    public void eat() {
        System.out.println("개사료 등을 먹습니다");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
    @Override
    public void eat() {
        System.out.println("츄르,고양이 사료 등을 먹어요");
    }
}

public class ex {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            void name() {
                System.out.println("시리");
            }
        };
        Animal animal2 = new Animal() {
            void name() {
                System.out.println("빅스비");
            }
        };
    }
}

