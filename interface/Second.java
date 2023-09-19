interface FirstInterface{
    public void myMethod();
}

interface SecondInterface{
    public void myOtherMethod();
}

class Demo implements FirstInterface,SecondInterface{
    public void myMethod(){
        System.out.println("FirstInterface");
    }
    public void myOtherMethod(){
        System.out.println("SecondInterface");
    }
}

class A{
    public void classMethod(){
        System.out.println("classMethod");
    }
}

class B extends A implements FirstInterface{
    public void myMethod(){
        System.out.println("Inside Class FirstInterface");
    }
    public void classMethod(){
        System.out.println("Inside Class classMethod");
    }
}

public class Second {
    public static void main(String[] args){
        Demo myObj=new Demo();
        myObj.myMethod();
        myObj.myOtherMethod();
        A a=new A();
        a.classMethod();
        B b=new B();
        b.myMethod();
        b.classMethod();
    }
}
