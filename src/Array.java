public class Array {
    public static void main(String[] args) {

        int[][] numbers = {{8,6},{3,4}};

        for (int[] singleArray: numbers) {

            for (int elementArray: singleArray) {
                System.out.print(elementArray + ", ");
            }
            System.out.println("");
        }
    }
}