public class _24_If_ElseIf_Else {
    public static void main(String args[]){
        int age =23;

        if(age >= 18){
            System.out.println("adult");
        }
        else if(age >= 13 && age < 18){
            System.out.println("teenager"); //efficient way to write multiple conditions using else if
        }
        else{
            System.out.println("child");
        }
    }
}