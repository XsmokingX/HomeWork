import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a;
        int b;
        int c;
        char s;
        System.out.print("Введите первое число : ");
        a = kb.nextInt();
        System.out.print("Введите операцию: ");
        s = kb.next().charAt(0);
        System.out.print("Введите второе число : ");
        b = kb.nextInt();

        switch (s)
        {
            case '+': c = a+b; break;
            case '-': c = a-b; break;
            case '*': c = a*b; break;
            case '/': c = a/b; break;
            default: c = Integer.MIN_VALUE;
                System.out.println("Eror: no operation");
        }

        switch (s)
        {
            case '+': System.out.printf("%d + %d = %d\n",a,b,a + b); break;
            case '-':  System.out.printf("%d - %d = %d\n",a,b,a - b); break;
            case '*':  System.out.printf("%d * %d = %d\n",a,b,a * b); break;
            case '/':  System.out.printf("%d / %d = %d\n",a,b,a / b); break;
            default:
                System.out.println (" No operation ");
        }




    }
}