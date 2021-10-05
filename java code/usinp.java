
import java.util.Scanner;
 class usinp{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some number");
        int user_number=scan.nextInt();
        System.out.println("The entered value is");
        System.out.print(user_number);



         Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter some decimal value");
        double user_number_double=scan1.nextDouble();
        System.out.println("The entered value is");
        System.out.print(user_number_double);



        
         Scanner scan12 = new Scanner(System.in);
        System.out.println("Enter some decimal value");
        String user_string=scan1.nextLine();
        System.out.println("The entered String is");
        System.out.print(user_string);
    }
}