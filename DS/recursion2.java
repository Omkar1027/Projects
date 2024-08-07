public class recursion2 {

    public static void printComb( String str, int idx, String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }

        char currChar=str.charAt(idx);

        for(int i=0;i<str.length();i++){
            printComb(str,idx+1,combination+currChar);
        }
        printComb(str,idx+1,combination+currChar);
    }
    public static void main(String[] args) {
        String str="abc";
        printComb(str, 0, "");
        
    }
}
