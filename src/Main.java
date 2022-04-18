import java.lang.annotation.Target;

public class Main {
    static int SIZE = 4;

    public static void main(String[] args) {
        String[][] array = {

                {"1", "2", "3", "4"},
                {"2", "2", "3", "4"},
                {"3", "2", "3", "4"},
                {"4", "2", "3", "4"}

        };
        try {
            System.out.println(sum(array));


        } catch (MyArraySizeException e) {

            e.printStackTrace();
        } catch (MyArrayDataException e) {

            e.printStackTrace();
            System.out.println(e.getCol() + "  " + e.getRow());

            System.out.println(array[e.getRow()][e.getCol()]);

        }
        System.out.println("Finn");
    }

    static int sum(String[][] array) throws MyArrayDataException, MyArraySizeException {

        if (array.length != SIZE) {
            throw new MyArraySizeException();
        }

        for (int st = 0; st < array.length; st++) {
            if (array[st].length != SIZE) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int i2 = 0; i2 < array[i].length; i2++) {
                try {
                    sum += Integer.parseInt(array[i][i2]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("format " + i + " " + i2, i, i2);
                }

            }
        }
        return sum;
    }


    static boolean isNumber(String s) {
        return s.matches("^[-+]?[0-9]+");
    }
}