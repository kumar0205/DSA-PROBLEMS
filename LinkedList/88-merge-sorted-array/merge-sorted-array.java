class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=0,right=0,k=0;
        int a[]=new int[m+n];
        if(n!=0){
        while(left<m && right<n){
            // if(nums1[left]==0){
            //     a[k++]=nums2[right++];
            // }
            if(nums1[left]<=nums2[right]){
                a[k++]=nums1[left++];
            }
            else{
                a[k++]=nums2[right++];
            }
        }
        while(right<n){
            a[k++] = nums2[right++];
        }
        while(left<m){
            a[k++] = nums1[left++];
        }
        for(int i=0;i<m+n;i++){
            nums1[i]=a[i];
        }
        }
    }
}