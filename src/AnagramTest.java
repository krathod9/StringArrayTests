import java.util.HashMap;
import java.util.Set;

public class AnagramTest {
    public static boolean checkAnagramString(HashMap<Character,Integer> mapString1,HashMap<Character,Integer> mapString2){
        Set<Character> st=mapString1.keySet();
        if(mapString1.size()==mapString2.size()){
            for(char ch: st){
                if(mapString1.get(ch)!=mapString2.get(ch)) return false;
            }
        }
        else return false;

        return true;
    }
}
