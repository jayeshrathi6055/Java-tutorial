package com.google;

import java.lang.reflect.Method;
import java.util.Scanner;

class Employee{
    private int id,salary;
    private String name;

//    Parameterized Constructor
    Employee(String a,int b,int c){
        name = a;
        id = b;
        salary = c;
    }

//    Default Constructor
    Employee(){
        name = "Tom";
        id = 1;
        salary = 10000;
    }

    public void getdetails(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }
}

class Base{
    int x;
    public void getx(int a){
        x = a;
    }

    public void setx(){
        System.out.println(x);
    }
}

class Derived extends Base{     // extends is used for inheritance
    int y;
    public void gety(int a){
        y = a;
    }

    public void sety(){
        System.out.println(y);
    }
}

public class Basics_of_Java {
//    Making a method/function------------------------------>

    // With static
    static int check(int x,int y){
        if(x==y){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        int z = x+y;
        return z;
    }

    // Without static
    int add(int x,int y){
        int z = x+y;
        return z;
    }

//    Variable argument
    static int add(int ...arr){     //--->Syntax of variable argument is "datatype ...arrayname"
        int result = 0;
        for (int a : arr){
            result += a;
        }
        return result;
    }

//    Recurssion in function
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }


    public static void main(String[] arg){
////        Some Print statement---------------------------------------->
//        System.out.print("Hello ");

//        System.out.println("sir");

//        int a = 20;
//        float b = 0.231f;
//        System.out.printf("The value of a is %d and b is %f",a,b);

//        System.out.format("\nThe value of a is %d and b is %f",a,b); // we can also use %c and %s.

////        Datatypes --------------------------------------------------->
//
//        int a = 1000;
//        long b = 123456789;
//        short c = 120;
//        float d = 43.2f;
//        double e = 3.146592;
//        char f = 'h';
//        String g = "Hello";


////        Features of string----------------------------------------------->
//        String name = "Jay";
//        System.out.println(name.length());
//
//        System.out.println(name.toLowerCase());
//
//        System.out.println(name.toUpperCase());
//
//        String str = "      Jay     ";
//        System.out.println(str.trim());
//
//        System.out.println(name.substring(1));
//        System.out.println(name.substring(1,2));
//
//        System.out.println(name.replace("y","g"));
//        System.out.println(name.replace("Jay","Jayesh"));
//
//        System.out.println(name.startsWith("Ja"));
//        System.out.println(name.endsWith("y"));
//
//        System.out.println(name.charAt(1));
//
//        System.out.println(name.indexOf("a"));
//        String name1 = "Jayeshay";
//        System.out.println(name1.indexOf("a",2));
//
//        System.out.println(name1.lastIndexOf("a"));
//        System.out.println(name1.lastIndexOf("a",5));
//
//        System.out.println(name.equals("Jay"));
//
//        System.out.println(name.equalsIgnoreCase("jay"));

//        Arrays dimensions------------------------------------------------------------>

//        int arr[] = {11,12,13,14,15};  //------->1-D array
//        for (int element : arr){
//            System.out.println(element);
//        }

//        int arr[][] = {{11,12,13},{14,15,16}};  //-------->2-D array
//        for (int i = 0;i< arr.length;i++){
//            for (int j = 0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

//        int arr[][][] = {{{10,11},{12,13}},{{14,15},{16,17}}};  //------>3-D array
//        for (int i = 0;i< arr.length;i++){
//            for (int j = 0;j<arr[i].length;j++){
//                for (int k = 0;k<arr[i][j].length;k++){
//                    System.out.print(arr[i][j][k]+" ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }

////        Method calling---------------------------------------------------->
////        If function is static then----------->
//        int c = check(8,8); //------->1
//        System.out.println(c);

////        If function is not static then------------->
//        Basics_of_Java obj = new Basics_of_Java();   //----->2
//        int d = obj.add(4,5);
//        System.out.println(d);

////        Variable arguments - It is use when we have variable parameters (no required of method overloading)
//        System.out.println("Your sum is "+add(5,6,8,9));
//        System.out.println("Your sum is "+add(5,6,8,9,8,1,2,3));

////        Recurssion in function----------->
//        System.out.println("Your factorial is "+factorial(5));

////      OOPS(classes)-------------------------------------------------------->

////        Constructor---------------->
//        Employee emp = new Employee("Jayesh",24,100000);
//        Employee pme = new Employee();
//        emp.getdetails();
//        pme.getdetails();

////        Inheritance---------------->
//        Derived d = new Derived();
//        d.getx(5);
//        d.setx();
//        d.gety(25);
//        d.sety();

    }
}
