package geeksforGeeks;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeting {
    static char nonrepeatingCharacter(String S) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < S.length(); i++) {
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        }

        //System.out.println(map);
        int count =0;
        for (Map.Entry<Character,Integer> m : map.entrySet()){
            if (m.getValue() >= 2){
                count++;
            }
        }
        if (count >0){
            for (Map.Entry<Character,Integer> m : map.entrySet()){
                if (m.getValue() == 1){
                    return m.getKey();
                }
            }
        }

        return '$';
    }

    public static void main(String[] args) {
        System.out.println(nonrepeatingCharacter("zxvczbtxyzvy"));

    }
}
