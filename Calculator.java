import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        Scanner Calc= new Scanner(System.in);
        int n1;
        int n2;
        int Answer=0;

        System.out.println("Enter the First Number: ");
        n1=Calc.nextInt();
        System.out.println("Enter the Second Number: ");
        n2=Calc.nextInt();
        System.out.println("Select the operation(+,-,*,/): ");
        char Operator= Calc.next().charAt(0);
        switch(Operator){
            case '+':
            Answer=n1+n2;
            System.out.println("Answer: " +Answer);
            break;

            case '-':
            Answer=n1-n2;
            System.out.println("Answer: " +Answer);
            break;

            case '*':
            Answer=n1*n2;
            System.out.println("Answer: " +Answer);
            break;

            case '/':
            if(n2!=0){
                Answer=n1/n2;
                System.out.println("Answer: " +Answer);
            }
            else{
                System.out.println("Error: Divison by zero is not allowed.");
            }
            break;

            default:
            System.out.println("Invalid Operator. Please use +,-,* or / ");
        }
        Calc.close();
    }
}
