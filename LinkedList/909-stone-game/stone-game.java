class Solution {
    public boolean stoneGame(int[] piles) {
        int last = piles.length-1,asum=0,bsum=0;
        for(int i =0;i<piles.length/2;i++){
            asum+= Math.max(piles[i],piles[last]);
            bsum+=Math.min(piles[i],piles[last]);
            // if(piles[i]>=piles[last]){
            //     asum+=piles[i];
            // }
            // else{
            //     bsum+=piles[last];
            // }
            last--;
        }
        if(asum>bsum) return true;
        return false;
    }
}