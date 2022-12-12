package Str;

public class Reverse {
    public String reverse(String s){
        if(s==null)
            return null;
        if(s.length()==1)
            return s;
        int j=s.length()-1;
        char[] ch =s.toCharArray();
        for(int i=0;i<j;i++){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            j--;
        }
       String rev= new String(ch);
        return rev;
    }
    public static void main(String[] args){
        System.out.println(new Reverse().reverse("abcdef"));
    }

}
