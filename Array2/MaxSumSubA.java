package Array2;

public class MaxSumSubA {

    public static int maxsum(int a[]) {
        int res=a[0],masEnd=a[0];
        for(int i=1;i<a.length;i++){
            masEnd=Math.max(masEnd+a[i], a[i]);
            res=Math.max(masEnd, res);
        }
        return res;
    }

    public static void main(String[] args) {
        int a[] = { -5,1,-2,3,-1,2,-2 };
        System.out.println(maxsum(a));

    }
}