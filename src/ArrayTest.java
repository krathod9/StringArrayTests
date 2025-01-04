import java.util.*;
import java.util.logging.Logger;

public class ArrayTest {
    public static boolean arrayEquality(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) return false;
            }
        } else return false;
        return true;
    }

    public static boolean checkDuplicate(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) return false;
            }
        }
        return true;
    }

    public static int secondLargestNumber(int[] arr) {
        int big2, big1;
        big1 = (arr[0] > arr[1] ? arr[0] : arr[1]);
        big2 = (arr[0] > arr[1] ? arr[1] : arr[0]);
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > big1) {
                big2 = big1;
                big1 = arr[i];
            } else if (arr[i] > big2) {
                big2 = arr[i];
            }
        }
        return big2;
    }

    public static int largestNumLessThanGivenNum(int num, int dig) {
        char c = Integer.toString(dig).charAt(0);
        for (int i = num; i > 0; --i) {
            if (Integer.toString(i).indexOf(c) == -1) {//if digit is ot found
                return i;
            }
        }
        return -1;
    }

    public static void sumofNumFromArr(int[] arr, int sum) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " + " + arr[j] + " give sum " + sum);
                }
            }
        }
    }

    public static String reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }

    public static void arrayIntersection(String[] s1, String[] s2) {
        Set<String> set1 = new HashSet<String>();
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i] == s2[j]) {
                    set1.add(s1[i]);
                }
            }
        }
        System.out.println(set1);
    }

    public static int[] seperateZero(int[] arr) {
        int counter = 0;
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                res[counter] = arr[i];
                counter++;
            }
        }
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != 0) {
                res[counter] = arr[i];
                counter++;
            }
            i++;

        }
        return res;
    }


    public static void percentOfLetters(String str) {
        char[] ch = str.toCharArray();
        int i = 0;
        int up = 0, lw = 0, dg = 0, sp = 0;
        for (i = 0; i < ch.length; i++) {
            if (Character.isUpperCase(ch[i])) {
                up++;
            } else if (Character.isLowerCase(ch[i])) {
                lw++;
            } else if (Character.isDigit(ch[i])) {
                dg++;
            } else {
                sp++;
            }
        }
        float percent = (up * 100) / str.length();
        System.out.printf("Uppercase count = " + String.valueOf(up) + " average " + percent);
        System.out.printf("Lowercase count = " + String.valueOf(lw) + " average " + String.valueOf((lw * 100) / str.length()));
        System.out.printf("Digit count = " + String.valueOf(dg) + " average " + String.valueOf((dg * 100) / str.length()));
        System.out.printf("Special Char count = " + String.valueOf(sp) + " average " + String.valueOf((sp * 100) / str.length()));
    }

    public static void swap2Strings(String s1, String s2) {
        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.println(s1);
        System.out.println(s2);
    }

    public static void longestSubstring(String inputString) {
        char[] charArray = inputString.toCharArray();
        String longestSubstring = null;
        int longestSubstringLength = 0;
        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (!charPosMap.containsKey(ch)) {
                charPosMap.put(ch, i);
            } else {
                i = charPosMap.get(ch);
                charPosMap.clear();
            }
            if (charPosMap.size() > longestSubstringLength) {
                longestSubstringLength = charPosMap.size();
                longestSubstring = charPosMap.keySet().toString();
            }
        }
        System.out.println("Input String : " + inputString);
        System.out.println("The longest substring : " + longestSubstring);
        System.out.println("The longest Substring Length : " + longestSubstringLength);
    }

    public static void repeatedChars(String str) {
        char[] c = str.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        for (char x : c) {
            if (hm.containsKey(x)) {
                hm.put(x,hm.get(x)+1);
            }
            hm.put(x, 1);
        }
        System.out.println(hm.keySet());
    }

    public static void arrayRotationRightToLeft(int[] arr, int n) {
        int temp;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arrayRotationLeftToRight(int[] arr, int n) {
        int temp;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseStringWordByWord(String str) {
        String[] str1 = str.split("[\\s]");
        for (int i = str1.length - 1; i >= 0; i--) {
            System.out.print(str1[i]+" ");
        }
    }

    public static void reverseStringWordReverse(String str) {
        String[] str1 = str.split("[\\s]");
        for (int i = 0; i <str1.length; i++) {
            char[] c= str1[i].toCharArray();
            for(int j=c.length-1; j>=0;j--){
                System.out.print(c[j]);
            }
            System.out.print(" ");
        }
    }
    public static void substring(String str){
        char[] chars=str.toCharArray();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
    public static void sortIntArray(int[] array){
        int temp;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
