/*

Given a string array words, return an array of all characters that show up in all strings 
within the words (including duplicates). You may return the answer in any order.

Example 1:

Input: words = ["bella", "label", "roller"]
Output: ["e","l","l"]

Example 2:

Input: words = ["cool", "lock", "cook"]
Output: ["c","o"]
 
Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 100
words[i] consists of lowercase English letters

*/

import java.util.*;

public class CommonChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.println(commonCharacters(arr));
        sc.close();
    }

    static List<String> commonCharacters(String[] arr) {
        List<String> res = new ArrayList<>();
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);
        for(String word: arr) {
            int[] charCount = new int[26];
            for(char c: word.toCharArray()) {
                charCount[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charCount[i]);
            }
        }
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFreq[i]; j++) {
                res.add(String.valueOf((char)(i + 'a')));
            }
        }
        return res;

    }
}