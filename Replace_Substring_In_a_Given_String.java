public class Replace_Substring_In_a_Given_String{
    public static void main(String[]args){
        String k="gelo world";
        int start=0;
        int pos=0;
        while(start<k.length() && pos<k.length()){
            if(k.charAt(pos)==' ' || pos==k.length() ){
                System.out.print(k.substring(start,pos));
                pos++;
                start=pos;
            }
            else{
                pos++;

            }
        }
    }
}