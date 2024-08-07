public class sorting {
    public static void ap(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={9,8,1,5,2,7,4,54,53,2,56,75,43,666,44,5564};

        for(int i=0;i<a.length;i++){
            for(int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    
                }

            }
        }

















        // for(int i=0;i<a.length-1;i++){
        //     int smallest=i;
        //     for(int j=i+1;j<a.length;j++){
        //         if(a[smallest]>a[j]){
        //             smallest = j;
        //         }
        //     }
        //     int t=a[smallest];
        //     a[smallest]=a[i];
        //     a[i]=t;
        // }

        // ap(a);
















        // int temp=0;
        // for(int i=n-1;i>0;i--){
        //     for(int j=0;j<n-1;j++){
        //         if(a[j]>a[j+1]){
        //             temp=a[j];
        //             a[j]=a[j+1];
        //             a[j+1]=temp;
        //         }
        //     }
        // }
        // for(int i=0;i<n;i++){
        // System.out.print(a[i]);
        // }
    }
}
