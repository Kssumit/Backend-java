package Java.Day15generic.genericmethod;

public class GenericMethod {
    public static void main(String[] args) {
        Integer[] intarray = {1,2,3};
        String[] stringArray = {"hello","world"};

        printArray(intarray);
        printArray(stringArray);
    }

    public static <T> void printArray(T[] array){
        for(T element: array){
            System.out.print(element+ " ");
        }
        System.out.println();
    }
}
