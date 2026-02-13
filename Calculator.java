import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number:");
        int num1 = sc.nextInt();

        System.out.print("Choose the operation to be performed( +, -, *, / ):");
        char operation = sc.next().charAt(0);

        System.out.print("Enter the 2nd Number:");
        int num2 = sc.nextInt();
        double result;

        switch(operation){
            case '+':
                result = num1 + num2;
                System.out.println("Addition :" +result);
                break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Subtraction :" +result);
                    break;
                    case '*':
                        result = num1 * num2;
                        System.out.println("Multiplication :" + result);
                        break;
                        case '/':
                            if(num2!=0){
                                result = num1/num2;
                                System.out.println("Division :" +result);
                            }else{
                                System.out.println("Division not applicable");
                            }
                            default:
                                System.out.println("Invalid Operation");

        }

    }
    
}
