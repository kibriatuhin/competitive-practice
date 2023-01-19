package oop;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


class FunctionalInterface{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=5 ; i<10 ; i++)
            list.add(i);
        list.add(6);
        list.add(8);

      list.stream().filter(i->i%2!=0).forEach(System.out::println);

    }
}

class Parent{
   private int n=100;
   private String name = "tuhin";
   private void m1(){
       System.out.println("parent privae method");
   }
}
class Child extends Parent{

}
class Main{
    public static void main(String[] args) {
        Child ob = new Child();
        System.out.println(ob);
    }
}
abstract class Tuhin{

}

interface ParentTest{
    void method();
}
interface ParentTest2 {
    void method();
}
class ChildTest implements ParentTest,ParentTest2{

    @Override
    public void method() {
        System.out.println("tuhin");
    }
}
class MainTest{
    public static void main(String[] args) {

    }
}