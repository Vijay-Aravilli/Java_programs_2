class EquilibriumIndex{
    public static void main(String []args){
        int []x=new int[]{-7,1,5,2,-4,3,0};
        int []pa=new int[x.length];
        for(int i=0;i<x.length;i++){
            if(i==0){
                pa[i]=x[i];
            }
            else{
                pa[i]=pa[i-1]+x[i];
            }
        }
        for(int i=1;i<x.length;i++){
            if(pa[i-1]==pa[x.length-1]-pa[i]){
                System.out.println(i);
            
            }
        }
    }
}