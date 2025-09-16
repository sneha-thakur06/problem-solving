import java.util.*;
public class SubstringExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.next();
        char[] ch=s.toCharArray();
        List<List<Character>> result= new ArrayList<>();
        for(int i=0;i<ch.length;i++){
            List<Character> li=new ArrayList<>();
            for(int j=i;j<ch.length;j++){
                li.add(ch[j]);
//                System.out.print(li);
                int start=0;
                int end=li.size()-1;
                boolean check=true;
               while(start<end){
                    if(!li.get(start).equals(li.get(end))){
                        check=false;
                        break;
                    }
                   start++;
                   end--;

                }
               if(check && li.size()>1){
                   result.add(new ArrayList<>(li));
               }
            }

        }

        for (List<Character> innerList : result) {

            System.out.println(innerList); // new line after each inner list
        }
    }
}
