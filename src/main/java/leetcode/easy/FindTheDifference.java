/**
 * Given two strings s and t which consist of only lowercase letters.
 * 
 * String t is generated by random shuffling string s and then add one more letter at a random position.
 * 
 * Find the letter that was added in t.
 * 
 * Example:
 * 
 * Input:
 * s = "abcd"
 * t = "abcde"
 * 
 * Output:
 * e
 * 
 * Explanation:
 * 'e' is the letter that was added.
 */

//https://leetcode.com/problems/find-the-difference/

package leetcode.easy;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            sum ^= t.charAt(i);
        }
        return (char) sum;
    }
}
