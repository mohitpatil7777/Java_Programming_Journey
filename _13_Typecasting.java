import java.util.*;

public class _13_Typecasting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a=25.12f;
        int b=(int)a; //typecasting
        System.out.println(b);

        //typecasting of character to integer
        char ch='a';
        int number = ch;
        System.out.println(number);
        sc.close();
    }
}
