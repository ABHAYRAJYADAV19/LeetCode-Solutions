class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        long swaps=0;
        long Md=1000000007;
        long count1=0;
        long count2=0;
        for(int num:nums){
            if(num<a){
                swaps+=(count1+count2);   
            }else if(num<=b){
                swaps+=count2;
                count1++;
            }else{
                count2++;
            }
        }
        return (int)(swaps%Md);
        
    }
}