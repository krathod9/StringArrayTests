import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class StringTests {

    public static String replaceSpacesFromString(String str){
        return str.replaceAll("\\s+","");
    }

    public static HashMap<Character, Integer> charCountInString(String str){
        HashMap<Character, Integer> newhash= new HashMap<Character, Integer>();
        char[] c= str.toCharArray();
        for(char ch : c){
            if(newhash.containsKey(ch)) newhash.put(ch,newhash.get(ch)+1);
            else newhash.put(ch,1);
        }
        return newhash;
    }
    public static void evenString(String str){
        String[] chars=str.split("\\s");
        for(String c: chars){
            if(c.length()%2==0){
                System.out.print(c+" ");
            }
        }
    }
    public static void insertString(String str1, String str2, int index) {
        int len = str1.length() + str2.length();
        char[] chars = new char[len];
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        int j =0;
        int c2len=c2.length;
        int k=0;
        for (int i = 0; i < len; i++) {
            if (i == index) {
                while (c2len>0) {
                    chars[i] = c2[j];
                    i++;
                    j++;
                    c2len--;
                }
            }
            chars[i]=c1[k];
            k++;
        }
        System.out.println(chars);
    }

    public static void paliandromeString(String str){
        int end=str.length()-1;
        int start=0;
        boolean flag=true;
        while(end>=start){
            if(str.charAt(start)!=str.charAt(end)) flag=false;
            start++;
            end--;
        }
        if(flag) System.out.println("paliandrome string");
    }

    public static void anagramString(String str1, String str2){
        char[] cstr1=str1.toCharArray();
        char[] cstr2=str2.toCharArray();
        if(str1.length()!=str2.length()) System.out.println("Not anagram");
        else{
            Arrays.sort(cstr1);
            Arrays.sort(cstr2);
            if(Arrays.equals(cstr1,cstr2)) System.out.println("Anagram string");
            else System.out.println("Not anagram");
        }
    }
    public static void stringReverse(String str){
        String newstr = "";
        for(int i=str.length()-1;i>=0;i--){
            newstr+=str.charAt(i);
        }
        System.out.println(newstr);
    }

    public static void addCharToString(String str, char c, int index){
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.insert(index,c);
        System.out.println(stringBuilder);
    }

    public static void printChars(String str){
        CharacterIterator characterIterator=new StringCharacterIterator(str);
        while(characterIterator.current()!=CharacterIterator.DONE){
            System.out.print(characterIterator.current()+" ");
            characterIterator.next();
        }
    }

    public static void stringToStringArray(String str){
        String[] str1=str.split(" ");
        for(int i =0; i<str1.length;i++){
            System.out.print(str1[i]+ " ");
        }
    }
    public static void swapchars(String str){
        char temp;
        char[] c=str.toCharArray();
        for(int i=0; i<str.length()-2;i+=2){
            temp=str.charAt(i);
            c[i]=c[i+1];
            c[i+1]=temp;
        }
        System.out.println(c);
    }

    public static void placeCharInBetween(String str, char c, int index){
        System.out.println(str.substring(0,index)+c+str.substring(index+1));
    }

    public static void removeLeadingZero(String num){
        int n=0;
        for(int i=0;i<num.length();i++) {
            if (num.charAt(i) != '0') {
                n = i;
                break;
            }
        }
        System.out.println(num.substring(n));
    }

    public static void stringReverseUsingStack(String str){
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        while(!stack.empty()){
            System.out.print(stack.pop());
        }
    }

    public static void sortString(String str){

    }
}
