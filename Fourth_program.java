
// 4. Write a program to print a PW SKILLS using pattern programming logic ...

package Assignments_Only;

public class Fourth_program {

    public static void main(String[] args) {

        int n=8;

        for(int i=0 ; i<n ; i++){

            System.out.print("  ");
            for(int j=0 ; j<n ; j++){

                if(i==0 || j==0 || j==(n-1) && i<=(n-1)/2 || i==(n-1)/2) {

                    System.out.print("* ");

                }else {

                    System.out.print("  ");
                }
            }


            System.out.print("  ");
            for(int j=0 ; j<n ; j++){

                if(j==0 ||  i==(n-1) || j==(n-1) || j==(n-1)/2) {

                    System.out.print("* ");

                }else {

                    System.out.print("  ");
                }
            }


            System.out.print("  ");
            for(int j=0 ; j<n ; j++){

                if(i==0 || j==0 && i<=(n-1)/2 || i==(n-1)/2 || j==(n-1) && i>=(n-1)/2 || i==(n-1)  ) {

                    System.out.print("* ");

                }else {

                    System.out.print("  ");
                }
            }

            System.out.print("  ");
            for(int j=0 ; j<n ; j++){

                if(j==0 || i-j==(n-1)/2 || i+j==(n-1)/2) {

                    System.out.print("* ");

                }else {

                    System.out.print("  ");
                }
            }

            System.out.print(" ");
            for(int j=0 ; j<n ; j++){

                if( i==0 || i==(n-1) || j==(n-1)/2  ) {

                    System.out.print("* ");

                }else {

                    System.out.print("  ");
                }
            }

            System.out.print("  ");
            for(int j=0 ; j<n ; j++){

                if(i==(n-1) || j==0) {

                    System.out.print("* ");

                }else {

                    System.out.print("  ");
                }
            }

            System.out.print("  ");
            for(int j=0 ; j<n ; j++){

                if(i==(n-1) || j==0) {

                    System.out.print("* ");

                }else {

                    System.out.print("  ");
                }
            }


            System.out.print("  ");
            for(int j=0 ; j<n ; j++){

                if(i==0 || j==0 && i<=(n-1)/2 || i==(n-1)/2 || j==(n-1) && i>=(n-1)/2 || i==(n-1)  ) {

                    System.out.print("* ");

                }else {

                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
