// Last updated: 09/07/2026, 09:50:49
class Solution {
    public int countPrimes(int n) {
        boolean[] primes = new boolean[n+1];
        for (int i = 2; i*i < n; i++) {
            if (!primes[i]) {
                for (int j = i*2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }

        int totalPrimes = 0;
        for (int i = 2; i < n; i++) {
            if (!primes[i]) {
                totalPrimes++;
            }
        }

        return totalPrimes;
    }
}