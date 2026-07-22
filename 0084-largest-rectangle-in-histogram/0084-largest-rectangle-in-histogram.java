class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int maxArea=0;
        for(int i=0;i<=heights.length;i++){
            int currHeight=0;
            if(i<heights.length){
                currHeight=heights[i];
            }
            while(!st.isEmpty() && heights[st.peek()]>currHeight){
                int height=heights[st.pop()];
                int rightBoundary=i;
                int leftBoundary=0;
                if(st.isEmpty()){
                    leftBoundary=-1;
                }else{
                    leftBoundary=st.peek();
                }
                int width=rightBoundary-leftBoundary-1;
                int area=height*width;
                if(area>maxArea){
                    maxArea=area;
                }
                

            }
            st.push(i);

        }
        return maxArea;
        
    }
}