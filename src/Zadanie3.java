public class Zadanie3 {
    public static void main(String[] args) {

        int[] numbers = new int[] {1,3,5,7,0};

        for(int i = 0; i < numbers.length/2; i++ ){
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length -1-i];
            numbers[numbers.length -1-i] = temp;
            System.out.println("iteracja" + i);
        }
        for ( int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

    }
}
