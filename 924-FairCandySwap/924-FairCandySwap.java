// Last updated: 09/07/2026, 09:48:20
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int as=0;
        int bs=0;
        for(int i=0;i<aliceSizes.length;i++){
            as += aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++){
            bs +=bobSizes[i];
        }
        for(int i=0;i<aliceSizes.length;i++){
            for(int j=0;j<bobSizes.length;j++){
                int ns=as-aliceSizes[i]+bobSizes[j];
                int nb=bs - bobSizes[j]+aliceSizes[i];
                if(ns==nb){
                    return new int[]{aliceSizes[i],bobSizes[j]};
                }
            }
        }
        return new int[]{};
    }
}