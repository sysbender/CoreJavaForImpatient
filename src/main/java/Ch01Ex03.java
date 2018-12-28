import java.util.Scanner;

public class Ch01Ex03 {

    public static void main(String[] args){
        var in = new Scanner(System.in);
        var a = in.nextInt();
        var b = in.nextInt();
        var c = in.nextInt();
        var ab = a > b ? a : b;
        var abc = ab >c ? ab : c;
        var m_ab = Math.max(a,b);
        var m_abc = Math.max(m_ab, c);
        System.out.printf("max=%d\n", abc);
        System.out.printf("Math.max=%d\n", m_abc);
    }
}
