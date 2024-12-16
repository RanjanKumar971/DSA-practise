package Array2;



public class StockBuySell {
    public static int maxProfit(int a[]){
       int profit=0;
       for(int i=1;i<a.length;i++)
        if(a[i]>a[i-1])
            profit+=a[i]-a[i-1];
       return profit;
    }
    public static void main(String[] args) {
        int a[]={10,20,30};
        System.out.println(maxProfit(a));
    }
}
