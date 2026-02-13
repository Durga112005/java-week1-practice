import java.util.*;
public class LargestofThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest  = a;

        if(b>largest){
            largest = b;
        }
        if(c>largest){
            largest = c;
        }
        System.out.println(largest + " " + "is Largest");

        sc.close();
    }
    
}
