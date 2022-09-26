class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int x = a.length(); 
        int y = b.length();
        int z = Math.max(x, y);
        int carry = 0; 
        for(int i = 1; i <= z; i++) {
            int sum = carry; 
            if (x - i >= 0) sum += (a.charAt(x - i) - '0'); 
            if (y - i >= 0) sum += (b.charAt(y - i) - '0'); 
            result.insert(0, sum % 2); 
            carry = sum / 2; 
        }
        if (carry > 0) result.insert(0, carry); 
        return result.toString();
    }
}