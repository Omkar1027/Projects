
// public class toh {
//     public static void toh(int n,String src,String help,String dest){
//         if(n==1){
//             System.out.println("transfer disk "+n+" from "+src+" to "+dest);
//             return;
//         }
//         toh(n-1,src,dest,help);
//         System.out.println("transfer disk "+n+" from "+src+" to "+dest);
//         toh(n-1,help,src,dest);
//     }
//     public static void main(String[] args) {
//         int n=2;
//         toh(n, "S", "H", "D");
//     }
// }

public class recur {
    public static void occurrence(String str, int f, int l, int idx, char c) {
        if (idx == str.length()) {
            System.out.println("First occurrence: " + f);
            System.out.println("Last occurrence: " + l);
            return;
        }

        if (str.charAt(idx) == c) {
            if (f == -1) {
                f = idx;
            }
            l = idx;
        }

        occurrence(str, f, l, idx + 1, c);
    }

    public static void main(String[] args) {
        String str = "kaana";
        occurrence(str, -1, -1, 0, 'a');
    }
}
