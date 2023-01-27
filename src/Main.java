import java.util.Locale;

public class Main {
    public static String toUpperCase(String str) {
        if (str == null) {
            return "";
        }
        return  str.toUpperCase(Locale.ENGLISH);
    }
    public static String concatStrings(String s1, String s2){
        if (s1 == null && s2 == null) {
            return "";
        } else if (s1 == null && s2 != null) {
            return s2;
        } else if (s1 != null && s2 == null) {
            return s1;
        }

        return s1.concat(s2);
    }
    public static void main(String[] args) {
        //проверка на NPE
        String string = null;
        //с ипсользованием тернарного оператора
        System.out.println(string == null ? 0 : string.length() );
        //переложение тернарного оператора на if - else
        /*if (string == null) {
                    0;
         } else {
                string.lenght();
        }*/
        ///сравнение строк вызывает Null pointer exepction
        String str = null;

         /*...*/
        //избегаем NPE
        if ("abc".equals(str)) {
            System.out.println("Одинаковы");
            }


        // что если два переменных оба String и мы не знаем
        String s1 = "Hey!  ";
        String s2 =  "Hello world!";
        if (java.util.Objects.equals(s1, s2)) {
            System.out.println("Строки одинаковы");
        }
        // Правила для избегания NPE
        // 1. для ссылочных типов используем условие для проверки
        //  переменной - не равна ли она null
        // 2. стараемся избежать присвоения / назначена  null для
        // инициализации переменной где бы то не было.
        // 3. использовать NPE-безопасные методы из
        // из стандартной библиотеки.

        System.out.println(concatStrings(s1, s2)) ;
        String s3 = null;
        System.out.println(toUpperCase(s3));

    }
}