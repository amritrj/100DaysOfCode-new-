class Solution {
    public String longestCommonPrefix(String[] strs) {
         String a=strs[0];
        for(int i=0;i<strs.length;i++){
            while(strs[i].indexOf(a)!=0){
                a=a.substring(0,a.length()-1);
            }
        }
        return a;
        
    }
}