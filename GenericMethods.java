public class GenericMethods {
    public static void main(String[] args) {
       Integer[] arr= {1,12,9};   
       Double[] doubleArray = {1.0,2.0,8.0};
       String[] stringArray = {"Rose", "Banana", "Toys"};
         
    }
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T> void printArray(T[] array, int lower, int upper) {
        if (lower < 0 || upper >= array.length || lower > upper) {
            throw new ArrayIndexOutOfBoundsException("Invalid range");
        }

        for (int i = lower; i <= upper; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static <T> T getMiddle(T[] array) {
        return array[array.length / 2];
    }

    public static <T extends Comparable<T>> T getMax(T[] array) {
        T max = array[0];

        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        return max;
    }

}

