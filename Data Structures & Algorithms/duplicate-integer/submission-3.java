class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = Arrays.stream(nums)
                                     .boxed() 
                                     .collect(Collectors.toCollection(HashSet::new));

        return nums.length != set.size();
    }
}