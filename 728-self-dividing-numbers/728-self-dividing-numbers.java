class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> al = new ArrayList<>();
        for(int i=left; i<=right;i++){
        if(selfDividing(i)){
            al.add(i);
        }
    }
        return al;
}
    public boolean selfDividing(int n){
    int temp = n;
        while(temp>0){
        int lD = temp%10;
        if(lD==0)return false;
        if(n%lD!=0) return false;
        temp = temp/10;
        }
        return true;
    }
}