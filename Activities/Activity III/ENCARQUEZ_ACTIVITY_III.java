import java.util.Scanner;

public class ENCARQUEZ_ACTIVITY_III{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Celcius");

        int temp = sc.nextInt();
        if (temp>=100){
            System.out.println("Boiling");
            

        }else {System.out.println("Not Boiling");}
    }

}