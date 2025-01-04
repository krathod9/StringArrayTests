import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String s="karIIon";
        char[] c=s.toCharArray();
        //int[] arr={2,1,2,2,2,0,4,0,0,5,3};
        int[] arr1={1,2,3,5,6,5};
        char x=Integer.toString(123).charAt(0);
        int[] array1 = {2,3,7,6};
        int[] arr={-1,2,3,6,0,-4,-7};


        //System.out.println(123);
        //findCharOccurance.findOccurance("SILENLENTS");
        //SynecronL1.findSumIndex(array1,9);
                //findOccurance(array1);

    //findDuplicate(arr);
                //subArraySum(arr1,11);
//                IntTest.findMissing(arr1,2);
        IntTest.removeInteger("abd12nba");
        ArrayTest.sortIntArray(arr);
        // reverseStringWordReverse("karan is my name");
                //repeatedChars("karanr");
//        Singleton singleton= Singleton.getInstance();
//        Singleton singleton1=Singleton.getInstance();
        //BuilderVsBuffer.builderbuffercheck();
        //IntTest.disariumNumber(175);
        //int x1=3;
        //StringTests.patternCheck("Karan Is My name");
        // checkPanagramString("aAbcdeghijklmnopqrsftuvwxyzfds");
                //sortStringWOFuntion("karan  is my name");
                //sortString("karan is my name");
        //stringReverseUsingStack("karan is my name");
                //removeLeadingZero("00023430");
                //placeCharInBetween("karan",'T',3);
                //StringTests.swapchars("karan");
                //stringToStringArray("Karan Rathod is my NAME");
                //printChars("karan");
        //System.out.println(s.charAt(2));
                //addCharToString("karan",'T',2);
                //stringReverse("karanrathod");
                //anagramString("karan","rankk");
                //paliandromeString("karak");
                //insertString("karan","rath",2);
        //ArrayTest.evenString("this is mew");
        //System.out.println("We are lean"+"and the " +x1);
        //ArrayTest.substring("karan");
        //IntTest.checkTriplet(arr1);
        //.magicNumber(1251);
        ///ArrayTest.reverseStringWordByWord("My name is karan");
        //IntTest.HarshadNumberCheck(221);
        //System.out.println(s.replaceAll("[AEIOUaeiou]",""));
        //System.out.println(IntTest.paliandrome(12322321));
        //ArrayTest.arrayRotationLeftToRight(arr,3);
        //ArrayTest.longestSubstring("javaconceptoftheday");
        // ArrayTest.swap2Strings("karan","rathod");
        //IntTest.romanNumer(3999);
        //ArrayTest.percentOfLetters("TTTTTTTT12345TTThis is a Test@!# string");
        //System.out.println(Arrays.toString(ArrayTest.seperateZero(arr)));
//        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
//        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
//        ArrayTest.arrayIntersection(s1,s2);

//        System.out.println(IntTest.intCheck("1234.2"));
//        System.out.println(Arrays.equals(arr,arr1));
        //System.out.println(ArrayTest.reverseString("Java J2EE JSP Servlets Hibernate"));
        //System.out.println(ArrayTest.largestNumLessThanGivenNum(123,2));
        //ArrayTest.sumofNumFromArr(arr,5);
        //System.out.println(ArrayTest.secondLargestNumber(arr));
        //System.out.println(ArmstrongCheck.armstrongNumber(153));
        //System.out.println(ArrayTest.checkDuplicate(c));
//        String s = "karan.rath(9292)";
//        char [] array1={'1','3','4','4'};
//        char[] array2={'1','3','4','4','1'};
//        Arrays.sort(array1);
//        Arrays.sort(array2);
//        System.out.println(array1);
//        System.out.println(array2);
//        System.out.println(ArrayTest.arrayEquality(array1,array2));
//        System.out.println(Arrays.equals(array2,array1));
        //String[] ns=s.split("[(]");
        // System.out.println(ns[1].split("[)]")[0]);
        //System.out.println(s.split("[(]")[1].split("[)]")[0]);
        //System.out.println();
        //System.out.println();
        //pyramid(5);
//        String s1="this is a tst st  ";
//        //s1=s1.replaceAll("\\s+","");
//        HashMap<Character,Integer> hs= StringTests.charCountInString(s1);
//        Set <Character> charset= hs.keySet();
//        System.out.println(hs.keySet());
//        for(Character ch : charset){
//            if(hs.get(ch)>1)
//                System.out.println(ch + " "+hs.get(ch));
//        String s1="karan Rathod";
//        String s2="Rathod karan";
//
//        char[] c1=s1.toCharArray();
//        char[] c2=s2.toCharArray();
//        Arrays.sort(c1);
//        Arrays.sort(c2);
//        //System.out.println(Arrays.equals(c1,c2));
//
//        HashMap<Character,Integer> map1=StringTests.charCountInString(s1);
//        HashMap<Character,Integer> map2=StringTests.charCountInString(s2);
        //System.out.println(AnagramTest.checkAnagramString(map1,map2));
        }

    public static void pyramid(int rowct) {
        int n = 1;
        for (int i = rowct; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            n++;
        }
    }

    public static void pyramidUpsideDown(int rowct) {
        int n = 1;
        for (int i = 1; i <= rowct; i++) {
            for (int j = rowct; j >= i; j--) {
                System.out.print(n + " ");
            }
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            n++;
        }
    }

    public static void pyramidLeftSideDown(int rowct) {
        int n = 1;
        for (int i = 1; i <= rowct; i++) {
            for (int j = rowct; j >= i; j--) {
                System.out.print(n);
            }
            System.out.println();
            n++;
        }
    }

    public static void pyramidrightsidedown(int rowct) {
        int n = 1;
        for (int i = 1; i <= rowct; i++) {
            for (int j = rowct; j >= i; j--) {
                System.out.print(n);
            }
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            n++;
        }

    }

    public static void pyramidrightsideUp(int rowct) {
        int n = 1;
        for (int i = rowct; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
            n++;
        }
    }

    public static void pyramidleftsideUp(int rowct) {
        for (int i = 1; i <=rowct; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
