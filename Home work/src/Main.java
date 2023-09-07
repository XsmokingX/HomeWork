import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final String deliniter = "\n------------------------------\n";

        Scanner kb = new Scanner(System.in);
        //Задача 1

        System.out.println("Калькулятор сложения");
        System.out.printf("Введите число 1 : ");
        int a = kb.nextInt();
        System.out.printf("Введите число 2 : ");
        int b = kb.nextInt();
        int sum = a + b;
        System.out.printf("Ответ: %d", sum);

        System.out.println(deliniter);

        //Задача 2

        int score = 0;
        System.out.println("Пройдите тест на 5 вопросов");
        System.out.println("Вопрос 1: Сколько спутников у Земли?");
        System.out.println("Варианта ответа: 1");
        System.out.println("Варианта ответа: 2");
        System.out.println("Варианта ответа: 3");
        System.out.println("Варианта ответа: 0");
        System.out.print("Ответ: ");
        int n1 = kb.nextInt();
        if (n1 == 1) {
            System.out.println("Верно");
            score ++;
        }
        else {
            System.out.println("Не верно");
        }

        System.out.println("Вопрос 2: Сколько месяцов в году?");
        System.out.println("Варианта ответа: 11");
        System.out.println("Варианта ответа: 12");
        System.out.println("Варианта ответа: 13");
        System.out.println("Варианта ответа: 10");
        System.out.print("Ответ: ");
        int n2 = kb.nextInt();
        if (n2 == 12) {
            System.out.println("Верно");
            score ++;
        }
        else {
            System.out.println("Не верно");
        }
        System.out.println("Вопрос 3: Сколько будет 4+3?");
        System.out.println("Варианта ответа: 4");
        System.out.println("Варианта ответа: 5");
        System.out.println("Варианта ответа: 6");
        System.out.println("Варианта ответа: 7");
        System.out.print("Ответ: ");
        int n3 = kb.nextInt();
        if (n3 == 7) {
            System.out.println("Верно");
            score ++;
        }
        else {
            System.out.println("Не верно");
        }
        System.out.println("Вопрос 4: Сколько часов в дне?");
        System.out.println("Варианта ответа: 12");
        System.out.println("Варианта ответа: 25");
        System.out.println("Варианта ответа: 30");
        System.out.println("Варианта ответа: 24");
        System.out.print("Ответ: ");
        int n4 = kb.nextInt();
        if (n4 == 24) {
            System.out.println("Верно");
            score ++;
        }
        else {
            System.out.println("Не верно");
        }
        System.out.println("Вопрос 5: Сколько цветов радуги существует?");
        System.out.println("Варианта ответа: 9");
        System.out.println("Варианта ответа: 8");
        System.out.println("Варианта ответа: 7");
        System.out.println("Варианта ответа: 6");
        System.out.print("Ответ: ");
        int n5 = kb.nextInt();
        if (n5 == 7) {
            System.out.println("Верно");
            score ++;
        }
        else {
            System.out.println("Не верно");
        }

        System.out.println("Поздравляю вы набрали: " + score + " баллов");



    }
}