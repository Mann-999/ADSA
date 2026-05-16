import java.util.*;

public class Kefa {
    static int totalWays;

    public static void dfs(int[] cats, ArrayList<ArrayList<Integer>> list, boolean[] isVis, int x, int m, int cat) {
        if(cats[x] == 1) {
            cat++;
        } else {
            cat = 0;
        }
        isVis[x] = true;

        if(cat > m) return;

        boolean isLeaf = true;


        for(int i = 0; i < list.get(x).size(); i++) {
            if(!isVis[list.get(x).get(i)]) {
                dfs(cats, list, isVis, list.get(x).get(i), m, cat);
                isLeaf = false;
            }
        }

        if(isLeaf) {
            totalWays++;
        }

        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] cats = new int[n+1];
        for(int i = 1; i <= n; i++) {
            cats[i] = sc.nextInt();
        }

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            list.get(u).add(v);
            list.get(v).add(u);
        }

        boolean[] isVis = new boolean[n+1];

        totalWays = 0;

        dfs(cats, list, isVis, 1, m, 0);

        System.out.println(totalWays);
    }
}