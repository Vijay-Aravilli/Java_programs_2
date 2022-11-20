public class Replace_Substring_In_a_Given_String{
    public static void main(String[]args){
        String k="gelo world";
        int start=k.length()-1;
        int pos=k.length-1;
        while(start>=0 && pos>=0){
            if(k.charAt(pos)==' ' || pos==k.length() ){
                System.out.print(k.substring(start,pos));
                pos--;
                start=pos;
            }
            else{
                pos++;

            }
        }
    }
}