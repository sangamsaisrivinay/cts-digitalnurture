import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Code{
    private String res;
    public String subs(String a,int start,int end){
        res=a.substring(start,end);
        return res;
    }
}

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        Code c=new Code();
        System.out.println(c.subs(S,start,end));
    }
}
