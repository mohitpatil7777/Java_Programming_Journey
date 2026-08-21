import java.util.Scanner;

public class _25_Income_Tax_Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income: ");
        int income = sc.nextInt();
        int tax; // to get the tax amount in integer format

        if(income <= 500000){
            tax = 0;
        }
        else if(income >= 500000 && income <= 1000000){
            tax = (int)(income * 0.2); // typecasting to convert double to int
        }
        else{
            tax = (int)(income * 0.3);
        }

        System.out.println("your tax is: " + tax);
    }
}