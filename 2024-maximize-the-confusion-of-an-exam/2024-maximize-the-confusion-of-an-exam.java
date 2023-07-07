class Solution {
    public int solve(String answerKey, int k, char c) {
        int i = 0, j = 0;
        int ans = 1;
        while(j < answerKey.length()) {
            if(answerKey.charAt(j) == c) {
                j ++;
            }
            else {
                if(k == 0) {
                    while(i <= j) {
                        if(answerKey.charAt(i) != c) {
                            i ++;
                            k ++;
                            break;
                        }
                        i ++;
                    }
                }
                k --;
                j ++;
            }
            ans = Math.max(ans, j - i);
        }
        return ans;
    }
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int ans = solve(answerKey, k, 'T');
        ans = Math.max(ans, solve(answerKey, k, 'F'));
        return ans;
    }
}