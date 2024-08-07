public class mergesort {
    public static void conquer(int si,int mid, int ei, int[] arr){
        int[] arrMerge = new int[ei-si+1];
        int idx1= si;
        int idx2= mid+1;
        int x=0;
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                arrMerge[x++]=arr[idx1++];
            }
            else{
                arrMerge[x++]=arr[idx2++];
            }
        } 
        while(idx1<=mid){
            arrMerge[x++]=arr[idx1++];
        }
        while(idx2<=ei){
            arrMerge[x++]=arr[idx2++];
        }
        for(int i=0,j=si;i<arrMerge.length;j++,i++){
            arr[j]=arrMerge[i];
        }

    }

    public static void divide(int si, int ei, int[] arr){
        if(si>=ei){
            return;
        }
        int mid= si +(ei-si) /2; 
        divide(si, mid, arr);
        divide(mid+1, ei, arr);
        conquer(si, mid, ei, arr);


    }

    public static void main (String[]args){
        int[] arr={6,3,8,2,1};
        divide(0, arr.length-1, arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
}








public static int partition (int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low-1;
    for(int j=low; j<high; j++) {
    if (arr[j] < pivot) {
    i++;
    //swap
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    }
    }
    //swap with pivot
    i++;
    int temp=arr[i];
    arr[i]=arr[high];
    arr[high]=temp;
    return i;
}
