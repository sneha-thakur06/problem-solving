import java.util.*;
public class CompressionString {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.next();

        char[] c=s.toCharArray();
        int ind=0;
        int count=1;
        for(int i=1;i<c.length;i++){
            if(c[i]==c[i-1]){
                count++;
            }
            else{
                c[ind++]=c[i-1];
                c[ind++]=(char)(count+'0');
                count=1;

            }
        }
        c[ind++] = c[c.length - 1];
        c[ind++] = (char)(count + '0');
        for(int i=0;i<ind;i++){
            System.out.print(c[i]+" ");
        }
    }
}
