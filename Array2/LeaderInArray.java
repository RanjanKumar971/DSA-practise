package Array2;
//Leader is a ele when no greater no. is present on right side of the array
public class LeaderInArray {
    public static void leader(int arr[],int n){
        int cl=arr[n-1];
        System.out.print(cl+"\t");
        for(int i=n-2;i>=0;i--){
            if(cl<arr[i]){
                cl=arr[i];
                System.out.print(cl+"\t");
            }
        }
    }
    
    public static void main(String[] args) {
        int a[]={7,10,4,10,6,5,2};
        leader(a, a.length);
    }

    // //Naive sol
    // public static void leader(int arr[], int n){
    //     for(int i=0;i<n;i++){
    //         boolean falg=true;
    //         for(int j=i+1;j<n;j++){
    //             if(arr[i]<=arr[j]){
    //                 falg=false;
    //                 break;
    //             }
                    
    //         }
    //         if(falg)
    //             System.out.print(arr[i]+"\t");
           
    //     }
    // }
    
}
