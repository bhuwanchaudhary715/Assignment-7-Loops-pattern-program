
// 5.Write a program to print your Full Name Using pattern programming logic ...

package Assignments_Only;

public class Fifth_program {

    public static void main(String[] args) {

        int n=8;

        for(int i=0; i<n ; i++){

            System.out.print("  ");

            for(int j=0; j<n ; j++){

                if( i==0 ||j==0 || i==(n-1)/2 || i==(n-1) ||j==(n-1)){

                    System.out.print("* ");

                } else {

                    System.out.print("  ");
                }
            }

            System.out.print("  ");

            for(int j=0; j<n ; j++){

                if( j==0 || i==(n-1)/2 || j==(n-1) && i>=(n-1)/2){

                    System.out.print("* ");

                } else {

                    System.out.print("  ");
                }
            }

            System.out.print("  ");

            for(int j=0; j<n ; j++){

                if( j==0 || i==(n-1) || j==(n-1)){

                    System.out.print("* ");

                } else {

                    System.out.print("  ");
                }
            }

            System.out.print("  ");

            for(int j=0; j<n ; j++){

                if( j==0 ||  i==(n-1) || j==(n-1) || j==(n-1)/2 ){

                    System.out.print("* ");

                } else {

                    System.out.print("  ");
                }
            }

            System.out.print("  ");

            for(int j=0; j<n ; j++){

                if( (i==0 && j>0 && j<(n-1)) || ((j==0 && i>0) || (j==n-1 && i>0 ) || (i==(n-1)/2)) ){

                    System.out.print("* ");

                } else {

                    System.out.print("  ");
                }
            }

            System.out.print("  ");

            for(int j=0; j<n ; j++){

                if( j==0 || j==(n-1) ||i==j ){

                    System.out.print("* ");

                } else {

                    System.out.print("  ");
                }
            }


            System.out.print("            ");

            for(int j=0; j<n ; j++){

                if( i==0 || j==0 || i==(n-1)){

                    System.out.print("* ");

                } else {

                    System.out.print("  ");
                }
            }

            System.out.print("  ");


            for(int j=0; j<n ; j++){

                if(j==0 || i==(n-1)/2 || j==(n-1) && i>=(n-1)/2){

                    System.out.print("* ");

                } else {

                    System.out.print("  ");
                }
            }

            System.out.print("  ");

            for(int j=0; j<n ; j++){

                if( (i==0 && j>0 && j<(n-1)) || ((j==0 && i>0) || (j==n-1 && i>0 ) || (i==(n-1)/2)) ){

                    System.out.print("* ");

                } else {

                    System.out.print("  ");
                }
            }

            System.out.print("  ");

            for(int j=0; j<n ; j++){

                if( j==0 || i==(n-1) || j==(n-1)){

                    System.out.print("* ");

                } else {

                    System.out.print("  ");
                }
            }

            System.out.print("  ");
            for(int j=0;j<n;j++){

                if(j==0 || (i==0 && j<(n-1)/2) || (i==n-1 && j<(n-1)/2) || (j==(n-1)/2 && i!=0 && i!=n-1)){

                    System.out.print("* ");
                } else {

                    System.out.print("  ");
                }
            }

            System.out.print("");

            for(int j=0; j<n ; j++){

                if( j==0 || i==(n-1)/2 || j==(n-1) && i>=(n-1)/2){

                    System.out.print("* ");

                } else {

                    System.out.print("  ");
                }
            }

            System.out.print("  ");

            for(int j=0; j<n ; j++){

                if( (i==0 && j>0 && j<(n-1)) || ((j==0 && i>0) || (j==n-1 && i>0 ) || (i==(n-1)/2)) ){

                    System.out.print("* ");

                } else {

                    System.out.print("  ");
                }
            }

            System.out.print("  ");

            for(int j=0; j<n ; j++){

                if( j==0 || i==0 || i==(n-1)/2 || j==(n-1) && i<(n-1)/2 || i-j==(n-1)/2  ){

                    System.out.print("* ");

                } else {

                    System.out.print("  ");
                }
            }

            System.out.print("  ");

            for(int j=0; j<n ; j++){

                if( i+j==(n-1)  || j-i==(n-1)/2 && i!=n-5 && i!=n-4  ){

                    System.out.print("* ");

                } else {

                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
