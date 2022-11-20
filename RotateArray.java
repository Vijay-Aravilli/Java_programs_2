public class RotateArray{
    public static void reverse(int []x, int start, int end){
        int t;
        while(start<end){
            t=x[start];
            x[start]=x[end];
            x[end]=t;
            start++;
            end--;
        }
    }
    public static void main(String []args){
        int []A=new int []{1,2,3,4,5,6};
        int k=2;
        reverse(A,0,A.length-1);
        reverse(A,0,k-1);
        reverse(A,k,A.length-1);
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }


    }
    
}