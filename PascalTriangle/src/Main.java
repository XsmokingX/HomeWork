import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите колличество строк: ");
        int depth = kb.nextInt();
        int nf = 1;
        for (int i = 0; i <= depth + 1; i++) System.out.print("  ");
        System.out.println(1);
        for(int n = 1; n <= depth; n++)
        {
            for(int j = 0; j < depth-n; j++)
            {
                System.out.print("   ");
            }
            System.out.print(1+"     ");
            nf *= n;
            int mf = 1;
            for (int m = 1; m <= n; m++)
            {
                mf *= m;
                int kf = 1;
                for (int k = 1; k <= n-m; k++)
                {
                    kf *= k;
                }
                int member = nf/mf/kf;
                System.out.print(member + "     ");
            }
            System.out.println();
        }
    }

}