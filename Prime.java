import java.util.*;
public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("Not Prime");
            return;
        }
        boolean b = true;
        for(int i=2;i<n;i++){
            if(n%i == 0){
            b = false;
            break;
        }
        
    }
    if(b){
        System.out.println("Prime");
    }else{
        System.out.println("Not Prime");
    }
    
}
}

