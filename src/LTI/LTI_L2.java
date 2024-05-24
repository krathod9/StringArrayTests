package LTI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//find longest substring length
public class LTI_L2 {
    public static void substring(){
        String str="    ";
        ArrayList<Character> arrayList=new ArrayList<>();
        char[] ch = str.toCharArray();
        int max=0;
        int size=0;
        for(int i=0;i<ch.length;i++){
          if(arrayList.contains(ch[i])){
              if(max<arrayList.size()) {
                  max = arrayList.size();
              }
              arrayList.clear();
              arrayList.add(ch[i]);
          }
          else{
              arrayList.add(ch[i]);
              max = arrayList.size();
          }
        }
        System.out.println(max);
    }
}
