public class pickElementsFromStartEnd{
    public static void main(String []args){
        int []A=new int[]{-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35};
        int []pa=new int[A.length];
        int B=3;
        for(int i=0;i<A.length;i++){
            if(i==0){
                pa[i]=A[i];
            }
            else{
                pa[i]=A[i]+pa[i-1];
            }
        }
        int sum=Integer.MIN_VALUE;
        for(int i=0;i<B;i++){
            int x=pa[B-i]+(pa[A.length-1]-pa[A.length-1-i]);
            if(x>sum){
                sum=x;
            }


        }
        if((pa[A.length-1]-pa[A.length-1-B])>sum){
            sum=pa[A.length-1]-pa[A.length-1-B];
        }
        System.out.println(sum);
    }
}