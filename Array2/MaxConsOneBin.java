package Array2;

public class MaxConsOneBin {
    public static int count(int a[]){
        int c=0,c1=0;
        for(int i=0;i<a.length;i++)
            if(a[i]==1)
                c1=Math.max(c1, ++c);
            else{
                //c1=c;
                c=0;
            }
        return c1;
    }
    public static void main(String[] args) {
        int a[]={1,1,0,1,1};
        System.out.println(count(a));
    }
}
