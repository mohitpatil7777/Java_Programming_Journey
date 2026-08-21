public class _17_AirthmeticOP {
    public static void main(String args[]){
        int A = 10;
        int B =5;
        System.out.println("Addition of A and B is : " + (A + B));
        System.out.println("Subtraction of A and B is : " + (A - B));
        System.out.println("Multiplication of A and B is : " + (A * B));
        System.out.println("Division of A and B is : " + (A / B)); 
        System.out.println("Modulus of A and B is : " + (A % B));    

        //Unary Operators
        //Increment Operator
        int x=10;
        int y=++x; //pre-increment
        System.out.println("Value of x is : " + x);
        System.out.println("Value of y is : " + y);

        int x1=10;
        int y1=x1++; //post-increment
        System.out.println("Value of x1 is : " + x1);
        System.out.println("Value of y1 is : " + y1);

        //Decrement Operator  
        int a1 =10;
        int b1 = --a1; //pre-decrement
        System.out.println("Value of a1 is : " + a1);
        System.out.println("Value of b1 is : " + b1);

        int a2 =10;
        int b2 = a2--; //post-decrement
        System.out.println("Value of a2 is : " + a2);
        System.out.println("Value of b2 is : " + b2);

    }
}