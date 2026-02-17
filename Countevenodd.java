import java.util.*;
public class Countevenodd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         n = Math.abs(n);
        int even = 0,odd = 0;

        if(n == 0){
            even = 1;
        }
        while(n>0){
            int digit = n % 10;
            if(digit % 2 == 0){
                even++;
            }else{
                odd++;
            }
            n /= 10;
        }
        System.out.println("Even Count" + even);
        System.out.println("Odd Count" + odd);
    }
    
}
