import java.util.*;
public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String word=sc.next();
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        System.out.println("Enter elements for array: ");
        String[] str=new String[size];
        for(int i=0;i<str.length;i++){
            str[i]=sc.next();
        }

        int count=0;
        Set<Character> allow=new HashSet<>();
        for(char c: word.toCharArray()){
            allow.add(c);
        }

        for(String s: str){
            boolean isConsistent= true;
            for(char c: s.toCharArray()){
                if(!allow.contains(c)){
                    isConsistent=false;
                    break;
                }
            }
            if(isConsistent){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
