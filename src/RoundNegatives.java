
    import java.util.Scanner;
    public class RoundNegatives {
    public  static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a negative decimal number:");
        double total= kb.nextDouble();
        int real= (int)(total-0.5);
        System.out.print( total+" rounded to a whole number is " +real);



    }
}