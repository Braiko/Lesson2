import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yura on 19.09.15.
 */
public class Main {
    public static void main(String[] arg) {
        // примитивные типы

        //типы данных для хранения целых чисел
        int i = 12;
        i = 14;
        short sh;
        long l = i;

        //типы данных для дробных чисел
        float fl;
        double db;

        //для логичиских значений
        boolean bl;

        //для хранения символов
        char ch;

        //для хранения байт.
        byte bt;

        float[] myArray;

        float[] ex1 = new float[10];
        double[] ex2 = {1.1, 243.3, 1100, 3};

        String str = "hello";

//        if (условие){
//           // выполниться если условие правдиво
//        } else {
//            // выполниться если условие лживо
//        }

        System.out.println("Пожалуйста введите свой пол: g если ты девочка и b если ты малчик"); // cout << "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String gender = "0";

        final int GIRL = 1;
        final int BOY = 2;
        final int UNKNOWN = -1;

        try {
            gender = reader.readLine();
        } catch (IOException e) {
        }

        int genderValue = UNKNOWN;
        if (gender.equals("g"))
            genderValue = GIRL;
        if (gender.equals("b"))
            genderValue = BOY;

//        switch (переменная){
//            значение1 :
//            блок кода 1
//            break ;
//            значение2 :
//            блок кода 2
//            break ;
//            default:
//                блок кода если нету совпадений
//        }

//        switch (genderValue) {
//            case BOY:
//                System.out.println("Хай!");
//                break;
//            case GIRL:
//                System.out.println("Вы столь чарующая сегодня!");
//                break;
//            default:
//                System.out.println("Вы ввели что-то непонятное :: " + gender);
//        }

//        условие  ? значение если правда : значение еси лож;

        String message = "";
        switch (genderValue) {
            case BOY:
            case GIRL:
                message = gender.equals("g") ? "Вы столь чарующая сегодня!" : "Хай!"; // это тернарный оператор
                break;
            default:
                message = "Вы ввели что-то непонятное :: " + gender;
        }
        System.out.println(message);

    /*
    ( ) скобка один и кобка два
    / * %       + - поделить, умножить, получить остаток,плюс, минус,
    !           < > == <= >= меньше,  больше, равно,  не,  меньшеравно и большеравно
    . точка - получить расширение чего либо (если оно есть)
    = равно
       */

        System.out.println("Ок а сейчас решать квадратное уровение, введи коефициенты а,b,c");
        double a, b, c;
        try {
            a = Double.parseDouble(reader.readLine());
            b = Double.parseDouble(reader.readLine());
            c = Double.parseDouble(reader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("все плохо,  шефф");
            return;
        }
        double D = b * b - 4 * a * c;
        if (D < 0) {
            System.out.println("Уровнение, с отрицательным дискрименантом не имеет корней .... ");
            return;
        }
        double x1 = (-b + Math.sqrt(D)) / (2 * a);
        double x2 = (-b - Math.sqrt(D)) / (2 * a);
        System.out.println("X1 :: " + x1 + " X2 :: " + x2);
    }
}
