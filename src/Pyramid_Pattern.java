import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Pyramid_Pattern {
    public static void firstPyramid(int n){

        for (int i= 0;i<n;i++){
            //space
            for(int j = 0;j<n-i-1;j++) {
                System.out.print("  ");
            }
                //star
            for (int j=0;j<2*i+1;j++){
                System.out.print("* ");
            }
            for(int j = 0;j<n-i-1;j++) {
                System.out.print("  ");
            }
            System.out.println();

        }
    }

    public static void reversedPyramid(int n){
        for (int i=0;i<n;i++){

            for (int j=0;j<i;j++){
                System.out.print("  ");
        }
            for (int j= 0;j<2*(n-i)-1;j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    public static void barfiPyramid(int n) {

        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            //star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            for (int j= 0;j<2*(n-i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        System.out.println("Enter Row: ");
        int n = user.nextInt();
           firstPyramid(n);
          // reversedPyramid(n);
        //barfiPyramid(n);
    }
}
