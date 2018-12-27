import java.util.Scanner;

public class Ch01Ex01 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.printf("Binary: %s\n", Integer.toBinaryString(value));
        System.out.printf("Octal: %o\n", value);
        System.out.printf("Hexadecimal: %x\n", value);
        double reciprocal =1.0/value;
        System.out.printf("Hexadecimal floating point: %a\n", reciprocal);

    }
}
