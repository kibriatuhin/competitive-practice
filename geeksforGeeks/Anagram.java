package geeksforGeeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {
    public static boolean isAnagram(String a,String b)
    {
        if (a.length() != b.length()){
            return false;
        }
        char[] ch = a.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> map1 = new HashMap<>();
        for (int i=0 ;i<b.length() ; i++){
            map.put(b.charAt(i),map.getOrDefault(b.charAt(i),0)+1);
            map1.put(a.charAt(i),map.getOrDefault(a.charAt(i),0)+1);
        }
        System.out.println(map);
        System.out.println(map1);
        for (int i=0 ;i< ch.length ;i++){
            if (!(map.containsKey(ch[i]) == map1.containsKey(ch[i])) && (map.get(ch[i]) == map1.get(ch[i]))){
                return  false;
            }
        }
        return true;
    }
    public static boolean isAnagram1(String a,String b){
        if (a.length() != b.length()){
            return false;
        }
        List<Character> list = new ArrayList<>();

        for (int i=0 ;i< b.length() ;i++){
            list.add(b.charAt(i));
        }
        //System.out.println(list.indexOf('s'));
        for (int i = 0 ; i<a.length() ; i++){
            char ch = a.charAt(i);
            if (!list.contains(ch)){
                return false;
            }
            list.remove(list.indexOf(ch));
        }
        //System.out.println(list);
        if (list.isEmpty()){
            return true;
        }

        return true;
    }
    public static void main(String[] args) {
        String a = "swalrl";
        String b = "lsrasw";

        System.out.println(isAnagram1(a,b));
    }
}
