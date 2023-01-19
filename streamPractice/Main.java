package streamPractice;

import java.util.Arrays;

public class Main {
}

class Employee{
    String name ;
    int salary ;

}
class Test{
    public static void main(String[] args) {
        int[] array = {6,3,6,2,1,1,9};
        Arrays.stream(array).sorted().distinct().forEach(i-> System.out.print(i + " "));
    }
}