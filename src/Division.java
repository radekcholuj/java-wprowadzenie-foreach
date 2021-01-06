public class Division {
    public static void main(String[] args) {
        int[] numbers = new int[66];
        for(int i = 0; i< numbers.length; i++){
            numbers[i] = i;
        }

        for(int divider : numbers){
            if(divider % 5 == 0 && divider != 0){
                System.out.println("liczby podzielne przez 5 to " + divider );
            }
        }
    }
}