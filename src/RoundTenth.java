
    import java.util.Scanner;
    public class RoundTenth {
    public  static void main(String[] args) {

        Scanner tenth = new Scanner(System.in);
        System.out.println("Decimal number?");
        double total= tenth.nextDouble();
        double multiply = total*10;
        int roundednumber= (int)(multiply+0.5);
        double real = roundednumber/10.0;
        System.out.print(total+" rounded to the nearest tenth is " +real);



    }
}
