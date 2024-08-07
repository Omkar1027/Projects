import java.util.*;

public class stringbuilder {
    public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    StringBuilder sb=new StringBuilder("rakmO");
    for(int i=0;i<sb.length()/2;i++){

        int back=sb.length()-i-1;

        char frontChar=sb.charAt(i);
        char backChar=sb.charAt(back);

        sb.setCharAt(i,backChar);
        sb.setCharAt(back,frontChar);

    }
    System.out.println(sb);
    }
    }
