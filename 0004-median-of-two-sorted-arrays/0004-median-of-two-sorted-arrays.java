class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = merge (nums1 , nums2);

        if(ans.length%2 == 0){
            double median = (double)(ans[ans.length/2] + ans[ans.length/2 -1 ])/2;
            return median;
        }else{
            double median = (double) (ans[ans.length / 2]);
            return median;
        }

    }    
    public int [] merge(int [] arr1 , int [] arr2){

        int [] ans = new int[arr1.length + arr2.length];

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while(p1 < arr1.length || p2 < arr2.length){
            int val1;
            int val2;

            if (p1 < arr1.length){
                val1 = arr1[p1];

            }else {
                val1 = Integer.MAX_VALUE;
            }
            if ( p2 < arr2.length){
                val2 = arr2[p2];

            }else{
                val2 = Integer.MAX_VALUE;
        }

            if ( val1 > val2 ){
                ans[p3]=val2;
                p2++;
                    
            }else {
                ans[p3] = val1 ;
                p1++;
            }
            p3++;
                           

        }
        return ans;
    }
    
}