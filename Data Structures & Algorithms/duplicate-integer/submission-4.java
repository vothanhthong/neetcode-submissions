class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
            set.add(i);
        }

        return false;
    }
}