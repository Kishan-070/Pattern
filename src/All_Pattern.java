/*
        *                   * * * *         1
        * *                 *     *         12
        * * *               * * * *         123

* */

public class All_Pattern {
    public static void Pattern1(){
        for (int i = 0;i<3;i++){
            for (int j = 0; j<=i ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern2( int row , int column){
        for (int i = 1 ; i<=row;i++){
            for (int j = 1; j<=column;j++){
                if (i == 1|| i== row ||j ==1 ||j== column){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
    public static void Pattern3(){
        for (int i = 1 ;i<=3;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern1();
        System.out.println();
        Pattern2(3,4);
        System.out.println();
        Pattern3();
    }
}