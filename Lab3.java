import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab3 {
    public static void main(String[] args) {
        Scanner daton = new Scanner(System.in);
        System.out.println("Введите нужную для Вас дату");
        String s = daton.next();
        daton.close();
        String pattern = "(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[012])/(19|[2-9][0-9])\\d\\d";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);
        if (m.matches() == true) {
            System.out.println("Эта строка принаджлежит виду дд/мм/гггг, а также соответствует заданному диапазону");
        } else {
            System.out.println("Эта строка не принаджлежит виду дд/мм/гггг, а также не соответствует заднному диапазону");
        }
    }
}