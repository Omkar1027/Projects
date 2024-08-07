public class halfpyramid {
    public static void main (String[]args){
        int n=55;

        for(int r=1;r<=n;r++){
            for(int a=1;a<=(n-r);a++){
                System.out.print(" ");
            }
            for(int b=0;b<r;b++){
                System.out.print(" "+(b+1));
            }
            System.out.println();
        }





    }
}
