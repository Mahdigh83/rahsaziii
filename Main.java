import java.util.Scanner;

public class nemdonam {
    public class isga {
        int fasele;
        String name;

        void insert(int i, String m) {
            fasele = i;
            name = m;

        }
    }

    public int asli(int l, int k) {
        Scanner sc = new Scanner(System.in);
        String isga1, isga2;
        int tedad = 7;
        isga[] sg = new isga[tedad];
        for (int i = 0; i < tedad; i++) {
            String name = sc.next();
            sg[i].name = name;
        }
        int a, b;
        int max = 1000000;
        int max2 = 2000000;
        for (int i = 0; i < tedad; i++) {
            if (tabe(l) < max) {
                max = tabe(l);
                isga1 = sg[i].name;
            }
            if (tabe(k) < max2) {
                max2 = tabe(k);
                isga2 = sg[i].name;
            }
        }
        return 0;
    }
    public int tabe(int a){

    }

}