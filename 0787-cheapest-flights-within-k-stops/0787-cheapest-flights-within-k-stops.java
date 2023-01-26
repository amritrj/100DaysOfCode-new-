class Solution {
  public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
    List<int[]>[] adj = new ArrayList[n];

    for (int i=0; i<n; i++)
      adj[i] = new ArrayList<>();

    for (int[] f : flights) {
      int fromCity = f[0], toCity = f[1], price = f[2];
      adj[fromCity].add(new int[] {toCity, price});
    }

    int[] costToCity = new int[n];
    Arrays.fill(costToCity, Integer.MAX_VALUE);

    Queue<int[]> queue = new ArrayDeque<>();
    queue.offer(new int[] {src, 0});

    do {
      for (int i = queue.size(); i > 0; i--) {
        int[] a = queue.poll();
        int city = a[0], costSoFar = a[1];

        if (costSoFar >= costToCity[city]) continue;

        costToCity[city] = costSoFar;

        if (city == dst) continue;

        for (int[] f : adj[city]) {
          int nextCity = f[0], costToNextCity = f[1];
          queue.offer(new int[] {nextCity, costSoFar + costToNextCity});
        }
      }
    } while (k-- >= 0 && !queue.isEmpty());
    return costToCity[dst] == Integer.MAX_VALUE ? -1 : costToCity[dst];
  }
}