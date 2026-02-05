class Solution {
    public boolean checkIfPangram(String s) {
        // // Brute Force
        // int[] ans = new int[26];
        // Arrays.fill(ans,0);
        // s = s.toLowerCase();
        // for(int i = 0; i < s.length();i++){
        //      char c = s.charAt(i);
        //      ans[c - 'a'] = 1;
        // }
        // for(int i = 0 ; i < ans.length;i++){
        //     if(ans[i] == 0){
        //         return false;
        //     }
        // }
        // return true;
       
       for(char ch = 'a' ; ch <= 'z'; ch++){
         if(s.indexOf(ch) == -1)return false;
      }
      return true;


    }
}
