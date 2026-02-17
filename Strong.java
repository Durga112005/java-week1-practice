import java.util.*;
public class Strong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        
        if(n<0){
            System.out.println("Strong number is defined only for non-negative integers");
            return;
        }

        if(n == 0){
            sum = 1;
        }

        while(n>0){

            int digit = n % 10;
            int fact = 1;
            for(int i=digit;i>0;i--){
                fact *= i;
            }
             sum += fact;
             n /= 10;
        }
        if(sum == original){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not a Strong Number");
        }
        sc.close();
    }
    
}
