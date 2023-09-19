interface Animal{
    void sound();
    void colour();
}

class Cow implements Animal{
    public void sound(){
        System.out.println("cow sound");
    }
}

class First{
    public static void main(String[] args){
        Cow cow=new Cow();
        cow.sound();
        cow.colour();
    }
}