package Array2;

public class FrequencyInSorted {
    public static void freq(int a[]){
        int c=0,ele=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]==ele)
                c++;
            else{
                System.out.println(ele+"\t"+c);
                ele=a[i];
                c=1;
            }
        }
        System.out.println(ele+"\t"+c);
    }
    public static void main(String[] args) {
        int a[]={10,20,30};
        freq(a);
    }
    
}
