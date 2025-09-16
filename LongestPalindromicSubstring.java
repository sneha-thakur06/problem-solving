import java.util.*;
public class LongestPalindromicSubstring {

    int max=0;
    int start=0;
    int end=0;


    public static boolean isPalindrome(String s, int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }

    public  String longestPalindromicSub(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s, i, j)){
                    if((j-i+1)>max){
                        max=j-i+1;
                        start=i;
                        end=j;
                    }
                }
            }
        }

        return s.substring(start,end+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.next();
        LongestPalindromicSubstring obj=new LongestPalindromicSubstring();
        String result=obj.longestPalindromicSub(s);
        System.out.println(result);

    }
}
