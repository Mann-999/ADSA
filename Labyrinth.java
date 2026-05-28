import java.util.*;

class Labyrinth {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static char[] dir = {'R', 'L', 'D', 'U'};

    static boolean isValid(int x, int y, int n, int m) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();

        char[][] grid = new char[n][m];
        int sx = 0, sy = 0;

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                grid[i][j] = line.charAt(j);
                if (grid[i][j] == 'A') { sx = i; sy = j; }
            }
        }

        boolean[][] vis = new boolean[n][m];
        int[][] px = new int[n][m];
        int[][] py = new int[n][m];
        char[][] pd = new char[n][m];

        for(int[] row : px) Arrays.fill(row, -1);

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sx, sy});
        vis[sx][sy] = true;

        boolean found = false;
        int ex = -1, ey = -1;

        outer:
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];

            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(isValid(nx, ny, n, m) && !vis[nx][ny] && grid[nx][ny] != '#') {
                    vis[nx][ny] = true;
                    px[nx][ny] = x;
                    py[nx][ny] = y;
                    pd[nx][ny] = dir[i];

                    if(grid[nx][ny] == 'B') {
                        ex = nx; ey = ny;
                        found = true;
                        break outer;
                    }
                    q.add(new int[]{nx, ny});
                }
            }
        }

        if(!found) {
            System.out.println("NO");
            return;
        }

        StringBuilder path = new StringBuilder();
        int cx = ex, cy = ey;

        while(px[cx][cy] != -1) {
            path.append(pd[cx][cy]);
            int tmp = px[cx][cy];
            cy = py[cx][cy];
            cx = tmp;
        }
        path.reverse();

        System.out.println("YES");
        System.out.println(path.length());
        System.out.println(path);
    }
}