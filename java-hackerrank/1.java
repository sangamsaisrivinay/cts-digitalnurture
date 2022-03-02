import java.io.*;
import java.util.*;
class Code{
    private String res;
    protected int sum_of_lengths(String a,String b){
        return a.length()+b.length();
    }
    protected String agtb(String a,String b){
        int res=a.compareTo(b);
        return res>0?"Yes":"No";
    }
    private String capitalize(String a){
        String end=a.substring(1);
        char first=Character.toUpperCase(a.charAt(0));
        res=first+end;
        return res;
    }
    protected String capitalize(String a,String b){
        res=capitalize(a)+" "+capitalize(b);
        return res;
    }
}


public class Solution extends Code {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        Code c=new Code();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(c.sum_of_lengths(A, B));
        System.out.println(c.agtb(A, B));
        System.out.println(c.capitalize(A, B));
        
    }
}



