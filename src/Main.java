public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; //Genera una exepcion
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero!");
        }
    }
}