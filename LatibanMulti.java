package latibanmultiplication;

public class LatibanMultiplication {

    public static void main(String[] args) {
        
        System.out.println("Multiplication Table");
        
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " X " + j + " = " + i * j + "\t");

            }
            System.out.println();
        }
    }

}
