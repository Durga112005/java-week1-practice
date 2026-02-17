import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int sum = 0;

        if(n < 0){
            System.out.println("Negative numbers are not Palindromes");
            return;
        }
        while(n>0){
            int digit = n%10;
            sum = sum*10 + digit;
            n /= 10;
        }
        System.out.println((original==sum)?"Palindrome":"Not Palindrome");
    }
    
}
