class Solution {
    public List<String> buildArray(int[] target, int n) {
        int ind=0;
        List<String> ans = new ArrayList<>();
     for(int i=1;i<=n;i++){
        if(ind>=target.length) break;
        if(i!=target[ind]){
            ans.add("Push");
            ans.add("Pop");
        }
        else{
            ans.add("Push");
            ind++;
            
        }
     } 
     return ans;  
    }
}