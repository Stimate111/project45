import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        var SalesManager = new SalesManager(new long[]{15, 27, 30, 42, 54});
        System.out.println("Максимальная продажа составила: " + SalesManager.max());
        System.out.println("Расчёт обрезанного среднего: " + SalesManager.croppedMiddle());


    }
}