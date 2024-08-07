public class advpatt {
    public static void main (String[]args){
        int n=80;

        for(int r=1;r<=n;r++){
            for(int a=r;a<=(n-1);a++){
                System.out.print(" ");
            }
            for(int b=1;b<=(2*r-1);b++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int r=n;r>=1;r--){
            for(int a=r;a<=(n-1);a++){
                System.out.print(" ");
            }
            for(int b=1;b<=(2*r-1);b++){
                System.out.print("*");
            }
            System.out.println();
        }

        



    }
}
