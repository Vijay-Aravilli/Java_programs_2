public class Num_odd_integers_in_array {
    public static void main(String[]args){
        int[]ar=new int[]{1,2,3,4,5,6};
        int count=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]%2!=0){
                count++;
            }
        }
        System.out.println(count);

    }
    
}
