class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int maxw=0;
        int height1 =0;
        while(l!=r){
            int width=r-l;
            if(height[l]<height[r]){
                height1=height[l];
                l++;
            }
            else{
                height1=height[r];
                r--;
            }
            
            maxw=Math.max(maxw,width*height1);

        }
        return maxw;
    }
}