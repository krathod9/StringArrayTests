import java.util.HashMap;
import java.util.Map;

public class findCharOccurance {
    public static void findOccurance(String str){
        char[] chars=str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char c: chars){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
