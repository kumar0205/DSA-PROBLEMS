class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int l=0,r=1,n=colors.length,c=0;
        if(colors[0]!=colors[n-1] && colors[1]!=colors[0] ) c++;
        while(r<n){
            if(colors[r]!=colors[r-1] && colors[r]!=colors[(r+1)%n] ) c++;
            r++;
        }
        return c;
    }
}