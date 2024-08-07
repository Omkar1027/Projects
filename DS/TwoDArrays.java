import java.util.*;


public class TwoDArrays {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int rows = sc.nextInt();
       int cols = sc.nextInt();

       int[][] numbers = new int[rows][cols];

       for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++) {
               numbers[i][j] = sc.nextInt();
           }
       }

       int[][] tmat=new int[rows][cols];

       for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++) {
            tmat[j][i]=numbers[i][j];
               }
           }


        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(tmat[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(numbers[j][i]+" ");
            }
            System.out.println();
        }
   }}
