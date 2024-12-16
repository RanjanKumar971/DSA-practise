package Array2;

public class MaxDiff {
    
    public static void maxDiff(int arr[],int n){
        int res=arr[1]-arr[0],minv=arr[0];
        for(int j=1;j<n;j++){
            res=Math.max(res, arr[j]-minv);
            minv=Math.min(minv, arr[j]);
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30};
        maxDiff(arr, arr.length);
    }
    

    // public static void maxDiff(int arr[],int n){
    //     int d=0;
    //     for(int i=0;i<n-1;i++){
    //         for(int j=i+1;j<n;j++){
    //             int nd=arr[j]-arr[i];
    //             if(d<nd)
    //                 d=nd;
    //         }
    //     }
    //     System.out.println(d);
    // }
}
