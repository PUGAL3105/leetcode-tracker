// Last updated: 09/07/2026, 09:48:51
class Solution {
    public int distributeCandies(int[] candyType) {
        int distinct = 0;

        for (int i = 0; i < candyType.length; i++) {

            int found = 0;

            for (int j = 0; j < i; j++) {
                if (candyType[i] == candyType[j]) {
                    found = 1;
                    break;
                }
            }

            if (found == 0) {
                distinct++;
            }
        }

        int canEat = candyType.length / 2;

        return Math.min(distinct, canEat);
    }
}