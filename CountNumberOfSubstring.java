import java.util.*;
public class CountNumberOfSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.next();
        int n=s.length();
        int count=0;
        List<Character> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                li.add(s.charAt(j));
                count++;
            }
        }
        System.out.println(count);
    }
}
