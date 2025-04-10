import java.util.Scanner;

/* pattern 1
        * * * *
        * * * *
        * * * *
        * * * *
  take number of star from user..
 */
public class Pattern1 {
    public static void main(String[] args) {
        Scanner user =new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = user.nextInt();
        for (int i = 1 ; i <= row;i++){
            for ( int j =1 ; j <=row; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
