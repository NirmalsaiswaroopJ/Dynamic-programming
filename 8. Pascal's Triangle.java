public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> dp = new ArrayList<>();
        if (numRows == 0) return dp;
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(i + 1);
            for (int j = 0; j <= i; j++) {
                row.add(1);
            }
            for (int j = 1; j < i; j++) {
                row.set(j, dp.get(i - 1).get(j - 1) + dp.get(i - 1).get(j));
            }
            dp.add(row);
        }
        return dp;
}