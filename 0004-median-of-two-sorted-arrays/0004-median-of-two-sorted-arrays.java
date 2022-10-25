class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m+n];
        int i=0;
        for(i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        for(int j=0;j<n;j++){
            arr[i]=nums2[j];
            i++;
        }
        Arrays.sort(arr);  
        int mid=arr.length/2; 
        if(arr.length %2 == 0){
            return (arr[mid-1]+arr[mid])/2.00;
        }
       return arr[mid]; 
    }
}