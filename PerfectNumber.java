public class PerfectNumber{
    public static void main(String[]args){
        int count=0;
        int x=4;
        for(int i=2;i<=x/i;i++){
            if(x%i==0){
                count=count+i+(x/i);
            }
            count++;

        }
        System.out.println(count);
        System.out.println(count==x?"True":"False");
    }
}