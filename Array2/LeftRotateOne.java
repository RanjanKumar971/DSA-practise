package Array2;

public class LeftRotateOne {
    public static void rotate(int arr[], int n) {
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n - 1] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        rotate(arr, 5);
        for (int i = 0; i < 5; i++)
            System.out.print(arr[i] + " ");
    }

}
