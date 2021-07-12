package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 示例 4:
 *
 * 输入: s = ""
 * 输出: 0
 *  
 *
 * 提示：
 *
 * 0 <= s.length <= 5 * 104
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *      abcabcbb
 *      a
 *      ab
 *      abc
 *      abca -> bca
 *      bcab -> cab
 *      cabc -> abc
 *      abcb -> cb
 *      cbb  -> b
 * */
public class 无重复字符的最长子串 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String max = "";
        String a = scanner.nextLine();
        System.out.println(a.substring(0,1));
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(a.charAt(0));
//        for (int i = 1; i < a.length(); i++) {
//            if (stringBuilder.toString().indexOf(a.charAt(i)) >= 0) { //出现重复字符
//                if (max.length() < stringBuilder.toString().length()) {
//                    max = stringBuilder.toString();
//                }
//                stringBuilder = new StringBuilder();
//                stringBuilder.append(a.charAt(i));
//            } else {
//                stringBuilder.append(a.charAt(i)); // 没有出现重复塞入值
//            }
//        }
//        System.out.println(max.length() > stringBuilder.length() ? max.length() : stringBuilder.length());
    }


    private int lengthOfLongestSubstring(String s) {
        if(s.length() ==0){
            return 0;
        }
        // abcabcbb
        int max = 0;
        Map<Character,Integer> map = new HashMap<>(); //存储的是每次字母出现的下标
        for (int left=0,start=0;start<s.length();start++){
            if(map.containsKey(s.charAt(start))){ // 判断map是否有这个key
                left = Math.max(left,map.get(s.charAt(start))+1);  // left为重复字段的上一个位置abba 导致left回退到a位置，所以要取最大值
            }
            map.put(s.charAt(start),start); // 存取下表方便计算
            max = Math.max(max,start-left+1); //
        }
        return max;
    }
}