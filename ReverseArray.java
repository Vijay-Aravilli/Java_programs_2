//import java.util.*;
public class ReverseArray{
    public static void main(String[]args){
        int []x=new int[]{1,2,3,4,5,6};
        int start =0;
        int end= x.length-1;
        int t;
        while(start<end){
            t=x[start];
            x[start]=x[end];
            x[end]=t;
            start++;
            end--;
        }
        for(int i:x){
            System.out.println(i);
        }
    }
}