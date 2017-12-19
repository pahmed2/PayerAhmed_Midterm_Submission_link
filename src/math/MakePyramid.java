package math;

public class MakePyramid {
    public static void main(String[] args) {

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *

        //Start Here

        int level = 50;
        for(int j=0; j<level; j++){
            for(int i=0; i<level-j; i++){
                System.out.print(" ");
            }
            for(int k=0; k<=j; k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
  }
