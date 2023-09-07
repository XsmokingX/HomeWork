import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите размер фигуры: ");
        int n = kb.nextInt();

        System.out.println("1. ");
        for (int i = 0; i < n; i++){
            for (int j = n; j > i; j--){
                System.out.print("*  ");
            }
            System.out.println();
            System.out.println();
        }
        System.out.println("2.");
        for (int i = 0 ; i < n; i++) {
            for (int j = 0 ; j < n; j++) {

                if (i <= j)
                System.out.print("*  ");
                else
                System.out.print("  ");
                }
            System.out.println();
            System.out.println();
            }
        System.out.println("3.");
        for (int i = 1; i <=n; i++){
            for (int j = 0; j < n; j++){
                if (j < n-i)
                    System.out.print("  ");
                else
                    System.out.print("*  ");
            }
            System.out.println();
            System.out.println();
        }
        System.out.println("4.");

        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++) System.out.print(" ");
            System.out.print("/");
            for (int j = 0; j < i*2; j++) System.out.print(" ");
            System.out.print("\\");
            System.out.println();
        }
        for (int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++) System.out.print(" ");
            System.out.print("\\");
            for (int j = 0; j < (n-1-i)*2; j++) System.out.print(" ");
            System.out.print("/");
            System.out.println();
        }

        System.out.println("5.");
        for (int i = 0; i < n; i++){
            for (int j = 0 ; j < n; j++) {
                if ((i +j) % 2 == 0) System.out.print("+ ");
                else System.out.print("- ");
            }
            System.out.println();
        }

        System.out.println("6.");

        for(int i=0; i<n;i++)
        {
            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    for(int l=0; l<n; l++) {
                        System.out.print((i%2 == k%2) ?  "*  " : "  ");
                    }
                }
                System.out.println();
            }

        }





        }

    }
