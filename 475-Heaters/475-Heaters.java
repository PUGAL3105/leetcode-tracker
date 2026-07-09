// Last updated: 09/07/2026, 09:49:06
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        HashSet<Integer> set = new HashSet<>();
        for(int i:heaters){
            set.add(i);
        }
        long l = 0;
        long r = 1_000_000_000L;
        while(l<=r){
            long mid = l+(r-l)/2;
            if(safe(houses,heaters,mid)){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return (int) l;
    }
    public boolean safe(int[]houses,int[] heaters,long mid){
        for(int i:houses){
            if(!check(i,heaters,mid)){
                return false;
            }
        }
        return true;
    }
    public boolean check(int house,int[]heaters,long mid){
        int l = 0;
        int r = heaters.length-1;
        int midd = (int) mid;
        while(l<=r){
            int m = l+(r-l)/2;
            if(Math.abs(heaters[m]-house)<=midd) return true;
            if(heaters[m]>house){
                r = m-1;
            }else{
                l = m+1;
            }
        }
        return false;
    }
}