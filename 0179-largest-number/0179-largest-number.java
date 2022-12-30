class Solution {
    public String largestNumber(int[] nums) {
        String[] temp = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(temp, new Comparator<String>(){
            @Override
            public int compare(String a, String b) {
                String fir = a + b;
                String sec = b + a;
                return sec.compareTo(fir);
            }
        });
        if (temp[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String i : temp) {
            sb.append(i);
        }
        return sb.toString();
    }
}