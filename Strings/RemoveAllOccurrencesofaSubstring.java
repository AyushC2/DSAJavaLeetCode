// class Solution {
//     public String removeOccurrences(String s, String part) {
//         int index=s.indexOf(part);
//     int L=part.length();
//     // while(index>-1){
//     // s=s.substring(0,index)+s.substring(index+L);
//     // index=s.indexOf(part);
//     // }
//     class Solution {
//     public String removeOccurrences(String s, String part) {
//         while (s.contains(part)) {
//             s = s.replaceFirst(part, "");
//         }
//         return s;
//     }
// }

// return s;
//     }
// }
class Solution {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s;
    }
}
