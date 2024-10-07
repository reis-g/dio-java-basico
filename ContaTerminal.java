import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Usando try-with-resources para garantir o fechamento do Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            // Solicitando e capturando os dados do usuário
            System.out.println("Por favor, digite o número da Conta:");
            int numeroConta = scanner.nextInt();

            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.next();

            // Consumir o caractere de nova linha após o próximo scanner
            scanner.nextLine();

            System.out.println("Por favor, digite o nome do Cliente:");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo da conta:");
            double saldo = scanner.nextDouble();

            // Exibindo a mensagem final formatada
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                    + "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo "
                    + saldo + " já está disponível para saque.");

        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
