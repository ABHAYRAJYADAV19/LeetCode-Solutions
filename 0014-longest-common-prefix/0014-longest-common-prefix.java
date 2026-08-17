class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        int m=strs.length;
        for(int i=0;i<m;i++){
           while(!strs[i].startsWith(prefix)){
            prefix=prefix.substring(0,prefix.length()-1);
            if(prefix.isEmpty()){
                return "";
            }
           } 
        }
        return prefix;


    }
}