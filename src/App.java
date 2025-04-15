import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double numeroAcertar = 3.14;
        int tentativas = 0;
        int maxTentativas = 5;
        
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("<===Jogo do Adivinha===> \nVocê pode precisa escolher um número de 0 á 50. Observação(Números com casas decimais também valem!).\n Se você acertar, será parabenizado. Caso erre mais de 5 vezes, você terá sua sessão encerrada. \nBoa Sorte! :)");

        double numeroDigitado = 0;

        while (numeroDigitado != numeroAcertar) {

            numeroDigitado = entradaDados.nextDouble();
            
            if (numeroDigitado != numeroAcertar) {
                System.out.println("Número errado, tente novamente: ");
            }
            else {
                System.out.println("Parabéns, você acertou!");
            }
        }
        


        
    }
}
