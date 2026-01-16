class Solution {
    static final int MOD = 1_000_000_007;

    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        //Adding boundary fences
        List<Integer> h = new ArrayList<>();
        List<Integer> v = new ArrayList<>();

        h.add(1);
        h.add(m);
        v.add(1);
        v.add(n);

        for (int x : hFences) h.add(x);
        for (int x : vFences) v.add(x);

        Collections.sort(h);
        Collections.sort(v);

        // getting all possible distances
        Set<Integer> horizontalDistances = new HashSet<>();
        Set<Integer> verticalDistances = new HashSet<>();

        for (int i = 0; i < h.size(); i++) {
            for (int j = i + 1; j < h.size(); j++) {
                horizontalDistances.add(h.get(j) - h.get(i));
            }
        }

        for (int i = 0; i < v.size(); i++) {
            for (int j = i + 1; j < v.size(); j++) {
                verticalDistances.add(v.get(j) - v.get(i));
            }
        }

        //Find maximum common distance
        int maxSide = -1;
        for (int d : horizontalDistances) {
            if (verticalDistances.contains(d)) {
                maxSide = Math.max(maxSide, d);
            }
        }

        if (maxSide == -1) return -1;

        long area = (long) maxSide * maxSide;
        return (int) (area % MOD);
    }

}