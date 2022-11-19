import java.util.*;
public class PrimeNumber{
    public static void main(String[]args){
        Scanner sc =new Scanner (System.in);
        int x=sc.nextInt();
        int count=0;
        for(int i=2;i<=x/i;i++){
            if(x%i==0){
                count++;
            }
            else{
                continue;
            }
        }
        if(count==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}