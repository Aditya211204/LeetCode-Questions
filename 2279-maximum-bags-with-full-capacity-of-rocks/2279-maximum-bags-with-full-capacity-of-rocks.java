class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int zero=0;

        int[] arr = new int[rocks.length];

        for(int i =0; i<rocks.length; i++){
            arr[i]=capacity[i]-rocks[i];
        }

        Arrays.sort(arr);

        for(int j=0; j<arr.length; j++){
            if(additionalRocks>=arr[j]){
                additionalRocks=additionalRocks-arr[j];
                arr[j]=0;
                
            }
            
        }
        for(int k=0; k<arr.length; k++){
            if(arr[k]==0){
                zero++;
            }
        }
        return zero;
        
    }
}