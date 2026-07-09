// Last updated: 09/07/2026, 09:52:05
class Solution {
    public List<Integer> grayCode(int n) {
        int size = 1 << n;  // 2^n
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }
}