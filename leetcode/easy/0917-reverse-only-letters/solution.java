// class Solution {
//     public String reverseOnlyLetters(String s) {
//         char[] st = s.toCharArray();
//         char[] rev = new char[s.length()];     
//         for (int i = 0; i < s.length(); i++) {
//             if ((st[i] < 'a' || st[i] > 'z') && (st[i] < 'A' || st[i] > 'Z')) {
//                 rev[i] = st[i];
//             }
//         }
//         int j = 0;
//         for (int i = s.length() - 1; i >= 0; i--) {
//             if ((st[i] >= 'a' && st[i] <= 'z') || (st[i] >= 'A' && st[i] <= 'Z')) {
//                 while (rev[j] != '\0') {
//                     j++;
//                 }
//                 rev[j] = st[i];
//             }
//         }

//         return new String(rev);
//     }
// }
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}