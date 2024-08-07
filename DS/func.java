import java.util.*;

public class func {
    public static int fact(int n){
        int fact=1;
        for(int a=n;a>0;a--){
            fact=a*fact;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner ref=new Scanner(System.in);
        int n=ref.nextInt();
        System.out.println(""+fact(n));
    }
}
