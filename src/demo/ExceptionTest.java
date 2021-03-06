package demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by teacher
 * 8:43 2016/4/15.
 */
public class ExceptionTest {

    private int i;

    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        String[] strings = {"hello", "hi"};
//        System.out.println(strings[2]); // ArrayIndexOutOfBoundsException

        String s = "hello";

        ExceptionTest exceptionTest = new ExceptionTest();
//        exceptionTest = null;
        try {
//            System.out.println(s.charAt(5)); // StringIndexOutOfBoundsException
//            System.out.println(exceptionTest.i); // NullPointerException NPE
//            System.out.println(x / y); // ArithmeticException
            System.out.println("demo..."); //
        } catch (NullPointerException e) {
//            ...
            System.out.println(1);
        } catch (ArithmeticException e) {
//            ...
            System.out.println(2);
            e.printStackTrace();
        } finally {
            System.out.println("finally...");
        }
        System.out.println("test...");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("sdfg", "rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end...");

        try {
            exceptionTest.method();
            exceptionTest.test();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
//显式
    public void method() throws InterruptedException {
        System.out.println("method...");
        throw new ArithmeticException();
    }

    public void test() throws InterruptedException {
        method();
    }
}

//java.lang.NullPointerException
//        at demo.ExceptionTest.main(ExceptionTest.java:25)

//    Exception in thread "main" java.lang.NullPointerException
//        at demo.ExceptionTest.main(ExceptionTest.java:25)
