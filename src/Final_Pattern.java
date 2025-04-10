import java.util.Scanner;

public class Final_Pattern {
    //left half pyramid
    public static void pattern1(int n){
        for (int i =0; i<n; i++){
            for (int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

//reverse left half pyramid

    public static void pattern2(int n){
        for (int i =n ;i>=1;i--){
            for (int j =0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

// left half pyramid  numeric

    public static void pattern3(int n ){
        for (int i = 1 ;i<=n;i++){
            for (int j = 1 ;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
//reverse left half pyramid numeric

    public static void pattern4(int n ){
        for(int i =n;i>=1;i--){
            for (int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
//Empty box pattern

    public static  void pattern5(){
        Scanner user  = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int row = user.nextInt();
        System.out.print("Enter column: ");
        int colm = user.nextInt();
        for (int i=1;i<=row;i++){
            for (int j =1;j<=colm;j++ ){
                if (i==1||i==row||j==1||j==colm){
                    System.out.print("* ");

                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }


    }
//right half pyramid

    public static void pattern6(int n){

        for (int i = 1;i<=n;i++){
            //print space
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //print star
            for (int k= 1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
//reverse right half pyramid

    public static void pattern7(int n){
        for (int i= n;i>=1;i--){
            //print space
            for (int j = 1;j<=n-i;j++){
                System.out.print("  ");
            }
            //print star
            for (int k= 1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//Pyramid

    public static void pattern8(int n){
         for (int i=0;i<n;i++){
             //print space
             for (int j = 0 ; j<n-i-1;j++){
                 System.out.print("  ");
             }
             //print star
             for (int k= 0;k<(2*i)+1;k++){
                 System.out.print("* ");
             }
             //print outer space
             for (int l= 0;l<n-i-1;l++){
                 System.out.print("  ");
             }
             System.out.println();
         }
    }

//reverse Pyramid

    public static void pattern9(int n){
        for (int i= n;i>=0;i--){
            //print space
            for (int j = 0;j<n-i;j++){
                System.out.print("  ");
            }
            //print star
            for (int k= 0;k < 2*i+1; k++){
                System.out.print("* ");
            }
            //print space
            for (int l = 0;l < n-i; l++) {
                System.out.print("  ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
    //Run Any Method By Simply Calling it ...
        pattern9(3);
    }
}
