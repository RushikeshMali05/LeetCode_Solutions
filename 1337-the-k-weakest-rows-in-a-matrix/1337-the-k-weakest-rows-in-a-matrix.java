class Pair {
    int num;
    int row;
    Pair(int num, int row) {
        this.num = num;
        this.row = row;
    }
}
class PairComparator implements Comparator<Pair> {
    public int compare(Pair p1, Pair p2) {
        if (p1.num > p2.num) return -1;
        else if (p1.num == p2.num) {
            if (p1.row < p2.row) return 1;
            else return -1;
        }
        else return 1;
    }
}
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(new PairComparator());
        for(int i=0;i<k;i++) {
            int count = 0;
            while(count < mat[i].length && mat[i][count] == 1) count++;
            pq.add(new Pair(count, i));
        }
        for(int i=k;i<mat.length;i++) {
            int count = 0;
            while(count < mat[i].length && mat[i][count] == 1) count++;
            if (pq.peek().num > count) {
                pq.poll();
                pq.add(new Pair(count, i));
            }
        }
        int ans[] = new int[k];
        int ptr = ans.length - 1;
        while(pq.size() > 0) ans[ptr--] = pq.poll().row;
        return ans;
    }
}