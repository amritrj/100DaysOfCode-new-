class Solution {
    public String countAndSay(int n) {
        if(n==1)
			return "1";
		String str= countAndSay(n-1);
		String ans= "";
		int count=1;
		int i=1;
		for(i=1; i<str.length(); i++)
		{
			if(str.charAt(i)!=str.charAt(i-1))
			{
				ans= ans+(char)(count+48)+str.charAt(i-1);
				count=1;
			}
			else
				count++;
		}
		ans= ans+(char)(count+48)+str.charAt(i-1);
		return ans;
    }
}