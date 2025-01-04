import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Synecron {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(-1,0,1,-2,-3,-4,-5,6,-7,-8,0,9,-1));
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)<0){
                arrayList.remove(i);
                i=0;
            }
        }
        System.out.println(arrayList);
    }
}
