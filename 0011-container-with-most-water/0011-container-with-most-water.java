class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length -1 ;
        int MaxCap = 0;
        while(start<end){
            int h = Math.min(height[start],height[end]);
            int width = end - start;
            int CurrCap = h*width;
            MaxCap = Math.max(MaxCap,CurrCap);
            if(height[end]>height[start]){
                start++;
            }else{
                end--;
            }
        }

        return MaxCap;
    }
}