import java.util.*;
public class Wordpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s  = sc.nextLine().toLowerCase();
        String rev = "";

        for(int i=s.length()-1;i>=0 ; i--){
            rev += s.charAt(i);
        }

        System.out.println((rev.equals(s))?"palindrome" : "not a palindrome");
        sc.close();
    }
    
}
