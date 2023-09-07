import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        final String deliniter = "\n--------------\n";
        System.out.println("\n");
        System.out.println(Byte. SIZE );
        System.out.println(Byte. BYTES);
        System.out.println(Byte. MIN_VALUE);
        System.out.println(Byte. MAX_VALUE);
        System.out.println("\n");
        System.out.println(
                "Переменная типа " + " byte " + " занимает " +
                        Byte.BYTES + " Байт памяти (" + Byte.SIZE + " бит памяти)," +
                        " и принимает значения в диапазоне от " + Byte. MIN_VALUE+ " до " + Byte.MAX_VALUE);
        System.out.println(deliniter);
        System.out.println(Short. SIZE);
        System.out.println(Short. BYTES);
        System.out.println(Short. MIN_VALUE);
        System.out.println(Short. MAX_VALUE);
        System.out.println("\n");
        System.out.println(
                "Переменная типа " + " short " + " занимает " +
                        Short.BYTES + " Байт памяти (" + Short.SIZE + " бит памяти)," +
                        " и принимает значения в диапазоне от " + Short. MIN_VALUE+ " до " + Short.MAX_VALUE);
        System.out.println(deliniter);
        System.out.println(Integer. SIZE);
        System.out.println(Integer. BYTES);
        System.out.println(Integer. MIN_VALUE);
        System.out.println(Integer. MAX_VALUE);
        System.out.println("\n");
        System.out.println(
                "Переменная типа " + " int " + " занимает " +
                        Integer.BYTES + " Байт памяти (" + Integer.SIZE + " бит памяти)," +
                        " и принимает значения в диапазоне от " + Integer. MIN_VALUE+ " до " + Integer.MAX_VALUE);
        System.out.println(deliniter);
        System.out.println(Long. SIZE);
        System.out.println(Long. BYTES);
        System.out.println(Long. MIN_VALUE);
        System.out.println(Long. MAX_VALUE);
        System.out.println("\n");
        System.out.println(
                "Переменная типа " + " long " + " занимает " +
                        Long.BYTES + " Байт памяти (" + Long.SIZE + " бит памяти)," +
                        " и принимает значения в диапазоне от " + Long. MIN_VALUE+ " до " + Long.MAX_VALUE);

    }
}