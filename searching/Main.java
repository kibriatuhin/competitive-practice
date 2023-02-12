package searching;


public class Main {
    void m1(String o){
        System.out.println("Object");
    }
    void m1(Integer integer){
        System.out.println("Integer");
    }

    public static void main(String[] args) {
        Main ob = new Main();
        //ob.m1( null);
    }
}

class Parent{
    void m1(){
        System.out.println("parent class method");
    }
}
class Child extends  Parent{
    void m1(){
        System.out.println("child class method");
    }

    public static void main(String[] args) {
        Child ob = (Child) new Parent();
        ob.m1();
    }
}