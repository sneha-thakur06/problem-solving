REVERSE WORD IN A STRING
=========================

TIME COMPLEXITY-O(N)
--------------------

class Solution {
    public String reverseWords(String s) {
        String[] word=s.trim().split("\\s+");
        StringBuilder rev=new StringBuilder();
        for(int i=word.length-1;i>=0;i--){
            rev.append(word[i]);
            if(i!=0){
                rev.append(" ");
            }
        }
        return String.join(" ",rev.toString());
    }
}