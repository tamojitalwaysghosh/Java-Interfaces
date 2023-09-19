interface First{
    void show1();
}

interface Second extends First{
    void show2();
}

class MyClass implements Second{
    public void show1(){
        System.out.println("from inherited interface");
    }
    public void show2(){
        System.out.println("second interface");
    }
}

public class Fourth {

    public static void main(String[] args)
	{
        MyClass myClass=new MyClass();
        myClass.show1();
        myClass.show2();
	}
}
