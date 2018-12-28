import java.util.Scanner;

public class Ch01Ex02 {
    public static void main(String[] args){

        var scanner = new Scanner(System.in);
        var angle = scanner.nextInt();
        System.out.printf("Mod=%d\n", normalizeAngle(angle));
        System.out.printf("Math.floorMod=%d\n", normalizeAngle2(angle));
    }

    /**
     * normolize an integer angle to 0~359 by %
     * @param angle
     * @return
     */
    public static int normalizeAngle(int angle){
        return Math.abs(angle%360);
    }

    /**
     * normolize an integer angle to 0~359 by floorMod
     * @param angle
     * @return
     */
    public static int normalizeAngle2(int angle){
       return  Math.floorMod(angle, 360);

    }
}
