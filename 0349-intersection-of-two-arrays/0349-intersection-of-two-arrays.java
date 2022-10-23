class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] ar= new int[1001];
        for (int i=0;i<nums1.length;i++){
            ar[nums1[i]]=1;
        }
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(ar[nums2[i]]==1){
                ar[nums2[i]]=0;
                list.add(nums2[i]);
            }
        }
        int[] ar1= new int[list.size()];
        for(int i=0;i<list.size();i++){
            ar1[i]=list.get(i);
        }
        return ar1; 
    }
}