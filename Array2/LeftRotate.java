package Array2;

public class LeftRotate {
    public static void rotate(int arr[],int n, int d){
        rev(arr,0,d-1);
        rev(arr,d,n-1);
        rev(arr,0,n-1);
    }
    public static void rev(int arr[],int low, int high){
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;high--;
        }
    }
    
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        rotate(arr, 5,2);
        for (int i = 0; i < 5; i++)
            System.out.print(arr[i] + " ");
    }


    // Naive solution
    // public static void rotate(int arr[],int n, int d){
    //     for(int i=0;i<d;i++)
    //         rotateOne(arr,n);
    // }
    // public static void rotateOne(int arr[],int n){
    //     int temp=arr[0];
    //     for(int i=0;i<n-1;i++)
    //         arr[i]=arr[i+1];
    //     arr[n-1]=temp;
    // }


    // //thetha(n) time and space
    // public static int[] rotate(int arr[],int n,int d){
    //     int a[]=new int[n];
    //     int d1=d;
    //     for(int i=0;i<n-d1;i++,d++)
    //         a[i]=arr[d];
    //     for(int i=n-d1,j=0;i<n;i++,j++)
    //         a[i]=arr[j];
    //     return a;
    // }
}
    

