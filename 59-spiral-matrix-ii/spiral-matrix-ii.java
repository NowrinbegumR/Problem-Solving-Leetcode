class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int T = 0, B = n-1;
        int L = 0, R = n-1;
        int a = 1;
        while(T <= B && L <= R && a <= n*n){
            for(int i = L; i <= R; i++) mat[T][i] = a++;
            T++;
            for(int i = T; i <= B; i++) mat[i][R] = a++;
            R--;
            if(T <= B){
                for(int i = R; i >= L;i--) mat[B][i] = a++;
                B--;
            }
            if(L <= R){
                for(int i = B; i >= T; i--) mat[i][L] = a++;
                L++;
            }
        }
        return mat;
        
    }
}