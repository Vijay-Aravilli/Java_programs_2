public class diffMaxEvenandMinOddSum{
    public static void main(String[]args){
        int []a=new int[]{1,2,3,4,5,6};
        int even_num=Integer.MIN_VALUE;
        int odd_num=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                if(a[i]>even_num){
                    even_num=a[i];
                }
            }
            else{
                if(a[i]<odd_num){
                    odd_num=a[i];
                }
            }
        }
        System.out.println(even_num-odd_num);
    }
}