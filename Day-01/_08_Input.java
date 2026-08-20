import java.util.*;

public class _08_Input {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        System.out.println(name);

        String name1 = sc.nextLine();
        System.out.println(name1);

        int number = sc.nextInt();
        System.out.println(number);

        float f = sc.nextFloat();
        System.out.println(f);

        boolean var = sc.nextBoolean();
        System.out.println(var);
            
        sc.close();
    }
} 
    

