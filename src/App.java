import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        //Scanner para ler o nome do usuário
        Scanner entradaDados = new Scanner(System.in);

        // Instancia o objeto Random para gerar números aleatórios
        Random random = new Random();

        // Solicita o nome do jogador para personalização
        System.out.println("=================================================");
        System.out.println(" B O R D E R L A N D  -  Ú L T I M O  -  J O G O ");
        System.out.println("=================================================");
        System.out.print("Como devemos chama-lo? ");
        
        String nome = entradaDados.nextLine().trim(); // Lê o nome do jogador e remove espaços em branco no início e no fim
        
        // Apresentação inicial do jogo com o nome do jogador
        System.out.println("O BORDERLAND, um dos melhores jogos de emoções, agradece pela preferencia.");   
        System.out.println("Como sinal de agradecimento, daremos inicio a sua jornada com um jogo de adivinhações."); 
        System.out.println("Você possue 3 passes de sobrevivencia.");

        int vida = 3; // Inicializa a vida do jogador com 3 passes de sobrevivência
        int fase = 1;
        boolean vivo = true; // Inicializa a variável de controle de vida do jogador
        
        // Loop principal do jogo que executa enquanto o jogador estiver vivo e houver fases
        while (vivo && fase <= 3) {
            System.out.println("=================================================");
            System.out.println("DIFICULDADE: 'E U R U S' ");
            
            // -------------------------
            // FASE 1 – NÚMERO FANTASMA
            // -------------------------

            if (fase == 1) {
                
                System.out.println("Atenção!\nExplicaremos as regras do Jogo.");
                System.out.println("Aqui, sobrevivência é mérito, erro é sentença.");
                System.out.println("Você foi escolhido(a) para participar do jogo. Não há mais volta, apenas uma escolha: Jogar ou ser Eliminado.");
                System.out.println("Se você não jogar o jogo, ele jogara você.");
                System.out.println("Sobreviva às 3 fases desafiadoras do jogo, cada uma com regras e armadilhas únicas.\n" + "Você começa com 3 passes de sobrevivência (vidas). A cada erro, uma vida é perdida.");
                
                System.out.println("============================");
                System.out.println("N Ú M E R O  F A N T A S M A");
                System.out.println("============================");

                System.out.println("Um número entre 1 e 10 foi escolhido pela máquina, você tem 3 tentativas para adivinhar o número.\n" + "Erre todas, e perderá 1 vida. Se acertar, passara para a p´roxima fase. Boa Sorte! ;)");
            }
            
        
        }
    }
}
