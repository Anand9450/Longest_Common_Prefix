package com.anand;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strings)
    {
    /*
        This function computes the longest common prefix
        this takes a string array as input
        we are using a variable "prefixLen" to keep track of
        prefix we computed.
    */
        if(0 == strings.length)
        {
            return "";
        }
        for(int prefixLen = 0; prefixLen < strings[0].length(); prefixLen++)

        {
            char toMatch = strings[0].charAt(prefixLen);
            for (int i = 1; i < strings.length; i++)
            {
                if (prefixLen >= strings[i].length() || strings[i].charAt(prefixLen) != toMatch)
                {
                    return strings[0].substring(0, prefixLen);
                }
            }

        }
        return strings[0];
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] testcase1 = {"flower","flow","flowInside"};
        System.out.println("Common prefix of testcase1: " + longestCommonPrefix.longestCommonPrefix(testcase1));

        String[] testcase2 = {"dog", "cat", "b ird"};
        System.out.println("Common prefix of testcase2: " + longestCommonPrefix.longestCommonPrefix(testcase2));

        String[] testcase3 = {"class", "classes", ""};
        System.out.println("Common prefix of testcase3: " + longestCommonPrefix.longestCommonPrefix(testcase3));
    }
}
