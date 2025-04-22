import java.util.Random;
import java.util.Scanner;




// Classe utilitária para efeitos como escrita lenta
class Utils {

    // Método para imprimir texto lentamente, simulando tensão ou narrativa cinematográfica
    public static void slowPrint(String message, long delay) {
        for (char c : message.toCharArray()){
            System.out.print(c);// imprime letra por letra
            try {
                Thread.sleep(delay);// pausa entre cada caractere
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();// mantém o controle do fluxo
            }
        }
        System.out.println();
    }
}
//2TESTE
// Jogo 1: Número Fantasma
class NumeroFantasma {

    public void jogar(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Número aleatório entre 1 e 100  "Número Fantasma"
        int numero = rand.nextInt(10) + 1;
        int tentativas = 5;

         // Introdução ao jogo
        Utils.slowPrint("\n  ╔═══════════════════════════════════╗", 5);
        Utils.slowPrint("  ║          NÚMERO FANTASMA          ║", 50);
        Utils.slowPrint("  ╚═══════════════════════════════════╝", 5);
        
        // Laço de tentativas
        while (tentativas > 0) {
            Utils.slowPrint("Digite sua resposta: ", 30);
            int resposta = sc.nextInt();

            if (resposta == numero) {
                Utils.slowPrint("👻 Você sobreviveu... por enquanto.", 30);
                return; // fim do jogo se acertar
            }else {
                // Dica para o jogador
                String dica = resposta < numero ? "O número é maior..." : "O número é menor...";
                Utils.slowPrint(dica, 30);
                tentativas--; // decrementa tentativas
            }
        }

        // Se acabar as tentativas sem sucesso
        Utils.slowPrint("☠️ Você perdeu. O Número Fantasma agora conhece sua alma.", 50);
    }
}


// Jogo 2: Esconde-esconde com uma criatura

class EscondeEsconde {

    public void jogar() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Lugar seguro aleatório entre 1 e 3
        int lugarSeguranca = rand.nextInt(3) + 1;

        // Introdução narrativa
        Utils.slowPrint("\n🔦 Esconde-Esconde: A Coisa está solta...", 40);
        Utils.slowPrint("Você tem 3 lugares para se esconder: 1 (armário), 2 (embaixo da cama), 3 (porão)", 40);
        Utils.slowPrint("Mas cuidado... A Coisa fareja o medo.", 40);
        Utils.slowPrint("Escolha seu esconderijo (1 a 3): ", 30);

        int escolha = sc.nextInt();

        // Compara esconderijo com o seguro
        if (escolha == lugarSeguranca) {
            Utils.slowPrint("😱 Ela passou direto... você está salvo, por enquanto.", 30);
        } else {
            Utils.slowPrint("👹 *GRRRRRHHHH*... Você foi encontrado. A escuridão venceu.", 50);
        }
    }
}

// Jogo 3: Roleta Russa

class RoletaRussa {

    public void jogar() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Bala está em uma das 6 posições
        int bala = rand.nextInt(6) + 1;

        // Introdução dramática
        Utils.slowPrint("\n🔫 Roleta Russa", 40);
        Utils.slowPrint("Você segura o tambor... e gira.", 40);
        Utils.slowPrint("Escolha um número de 1 a 6 para disparar contra sua cabeça: ", 30);
        
        int escolha = sc.nextInt();

        // Compara a posição escolhida com a da bala
        if (escolha == bala) {
            Utils.slowPrint("💥 *BANG*... Tudo escurece. Fim de jogo.", 50);
        } else {
            Utils.slowPrint("... *click* ... Nada aconteceu. Você vive... por agora.", 30);
        }
    }
}

// Jogo 4: Rei de Ouros — Julgamento social com paranoia
class ReiDeOuros {

    public void jogar() {
        Scanner sc = new Scanner(System.in);

        Utils.slowPrint("\n👑 Jogo do Rei de Ouros", 40);
        Utils.slowPrint("Você deve escolher uma pessoa para morrer entre seus aliados imaginários.", 40);
        Utils.slowPrint("Simule que tem 3 companheiros. Um deles está mentindo sobre ser um traidor.", 40);
        Utils.slowPrint("Escolha quem eliminar: 1, 2 ou 3", 30);

        int escolha = sc.nextInt();
        int traidor = new Random().nextInt(3) + 1;

        // Verifica se o jogador eliminou o traidor certo
        if (escolha == traidor) {
            Utils.slowPrint("🩸 O traidor foi eliminado. Você venceu... mas está sozinho agora.", 40);
        } else {
            Utils.slowPrint("😈 Você eliminou um inocente. O traidor sorri... e te esfaqueia pelas costas.", 50);
        }
    }
}

// Classe principal que gerencia o menu e fluxo dos jogos
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Loop principal do menu
        while (true) {
            // Título principal com efeito dramático
            Utils.slowPrint("\n  ╔══════════════════════════════════════════════╗", 5);
            Utils.slowPrint("  ║       Ú  L  T  I  M  O  -  J  O  G  O        ║", 50);
            Utils.slowPrint("  ╚══════════════════════════════════════════════╝", 5);
            System.out.println("     ║  1. Jogar");
            System.out.println("     ║  2. Sair");
            Utils.slowPrint("     ║  ÚLTIMA CHANCE.", 0);

            // Escolha do jogo
            Utils.slowPrint("Escolha: ", 30);
            int opcao = sc.nextInt();

            // Redireciona para o jogo selecionado
            switch (opcao) {
                case 1:
                    new NumeroFantasma().jogar();
                    break;
                case 2:
                Utils.slowPrint("Você escapou dessa... por enquanto.", 30);
                System.exit(0); // Encerra o programa
                    default:
                Utils.slowPrint("Opção inválida. Tente novamente.", 20);
            }
        }
    }
}