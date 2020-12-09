package com.google;

class Mythread3 implements Runnable{
    public void run(){
        int i = 0;
        while(i<400){
            System.out.println("This is Thread3");
            i++;
        }
    }
}
class Mythread4 implements Runnable{
    public void run(){
        int i = 0;
        while(i<400){
            System.out.println("This is Thread4");
            i++;
        }
    }
}

class Mythread1 extends Thread{
    public void run(){
        while(true){
            System.out.println("Infinity loop");
        }
    }
}
class Mythread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Undefined");
        }
    }
}

interface Call{
    void Incommingcall();
    void Outgoingcall();
}
interface Messages{
    void Incommingmessages();
    void Outgoingmessages();
}
class Phone implements Call,Messages{
    public void Incommingcall(){
        System.out.println("Get a call");
    }
    public void Incommingmessages(){
        System.out.println("Get a message");
    }
    public void Outgoingmessages(){
        System.out.println("Messaging...");
    }
    public void Outgoingcall(){
        System.out.println("Calling...");
    }
}

interface Sample1{
    void method1();
    void method2();
}
interface Sample2 extends Sample1{    //----->Inheritance in Interfaces
    void method3();
}
class Samples implements Sample2{
    public void method1(){
        System.out.println("This is method 1");
    }
    public void method2(){
        System.out.println("This is method 2");
    }
    public void method3(){
        System.out.println("This is method 3");
    }
}

interface Camera{
    void photo();
    void record();
    private void greet(){
        System.out.println("Good morning");
    }
    default void screenshot(){          //----->Default is used here
        greet();
        System.out.println("Taking screenshot");
    }
}
class Smartphone implements Camera{
    public void photo(){
        System.out.println("Taking photo");
    }
    public void record(){
        System.out.println("Recording on");
    }
}

public class Basics_of_java3 {

    public static void main(String[] args) {
////        Default methods in interfaces - It overcomes the problem of changing in all classes which implement
////                                        interfaces.
////        We can also overide this default method in classes.
//        Smartphone obj = new Smartphone();
//        obj.photo();
//        obj.record();
//        obj.screenshot();  //---->Default method

////        Inheritance in Interfaces
//        Samples obj = new Samples();
//        obj.method1();
//        obj.method2();
//        obj.method3();

////        Polymorphism in Interface/Dynamic dipatch method
//        Call obj = new Phone();
//        obj.Incommingcall();
//        obj.Outgoingcall();
////        obj.Incommingmessages();  //--->Error
////        obj.Outgoingmessages();   //--->Error

////        Multithreading - It will run program concurrently (that means it will not waste time on same function)
////        Method 1-------> By extends Thread class
//        Mythread1 t1 = new Mythread1();
//        Mythread2 t2 = new Mythread2();
//        t1.start();
//        t2.start();
////        Method 2-------> By implement Runnable interface
//        Mythread3 x1 = new Mythread3();
//        Thread y1 = new Thread(x1);
//        Mythread4 x2 = new Mythread4();
//        Thread y2 = new Thread(x2);
//        y1.start();
//        y2.start();

    }
}
