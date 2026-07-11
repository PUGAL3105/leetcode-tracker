// Last updated: 11/07/2026, 08:51:37
1class Solution {
2    void dfs(int u, List<List<Integer>> adj, boolean[] vis, List<Integer> comp) {
3        vis[u] = true;
4        comp.add(u);
5        for (int v : adj.get(u))
6            if (!vis[v]) dfs(v, adj, vis, comp);
7    }
8
9    public int countCompleteComponents(int n, int[][] edges) {
10        List<List<Integer>> adj = new ArrayList<>();
11        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
12        for (int[] e : edges) {
13            adj.get(e[0]).add(e[1]);
14            adj.get(e[1]).add(e[0]);
15        }
16
17        boolean[] vis = new boolean[n];
18        int ans = 0;
19
20        for (int i = 0; i < n; i++) {
21            if (!vis[i]) {
22                List<Integer> comp = new ArrayList<>();
23                dfs(i, adj, vis, comp);
24
25                boolean isComplete = true;
26                for (int u : comp) {
27                    if (adj.get(u).size() != comp.size() - 1) {
28                        isComplete = false;
29                        break;
30                    }
31                }
32                if (isComplete) ans++;
33            }
34        }
35        return ans;
36    }
37}