package geeksforGeeks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RomanNumberToInteger {
    public static int romanToDecimal(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i=0 ;i<str.length() ;i++){
            stack.push(str.charAt(i));
        }
        int result =0;
        while (!stack.empty()){
            if (stack.peek() == 'I'){
                result +=1;
                stack.pop();
            } else if (stack.peek() == 'V'){
                stack.pop();
                if (stack.peek() == 'I'){
                    result = result + (4);
                    stack.pop();
                }else {
                    result += 5;
                }
            }else if (stack.peek() == 'X'){

                stack.pop();
                if (stack.peek() == 'I'){
                    result += 9;
                    stack.pop();
                }else {
                    result +=10;
                }
            }else if (stack.peek() == 'L'){
                result +=50;
                stack.pop();
            }else if (stack.peek() == 'C'){
                result +=100;
                stack.pop();
            }else if (stack.peek() == 'D'){
                result +=500;
                stack.pop();
            }else if (stack.peek() == 'M'){
                result +=1000;
                stack.pop();
            }
        }
        System.out.println(result);
        return result;
    }
    public static int romanToDecimal1(String str){
        int result =0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for (int i=0 ; i< str.length() ; i++){
            if ( i<str.length()-1 && map.get(str.charAt(i)) < map.get(str.charAt(i+1))){
                result += map.get(str.charAt(i+1))-map.get(str.charAt(i));
                i++;
            }else {
                result +=map.get(str.charAt(i));
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        romanToDecimal1("MMMDCCXCIV");
    }
}
