class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int row = 0; row < numRows; row++) {
            for (int j = 0; j + row < n; j += cycleLen) {
                sb.append(s.charAt(j + row));
                // for middle rows, append the diagonal element
                if (row != 0 && row != numRows - 1 && j + cycleLen - row < n) {
                    sb.append(s.charAt(j + cycleLen - row));
                }
            }
        }

        return sb.toString();
    }
}