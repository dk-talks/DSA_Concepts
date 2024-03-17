class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length; // no. of rows
        int m = matrix[0].length; // no. of cols

        int[] buildings = new int[m];
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '0') {
                    buildings[j] = 0;
                } else {
                    buildings[j] += 1;
                }
            }

            // now my arr is ready to find nearest smaller on left and right
            int[] smallerLeft = new int[m];
            int[] smallerRight = new int[m]; // I will store indexes of them

            Stack<Integer> st = new Stack<>();

            for (int j = 0; j < m; j++) {
                while (st.size() > 0 && buildings[st.peek()] >= buildings[j]) {
                    st.pop();
                }
                if (st.size() == 0) {
                    smallerLeft[j] = -1;
                } else {
                    smallerLeft[j] = st.peek();
                }
                st.push(j);
            }

            st.clear();

            for (int j = m - 1; j >= 0; j--) {
                while (st.size() > 0 && buildings[st.peek()] >= buildings[j]) {
                    st.pop();
                }
                if (st.size() == 0) {
                    smallerRight[j] = m;
                } else {
                    smallerRight[j] = st.peek();
                }
                st.push(j);
            }

            // now both arr are ready, calculate the rectangle area

            for (int j = 0; j < m; j++) {
                int currArea = buildings[j] * (smallerRight[j] - smallerLeft[j] - 1);
                ans = Math.max(ans, currArea);
            }
        }

        return ans;
    }
}
