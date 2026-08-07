// r: Row (The current row index)

// c: Column (The current column index)

// dr: Delta Row (The row offset or direction change, typically -1, 0, or 1)

// dc: Delta Column (The column offset or direction change, typically -1, 0, or 1)

// nr: Neighbor Row / Next Row (The calculated row position of the neighbor: r + dr)

// nc: Neighbor Column / Next Column (The calculated column position of the neighbor: c + dc)

class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                int live = 0;

                for (int dr = -1; dr <= 1; dr++) {
                    for (int dc = -1; dc <= 1; dc++) {
                        if (dr == 0 && dc == 0) continue;
                        int nr = r + dr;
                        int nc = c + dc;

                        if (nr >= 0 && nr < m && nc >= 0 && nc < n) {
                            live += board[nr][nc] & 1;
                        }
                    }
                }

                if ((board[r][c] & 1) == 1 && (live == 2 || live == 3)) {
                    board[r][c] |= 2; 
                }
                if ((board[r][c] & 1) == 0 && live == 3) {
                    board[r][c] |= 2; 
                }
            }
        }

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                board[r][c] >>= 1;
            }
        }
    }
}