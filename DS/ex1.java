import java.util.*;

public class ex1 {
    public static void main(String[] args) {  
        Scanner ref=new Scanner(System.in);
        
        int p=0,ne=0,z=0;
        char choice;
        do{
            System.out.println("Enter number: ");
            int n=ref.nextInt();
            if(n>0) p++;
            else if(n<0) ne++;
            else z++;

            System.out.println("Wanna cotinue?");
            choice = ref.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        System.out.println("+   "+p);
        System.out.println("-   "+ne);
        System.out.println("0   "+z);
    }
}
