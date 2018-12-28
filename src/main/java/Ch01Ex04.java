/**
 * print the  smallest and largest positive double values
 */
public class Ch01Ex04 {
    public static void main(String[] args){
        double a = Double.MIN_NORMAL;
        //System.out.printf("min=%g\n", Double.MIN_VALUE);
        //System.out.printf("max=%g\n",Double.MAX_VALUE);
        System.out.printf("up=%g\n", Math.nextUp(0.0));
        System.out.printf("down=%g\n",Math.nextDown(Double.POSITIVE_INFINITY));
    }
}
