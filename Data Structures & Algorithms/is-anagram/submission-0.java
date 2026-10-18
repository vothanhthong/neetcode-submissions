class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        Arrays.sort(arrS);
        Arrays.sort(arrT);

        System.out.println(arrS);
        System.out.println(arrT);

        return Arrays.equals(arrS, arrT);
    }
}
