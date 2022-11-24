import java.util.*;
public class EvenSum_Oddsum_afterRemoving_an_index{
    public static void main(String[]args){
        int []x=new int[]{2, 1, 6, 4};
        int []x_odd=new int[x.length];
        int []x_even=new int[x.length];
        x_even[0]=x[0];
        for(int i=1;i<x_even.length;i++){
            if(i%2!=0){
                x_even[i]=x_even[i-1];
            }
            else{
                x_even[i]=x_even[i-1]+x[i];
            }

        }
        x_odd[0]=0;
        for(int i=1;i<x_even.length;i++){
            if(i%2==0){
                x_odd[i]=x_odd[i-1];
            }
            else{
                x_odd[i]=x_odd[i-1]+x[i];
            }

        }
        // for(int i=0;i<x.length;i++){
        //     System.out.println(x_even[i]);
            
        // }
        // for(int i=0;i<x.length;i++){
        //     System.out.println(x_odd[i]);
            
        // }
        int even_sum=0;
        int odd_sum=0;
    
        for(int i=1;i<x.length;i++){

            even_sum=x_even[i-1]+x_odd[x.length-1]-x_odd[i];
            odd_sum=x_odd[i-1]+x_even[x.length-1]-x_even[i];
            if(even_sum==odd_sum){
                System.out.println(i);
            }
        }




    }
}