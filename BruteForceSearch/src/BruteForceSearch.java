/**
 * Created by sameenislam on 19/02/2016.
 */
public class BruteForceSearch {

    public static double f(double x) {
        return -(x*x) + 2; // this is the function we're trying to find the max. of
    }

    public static void main(String[] args) {
        double startPostionX = -2 ;
        double maximumX = startPostionX;
        double dx = 0.1; // interval size
        double max = f(startPostionX);

        // increment by interval size 'dx' and finish at +2
        for(double i=startPostionX; i<2; i+=dx) {
            if(f(i) > max) {
                max = f(i); // max on the y-axis
                maximumX = i; // max on the x-axis
            }
        }

        System.out.println("The maximum is at x="+maximumX+" + y="+f(maximumX));
    }
}
