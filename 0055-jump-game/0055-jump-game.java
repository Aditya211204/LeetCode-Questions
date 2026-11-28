    class Solution {
        public boolean canJump(int[] nums) {
            int maxP = 0;
            if(nums.length==1){
                return true;
            }
            int zero= nums[0]+0;
            if(zero==0){
                return false;
            }
            for(int i = 0; i < nums.length; i++){

                if(i > maxP){
                    return false;
                }

                maxP = Math.max(maxP, i + nums[i]);
            }

            return true;
        }
    }