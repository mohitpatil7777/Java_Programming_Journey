import java.util.Scanner;

public class _26_LargestOf3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int A = 1, B =3, C =6;

        if (A >= B && A >= C){
            System.out.println("largest is A");
        }
        else if (B >= A && B >= C){
            System.out.println("largest is B");
        }
        else{
            System.out.println("largest is C");
        }
      
    }
}