import java.util.*;

public class nm{
    public static void main (String[]args){
        Scanner ref=new Scanner(System.in);
        // System.out.println("Enter i: ");
        // int i = r.nextInt();
        System.out.println("Enter row: ");
        int row = ref.nextInt();
        System.out.println("Enter col: ");
        int col = ref.nextInt();

        // for(int x=1;x<=col;x++){
        //     System.out.print("*");
        // }
        // System.out.println();

        for(int r=1;r<=row; r++){
            if(r==1 || r==row){
                for(int x=1;x<=col;x++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
            for(int c=1;c<=col; c++){
                if(c==1 || c==col){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
        System.out.println();
            }
        }

        // for(int x=1;x<=col;x++){
        //     System.out.print("*");
        // }
        // System.out.println();

        ref.close();
        
    }

}