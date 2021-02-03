package com.hubiao.kotlindemo.classesobjects;

public class ObjectTestJavaMain {
    public static void main(String[] args) {
        System.out.println("Object1Main.object1.name = " + Object1Main.object1.name);
        System.out.println("Object1Main.object1.name = " + Object1Main.object1.INSTANCE.getName1());
        System.out.println("Object1Main.object1.name = " + Object1Main.object1.name2);
        Object1Main.object1.INSTANCE.method1();
        Object1Main.object1.method2();

        System.out.println("Object2Main.name = " + Object2Main.name);
        System.out.println("Object1Main.object1.name = " + Object2Main.INSTANCE.getName1());
        System.out.println("Object1Main.object1.name = " + Object2Main.name2);
        Object2Main.INSTANCE.method1();
        Object2Main.method2();

        System.out.println("CompanionObjectMain.name = " + CompanionObjectMain.name);
        System.out.println("CompanionObjectMain.name = " + CompanionObjectMain.Companion.getName1());
        System.out.println("CompanionObjectMain.name = " + CompanionObjectMain.name2);
        CompanionObjectMain.Companion.method1();
        CompanionObjectMain.method2();
    }
}