import java.util.*;
public class LeadersOfAnArray{
    public static void main(String[]args){
        int []x=new int[]{16, 17, 4, 3, 5, 2};
        ArrayList<Integer> m=new ArrayList<>();
        int l=x[x.length-1];
        m.add(l);
        for(int i=x.length-2;i>=0;i--){
            if(x[i]>l){
                m.add(x[i]);
                l=x[i];
            }
        }
        for(int i=0;i<m.size();i++){
            System.out.println(m.get(i));
        }

    }
}