
// 1. Write a program (WAP) to print Alphabets A , B , C , D , E , F , G , H using pattern programming logic..

package Assignments_Only;

public class First_program {

    public static void main(String[] args) {

        int n=5;

        for(int i=0;i<n;i++){

            System.out.print("   ");
            for(int j=0;j<n;j++){

                if(i==0 || j==0 || i==(n-1)/2 || j==(n-1)){

                    System.out.print("* ");

                }else {

                    System.out.print("  ");

                }
            }

            System.out.print("   ");
            for(int j=0;j<n;j++){

                if(i==0 || j==0 || i==(n-1)/2 || j==(n-1) || i==(n-1)){

                    System.out.print("* ");

                }else {

                    System.out.print("  ");

                }
            }


            System.out.print("   ");
            for(int j=0;j<n;j++){

                if( i==0 || j==0 ||  i==(n-1)){

                    System.out.print("* ");

                }else {

                    System.out.print("  ");

                }
            }

            System.out.print("   ");
            for(int j=0;j<n;j++){

                if( i==0 || i==(n-1) || j==(n-1) || j==(n-1)/2){

                    System.out.print("* ");

                }else {

                    System.out.print("  ");

                }
            }

            System.out.print("   ");
            for(int j=0;j<n;j++){

                if( i==0 || j==0 || i==(n-1) || i==(n-1)/2){

                    System.out.print("* ");

                }else {

                    System.out.print("  ");

                }
            }


            System.out.print("   ");
            for(int j=0;j<n;j++){

                if( i==0 || j==0  || i==(n-1)/2){

                    System.out.print("* ");

                }else {

                    System.out.print("  ");

                }
            }

            System.out.print("   ");
            for(int j=0;j<n;j++){

                if( i==0 || j==0 || i==(n-1) && j<(n-1)/2 || j==(n-1)/2 && i>(n-1)/2 || i==(n-1)/2 && j>=(n-1)/2 || j==(n-1) && i>(n-1)/2 ){

                    System.out.print("* ");

                }else {

                    System.out.print("  ");

                }
            }

            System.out.print("   ");
            for(int j=0;j<n;j++){

                if( j==0 || i==(n-1)/2 || j==(n-1)){

                    System.out.print("* ");

                }else {

                    System.out.print("  ");

                }
            }
            System.out.println();
        }
    }
}
