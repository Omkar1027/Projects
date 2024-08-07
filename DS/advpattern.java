public class advpattern {
    public static void main (String[]args){
        int n=5;


        for(int r=1;r<=n;r++){

            for(int a=1;a<=r;a++){
                if(a==1 || a==r)
                System.out.print("*");
                else
                System.out.print(" ");
            }

            for(int s=1;s<=((n*2)-(r*2));s++){
                System.out.print(" ");
            }

            for(int a=1;a<=r;a++){
                if(a==1 || a==r)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }

      




        for(int r=n;r>=n;r--){
            for(int a=r;a<=n;a++){
                if(a==1 || a==n)
                System.out.print("*");
                else
                System.out.print(" ");
            }

            for(int s=((n*2)-(r*2));(s+3)<=(n*2);s++){
                System.out.print(" ");
            }

            for(int a=r;a<=n;a++){
                if(a==1 || a==n)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }



    }
}
