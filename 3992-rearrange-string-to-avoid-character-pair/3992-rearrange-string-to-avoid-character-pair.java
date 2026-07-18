class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder remaining=new StringBuilder();
        StringBuilder xone=new StringBuilder();
        StringBuilder yone=new StringBuilder();

        for(char ch:s.toCharArray()){
            if(ch==y){
                yone.append(ch);
            }else if(ch==x){
                xone.append(ch);
            }else{
                remaining.append(ch);
            }
        }
        return remaining.toString()+yone.toString()+xone.toString();
    }
}