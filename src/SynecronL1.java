import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SynecronL1 {
    public static void findOccurance(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
    }

    public static void findSumIndex(int[] arr, int sum){
        ArrayList<Integer> arrayList=new ArrayList<>();
        int s=0;
        int j=0;
        for(int i=0;i<arr.length;i++) {
            for(int k=i+1;k<arr.length;k++){
                if(arr[i]+arr[k]==sum){
                    arrayList.add(i);
                    arrayList.add(k);
                    System.out.println(arrayList);
                    arrayList.clear();
                }
            }
        }
    }
}
