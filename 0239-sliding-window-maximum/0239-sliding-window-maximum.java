class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n-k+1];
        Deque<Integer> deque = new LinkedList<>(); 
        
        int s=0,e=0,res=0;
        
        while(e<n){
            while(!deque.isEmpty() && deque.getLast()<arr[e]){
                deque.removeLast();
            }

            deque.addLast(arr[e]); 
            if(e-s+1 < k) e++; 
            else if(e-s+1 == k){
                ans[res] = deque.getFirst(); 
                if(deque.getFirst() == arr[s]) deque.removeFirst();
                
                res++;
                s++;
                e++;  
            }          
        }
        
        return ans;
    }
}