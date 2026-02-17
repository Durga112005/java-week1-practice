import java.util.*;
public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = Math.abs(n);
        int rev = 0;
        while(temp>0){
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        if(n<0){
            rev = -rev;
        }
        System.out.println(rev);
        sc.close();
    }
    
}
