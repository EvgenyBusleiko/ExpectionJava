import java.util.Scanner;

public class ExpectionHt2BusleikoE {
    public static void main(String[] args) {

        checkDig();
        task2();
    }

    public static void checkDig() {
        boolean check = false;
        float newDig = 0;
        Scanner scanner = new Scanner(System.in);
        while (!check) {
            check = true;
            System.out.println("Введите дробное число ");
            String digit = scanner.nextLine();
            if (digit == "") {
                System.out.println("Это пустая строка. Нужно ввести число");
                check = false;
            } else if (!(digit.contains("."))) {
                System.out.println("Это точно дробное число с точкой?");
                check = false;

            } else {


                try {
                    newDig = Float.parseFloat(digit);
                } catch (Exception e) {
                    System.out.println("Вы ввели не число ");
                    check = false;
                }


            }

        }
        System.out.println("Вы ввели число " + newDig);
    }

    public static void task2() {
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};// Вот тут добавил массив
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }


}
