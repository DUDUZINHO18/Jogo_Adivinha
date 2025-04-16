import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double numeroAcertar = 3.14;
        int tentativas = 0;
        int maxTentativas = 5;
        
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("<===Jogo do Adivinha===> \nO Jogador precisa escolher um número de 0 10. Números quebrados não são excessão! \n ATENÇÃO PARA AS REGRAS DO JOGO! \n O Jogador terá 3 tentativas. Se acertar, sera Parabenizado. Se o jogador errar, você terá sua sessão encerrada. \nBoa Sorte! :)");

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
