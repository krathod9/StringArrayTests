import java.sql.SQLOutput;
import java.util.*;

public class IntTest {

    public static boolean intCheck(String i){
        try{
            Integer.parseInt(i);
            return true;
        }
        catch(NumberFormatException e){return false;}

    }

    public static ArrayList<Integer> findLeader(int[] arr){
        ArrayList<Integer> ar=new ArrayList<Integer>();
        int counter=0;
        boolean flag=false;
        for(int i=0; i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    flag=true;
                }
                else {
                    flag=false;
                    i=j-1;
                    break;
                }
            }
            if(flag){
                ar.add(arr[i]);
                flag=false;
            }
        }
        ar.add(arr[arr.length-1]);
        return ar;
    }

    public static void romanNumer(int num){
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] decimals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String rom="";
        if(num>0 && num <4000){
            for(int i=0;i<13;i++){
                while(num>=decimals[i]){
                    rom=rom+romanSymbols[i];
                    num=num-decimals[i];
                }
            }
        }
        System.out.println(rom);
    }

    public static boolean paliandrome(int n1){
        char[] c1=String.valueOf(n1).toCharArray();
        int start,end;
        start=0;
        end=c1.length-1;
        while(start<=end){
            if(c1[start]!=c1[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static <Entry> void elementFrequency(int[] inp){
        HashMap<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
        for(int i =0; i<inp.length;i++){
            if(hashMap.containsKey(inp[i])){
                hashMap.put(inp[i],hashMap.get(inp[i])+1);
            }
            else{
                hashMap.put(inp[i],1);
            }
        }
        int freq=1;
        int ele=0;
        for(Map.Entry<Integer,Integer> mapset:hashMap.entrySet()) {
            if(mapset.getValue()>freq){
                freq=mapset.getValue();
                ele=mapset.getKey();
            }

        }
        System.out.println("Freq = "+freq+" Element = "+ele);
    }

    public static void HarshadNumberCheck(int num){
        int sum=0,rem=0,temp=num;
        while(num>0){
            rem=num%10;
            num=num/10;
            sum=sum+rem;
        }
        if(temp%sum==0){
            System.out.println("Harshad Number");
        }
        else System.out.println("Not a Harshad Number");
    }

    public static void magicNumber(int num){
        int sum=0,r;

        while(num>0||sum>9){
            if(num==0){
                num=sum;
                sum=0;
            }
            r=num%10;
            sum=sum+r;
            num=num/10;
        }
        if(sum==1) System.out.println("Magic number");
        else System.out.println("not a magic num");
    }

    public static void checkTriplet(int[] arr){
        HashSet<Integer> hashSet=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            hashSet.add(arr[i]);
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++){
                if(hashSet.contains(arr[i]+arr[j])){
                    System.out.println("Sum  "+arr[i]+ " and " +arr[j]+ " is "+(arr[i]+arr[j]));
                }
            }
        }
    }

    public static void disariumNumber(int num){
        int sum=0;
        int rem,cpy=num;
        int length =String.valueOf(num).length();
        while(num>0){
            rem=num%10;
            sum= (int) (sum+Math.pow(rem,length));
            length--;
            num=num/10;
        }
        if(cpy==sum) System.out.println("Disarium number");
        else System.out.println("Not a disarium number");
    }
}
