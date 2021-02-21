package com.hubiao.kotlindemo.exception;

public class TryCatchFinallyTestJavaMain {
    public static void main(String[] args) {
        TryCatchFinallyTestJavaMain tryTest = new TryCatchFinallyTestJavaMain();

        int result1 = tryTest.tryCatchFinallyFunction1();
        int result2 = tryTest.tryCatchFinallyFunction2();

        String result3 = tryTest.tryCatchFinallyFunction3();
        String result4 = tryTest.tryCatchFinallyFunction4();
        String result5 = tryTest.tryCatchFinallyFunction5();

        StringBuilder result6 = tryTest.tryCatchFinallyFunction6();
        StringBuilder result7 = tryTest.tryCatchFinallyFunction7();

        System.out.println("test1.tryCatchFinallyFunction1()  = " + result1);
        System.out.println();
        System.out.println("test1.tryCatchFinallyFunction2()  = " + result2);
        System.out.println();

        System.out.println("test1.tryCatchFinallyFunction3()  = " + result3);
        System.out.println();
        System.out.println("test1.tryCatchFinallyFunction4()  = " + result4);
        System.out.println();
        System.out.println("test1.tryCatchFinallyFunction5()  = " + result5);
        System.out.println();

        System.out.println("test1.tryCatchFinallyFunction6()  = " + result6);
        System.out.println();
        System.out.println("test1.tryCatchFinallyFunction7()  = " + result7);
        System.out.println();
    }

    // return处是生成了一个内存空间，除非后续的return返回不同内容，否则里面的值是不会改变的，不论存储的是基本类型还是引用类型
    public int tryCatchFinallyFunction1() {
        try {
            return 0;
        } finally {
            return 2;
        }
    }

    public int tryCatchFinallyFunction2() {
        var i = 0;

        try {
            return i;
        } finally {
            i = 2;
        }
    }

    public String tryCatchFinallyFunction3() {
        try {
            return "C";
        } finally {
            return "Java";
        }
    }

    public String tryCatchFinallyFunction4() {
        var str = "C";
        try {
            return str;
        } finally {
            str = "Java";
        }
    }

    // String自身的修改，其实是指向了常量池里的新的地址
    public String tryCatchFinallyFunction5() {
        var str = "C";
        try {
            return str;
        } finally {
            str += "Java";
        }
    }

    public StringBuilder tryCatchFinallyFunction6() {
        StringBuilder str = new StringBuilder("C");
        try {
            return str;
        } finally {
            str = new StringBuilder("Java");
        }
    }

    public StringBuilder tryCatchFinallyFunction7() {
        StringBuilder str = new StringBuilder("C");
        try {
            return str;
        } finally {
            str.append(", Java");
        }
    }
}