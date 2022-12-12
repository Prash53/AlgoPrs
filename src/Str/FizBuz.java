package Str;

public class FizBuz {
    public void printNumStr(){
        String s;
        for (int i=1;i<=100;i++){
            s="";
            if(i%3==0)
                s+="fizz";
            if(i%5==0)
                s+="buzz";
            if(s.length()>2)
                System.out.println(s);
            else
                System.out.println(i);
        }
    }
    public static void main(String[] args){
        new FizBuz().printNumStr();
    }
}
