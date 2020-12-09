interface bicycle{    //-----------------------> interface method is used here
    int a = 45;
    void brake(int decrement);
    void speed(int increment);
}
class Cycle implements bicycle{
    public void horn(){
        System.out.println("peeeeeeeeeeeeeeeeee");
    }
    public void brake(int decrement){
        System.out.println("brake");
    }
    public void speed(int increment){
        System.out.println("speed");
    }
}

abstract class Base{  //-----------------------> Abstract method is used here
    Base(){
        System.out.println("I am base class constructor");
    }
    abstract void greet();
}
class Derived2 extends Base{
    Derived2(){
        System.out.println("I am derived2 class constructor");
    }
    public void greet(){
        System.out.println("Good morning");
    }
}
abstract class Derived3 extends Base{
    Derived3(){
        System.out.println("I am derived3 class constructor");
    }
}

class Phone{
    public void greet(){
        System.out.println("Good morning");
    }
    public void on(){
        System.out.println("Phone on......");
    }
}
class Smartphone extends Phone{
    public void music(){
        System.out.println("Play Music");
    }
    public void on(){
        System.out.println("Smartphone on......");
    }
}

class ReturnNone {
//    Use of this keyword
    int a;
    ReturnNone(int b){
        this.a = b;        //------------------>This keyword is used here
    }
    public int returnnone(){
        int c = this.a;
        return c;
    }
}

class Base1{
    int x;
    public Base1(){
        System.out.println("I am base class constructor");
    }

    public Base1(int a){
        System.out.println("I am base class constructor with value "+a);
    }
}
class Derived1 extends Base1 {     // extends is used for inheritance
    int y;
    public Derived1(){
        super(20);              // super is used to call parameterized constructor of base class
        System.out.println("I am derived class constructor");
    }

    public Derived1(int b){
        super(50);
        System.out.println("I am derived class constructor with value "+b);
    }
}

public class Basics_of_java2 {
    public static void main(String[] args) {
////        Constructor in inheritance---------------------------------->
//        // Without super it will call default constructor of base class
//        // With super it will call Parameterized constructor of base class
//        Derived1 d1 = new Derived1();
//        Derived1 d2 = new Derived1(60);

////        Use of this Keyword ------------------------------------------>
//        ReturnNone obj = new ReturnNone(20);
//        int d = obj.returnnone();
//        System.out.println(d);

////        Dynamic method Dispatch -------------------------------------->
//        Phone obj = new Smartphone();
//        obj.greet();    // allowed
//        obj.on();      // allowed
////        obj.music();  // Not allowed

////        Abstract Methods---------------------------------------------->
////        Abstract - it means those methods are not ready for implement. For implementation it need a concrete class.
////        Base obj = new Base(); //-------> not allowed (because it is abstract class)
//        Derived2 obj = new Derived2();  //-----> allowed (because it is concrete class)
////        Derived3 ob = new Derived3();  //------> not allowed (because it is abstract class)
//        Base o = new Derived2();  //-----> allowed
////        Base o = new Derived3();  // -----> not allowed

////        Interface method ----------------------------------------------->
////        Interface is a medium of meet and interaction of 2 systems.
////        Note -> Interface properties must be in public in other class
//        Cycle obj= new Cycle();
////        You can create properties in interface
//        obj.brake(1);
//        System.out.println(obj.a);
////        You cannot change the properties of interface because it is final but you can override in inheritance class
////        obj.a = 40; //----> Give Error


    }
}
