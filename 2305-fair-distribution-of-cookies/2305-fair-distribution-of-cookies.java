class Solution {
  int ch[], ans = Integer.MAX_VALUE;

  private void backTrack(int[] cookies, int i) {
    for (var j=0; j < ch.length; j++) {
      ch[j] += cookies[i];

      if (i == cookies.length - 1) {
        var max = 0;
        for (var a : ch) max = Math.max(max, a);
        ans = Math.min(ans, max);
      } else {
        backTrack(cookies, i+1);
      }
      ch[j] -= cookies[i];
    }
  }

  public int distributeCookies(int[] cookies, int k) {
    ch = new int[k];
    backTrack(cookies, 0);
    return ans;
  }
}