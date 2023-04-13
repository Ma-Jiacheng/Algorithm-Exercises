package Chapter03_哈希表.Demo01_有效的字母异位词;

class Solution {
    public boolean isAnagram(String s, String t) {
        //创建一个长度为26的int型数组，存储每个字母出现的次数
        int[] record = new int[26];
        //将字符串s、t转换为字符数组，方便进行遍历
        char[] letterS = s.toCharArray();
        char[] letterT = t.toCharArray();
        //遍历字符串s的每个字符，将出现的次数记录至数组对应位置
        for (int i = 0; i < letterS.length; i++) {
            int flagS = letterS[i] - 'a';   //记录字符位置，如字母 a 位第一个小写字母，则 flag = 'a' - 'a' = 0，同理 b = 1，以此类推
            record[flagS]++;    //记录每个字母个数
        }
        //遍历字符串t的每个字符，将出现的次数从记录数组中删除
        for (int i = 0; i < letterT.length; i++) {
            int flagT = letterT[i] - 'a';   //同字符串s，记录t每个字母在数组中的位置
            record[flagT]--;    //每个字符出现一次，就从记录数组中删除一次
        }
        //遍历记录数组
        for (int i = 0; i < 26; i++) {
            if(record[i] != 0){     //如果记录数组不全为0，则说明s添加的字母个数没有完全被t抵消，则不是异位词
                return false;
            }
        }
        return true;    //如果记录数组全为0，则说明s添加的字母个数完全被t抵消，两个字符串每个字母个数完全相同
    }
}