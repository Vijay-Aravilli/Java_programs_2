import java.util.Scanner;
public class Array_Sum {
    public static void main(String[]args ){
        Scanner sc=new Scanner(System.in);
        int []ar=new int[10];
        int sum=0;
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
            sum+=ar[i];

        }
        sc.close();
        System.out.println(sum);

    }
    
}
