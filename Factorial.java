import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fact = 1;

        if(n<0){
            System.out.println("Factorial not defined for negative numbers");
        }else{
            for(int i=1 ; i<=n ; i++){
                fact *= i;
            }
            System.out.println("Factorial :" + fact);
        }
    }
    
}
