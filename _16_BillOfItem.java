import  java.util.*;

public class _16_BillOfItem {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("Total bill is : " + total);

        float newTotal = total + (0.18f * total);
        System.out.println("Total bill after GST is : " + newTotal);

        sc.close();

        
    }
    
}
