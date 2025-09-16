import java.util.*;
public class SortCharactersByFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.next();

        Map<Character,Integer> hmp=new HashMap<>();
        for(char c:s.toCharArray()){
            hmp.put(c,hmp.getOrDefault(c,0)+1);
        }
        List<Character> li = new ArrayList<>(hmp.keySet());
        li.sort((ob1,ob2) -> hmp.get(ob2)-hmp.get(ob1));
        StringBuilder sb=new StringBuilder();
        for(char c:li){
            for(int i=0;i<hmp.get(c);i++){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
