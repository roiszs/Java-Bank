public class Main {
    public static void main(String[] args) {
    // Variables básicas
        String accountNumber = "123456789";
        double balance = 120;
        int pin = 1234;

        //Array de montos de transactions
        int[] transactionAmounts = {200, -100, 50};

        //Operation con variables.
        balance += transactionAmounts[0]; //Depósito
        if (balance > 0 && pin == 1234) {
            System.out.println("Acceso Concedido");
        }

        //Uso de operates
        balance++; //Incremento
        String status = (balance < 0) ? "Deuda" : "Credito";
        System.out.println("Estado de cuenta: " + status);


    }
}