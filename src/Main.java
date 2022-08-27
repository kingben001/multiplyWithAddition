public class Main {
    public static void main(String[] args) {


        System.out.println(multiply(5,10));

    }

    public static int multiply (int firstInt, int secondInt) {
        if (secondInt == 0){
            return 0;
        }

        if (secondInt > 0){
            return (firstInt + multiply(firstInt, secondInt -1));
        }
        if (secondInt < 0){
            return -multiply(firstInt,-secondInt);
        }
        return -1;
    }

}