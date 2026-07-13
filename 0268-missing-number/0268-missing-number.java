class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;

        int aSum = (range*(range+1))/2;

        int cSum = 0;

        for(int i =0 ; i<range ; i++){
            cSum = cSum + nums[i];
        }
        int mNumber = aSum - cSum;
        return mNumber;
    }
}