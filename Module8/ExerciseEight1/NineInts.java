public class NineInts {
    public static void main (String args[]){
        int[] array = {10, 15, 19, 23, 26, 29, 31, 34, 38};
        System.out.print("The array in order is: ");
        int x;
        for (x = 0; x < array.length; x++)
            System.out.print(array[x] + " ");
        System.out.println("\n");
        System.out.print("The array in reverse order is: ");
        for (x = array.length - 1; x >=0; x--)
            System.out.print(array[x] + " ");
    }
}
