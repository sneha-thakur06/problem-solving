import java.util.*;
public class RomanToInteger {

    public int romanToInt(String s){
        Map<Character, Integer> hmp=new HashMap<>();
        hmp.put('I',1);
        hmp.put('V',5);
        hmp.put('X',10);
        hmp.put('L',50);
        hmp.put('C',100);
        hmp.put('D',500);
        hmp.put('M',1000);
        int result=0;
        for(int i=0;i<s.length();i++){
            if(i==s.length()-1){
                result+=hmp.get(s.charAt(i));
            }
            else {


                if (hmp.get(s.charAt(i)) >= hmp.get(s.charAt(i + 1))) {
                    result += hmp.get(s.charAt(i));
                } else if (hmp.get(s.charAt(i)) < hmp.get(s.charAt(i + 1))) {
                    result -= hmp.get(s.charAt(i));
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.next();
        RomanToInteger obj=new RomanToInteger();
        int ans=obj.romanToInt(s);
        System.out.println(ans);

    }
}
