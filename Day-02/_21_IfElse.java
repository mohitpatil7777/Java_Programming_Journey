public class _21_IfElse {
    public static void main(String args[]){
        int age =23;
        
        if(age >= 18){
            System.out.println("adult: drive, vote");
        }

        if(age >= 13 && age < 18){
            System.out.println("teenager"); //we can write multiple if statements but it is not a good practice
        }

        else{
            System.out.println("child");
        }
    }
}