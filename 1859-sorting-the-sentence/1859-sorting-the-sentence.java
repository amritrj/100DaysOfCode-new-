class Solution {
    public String sortSentence(String s) {
        String[] ab = s.split(" ");                
        String[] rs = new String[ab.length];      
        StringBuilder sb = new StringBuilder();     
        int i = 0;                          
        for (String elem : ab) {
            i = (int) (elem.charAt(elem.length() - 1) - '0');  
            rs[i - 1] = elem.substring(0, elem.length() - 1); 
        }
        for (i = 0; i < rs.length - 1; i++)
            sb.append(rs[i]).append(" ");
        sb.append(rs[i]);
        return sb.toString();   
    }
}