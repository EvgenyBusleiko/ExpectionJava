import java.util.ArrayList;

public class ExpectionHt1BusleikoE {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 0};
        int[] array2 = new int[]{1, 2, 3, 4, 5, 6,7};
        System.out.println(checkArraySum(array1, array2));
        System.out.println(checkArrayDiv(array1, array2));
    }

    public static ArrayList checkArraySum(int[] array1, int[] array2) {

        if (array1.length != array2.length) {
            System.out.println("Длины массивов не равны, сложение невозможно");
            return null;
        }
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            array.add(array1[i] + array2[i]);
        }
        return array;
    }

    public static ArrayList checkArrayDiv(int[] array1, int[] array2) {

        if (array1.length != array2.length) {
            System.out.println("Длины массивов не равны, деление невозможно");
            return null;
        }
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == 0) {
                System.out.println("Деление на нуль");
                return null;
            } else {
                array.add(array1[i] / array2[i]);
            }
        }
        return array;
    }
}
