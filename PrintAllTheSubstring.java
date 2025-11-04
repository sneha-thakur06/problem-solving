import java.util.*;
public class LongestSubstring {

    public static int longestSubstring(String s){
 
        int n=s.length();
        int maxlen=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              String res=s.substring(i,j);
              maxlen=Integer.max(maxlen,res.length());
                System.out.println(s.substring(i,j));


                while(charSet.contains(s.charAt(j))){
                    charSet.remove(s.charAt(i));
                    i++;
                }
            }
	 System.out.println(result);
        
        }

       

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.next();
        System.out.println("Maximum length of the substring....");
        longestSubstring(s);
    }
}
