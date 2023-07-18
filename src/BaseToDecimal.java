import java.util.Scanner;

public class BaseToDecimal {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Binary number !!!");
        long binary=scanner.nextInt();

        System.out.println("Enter the base !!!");
        int base=scanner.nextInt();

        int decimal=getDecimal(binary,base);
        System.out.println(decimal);

    }

    private static int getDecimal(long binary, int base) {
        int power=0;
        int decimal=0;
        while(binary>0){
            int binValue= (int) (binary%10);
            decimal+=binValue*Math.pow(base,power);
            power++;
            binary/=10;
        }
        return decimal;
    }
}