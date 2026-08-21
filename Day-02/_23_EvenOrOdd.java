import java.util.Scanner;

public class _23_EvenOrOdd {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
}