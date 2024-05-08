public class ArmstrongCheck {
    public static boolean armstrongNumber(int num){
        int len = String.valueOf(num).length();
        int sum=0;
        int n=num;
        while(num!=0){
            int m=num%10;
            sum=sum + (int)Math.pow(m,len);
            num=num/10;
        }

        return n==sum;
    }
}
