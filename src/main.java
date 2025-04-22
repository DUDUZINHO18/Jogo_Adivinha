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
        
        //--------------
        // Introdução ao jogo
        //--------------
        Utils.slowPrint("\n  ╔══════════════════════════════════════════════╗", 5);
        Utils.slowPrint("  ║         I N I C I A N D O  O   J O G O       ║", 50);
        Utils.slowPrint("  ╚══════════════════════════════════════════════╝", 5);
        Utils.slowPrint("Seja Muito bem vindo(a) ao [ J o g o - d a - Ú l t i m a - F a s e]." + "\n Seu objetivo aqui é simples: Sobreviva até o fim do jogo sem escorregar na Banana." + "\n Você pode não ver mas, ela te observa... E não se engane, essa Banana muito má!!!", 40);
        
        //--------------
        //regras do jogo
        //--------------
        System.out.println("<==============================================================>");
        Utils.slowPrint("\n  ╔══════════════════════════════════════════════╗", 5);
        Utils.slowPrint("  ║                A T E N Ç Ã O !                ║", 50);
        Utils.slowPrint("  ║     AGORA, EXPLICAREMOS AS REGRAS DO JOGO     ║", 50);
        Utils.slowPrint("  ╚═══════════════════════════════════════════════╝", 5);
        Utils.slowPrint("  ║ Você possuem 5 passes de sobrevivência. A cada erro, um passe será eliminado e a Banana vai chegar mais perto de te pegar.", 40);
        Utils.slowPrint("  ║ Você deve chegar até o final, o que eu acho bem difícil! Caso você chegue ao fim, sera parabenizado e testara os próximos jogos. Agora, se vc escorregar, ela vai te pegar.", 40);
        Utils.slowPrint("  ║ A partir da opção que o jogador escolheu no primeiro módulo, ele tera que passar por todas as fases. Então, se você chegou até aqui, vai ter que jogar.", 40);
        Utils.slowPrint("  ║ Não se deixe levar pelos nomes, os jogos são muito legais.", 40);
        Utils.slowPrint("  ║ Boa sorte na sua nova jornada, preparamos tudo isso especialmente para você, só tome cuidado. A final, você não quer escorregar na Banana né? ", 40);
        Utils.slowPrint("  ║ Boa Sorte! ;)", 40);

        //--------------
        //Começo do jogo
        //--------------
        System.out.println("<==============================================================>");
        Utils.slowPrint("\n  ╔═══════════════════════════════════╗", 5);
        Utils.slowPrint("  ║          NÚMERO FANTASMA          ║", 50);
        Utils.slowPrint("  ╚═══════════════════════════════════╝", 5);
        Utils.slowPrint("  ║ Jogo do Número Fantasma: A máquina esta pensativa...", 40);
        Utils.slowPrint("  ║ Ela escolheu um número entre 1 e 10. Ela está... esperando você acertar.", 40);
        Utils.slowPrint("  ║ Lembre-se você tem 5 chances para acertar... ou para se arrepender de ter tentado.", 40);
        Utils.slowPrint("  ║ Cada palpite errado o aproxima da fúria silenciosa da Banana.", 40);
        

        
        // Laço de tentativas
        while (tentativas > 0) {
            Utils.slowPrint("Escolha >: ", 30);
            int resposta = sc.nextInt();

            if (resposta == numero) {
                Utils.slowPrint(" Parabéns a Banana não te pegou... por enquanto.", 30);
                return; // fim do jogo se acertar
            }else {
                // Dica para o jogador
                Utils.slowPrint("Calma, você ainda tem mais algumas tentaivas até a Banana chegar. ", 30);
                Utils.slowPrint("Vou te dar uma dica: ", 30);
                String dica = resposta < numero ? "O número é maior..." : "O número é menor...";
                Utils.slowPrint(dica, 30);
                tentativas--; // decrementa tentativas
            }
        }

        // Se acabar as tentativas sem sucesso
        Utils.slowPrint(" Aahh você perdeu. Como se sente sabendo que não conseguiu nem da primeira rodada?" + "Essa não, a Banana está vindo ai..." + "Fui!...", 50);
    }
}


// Jogo 2: Esconde-esconde com uma criatura

class EscondeEsconde {

    public void jogar() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Lugar seguro aleatório entre 1 e 3
        int lugarSeguranca = 1;

        // Introdução narrativa
        System.out.println("<==============================================================>");
        Utils.slowPrint("\n  ╔═══════════════════════════════════╗", 5);
        Utils.slowPrint("  ║          ESCONDE-ESCONDE          ║", 50);
        Utils.slowPrint("  ╚═══════════════════════════════════╝", 5);
        Utils.slowPrint("  ║ Esconde-Esconde: A Coisa está solta...", 40);
        Utils.slowPrint("  ║ O ambiente é sombrio, o ar gelado... como se o tempo tivesse parado.", 50);
        Utils.slowPrint("  ║ Você ouve passos distantes, mas não consegue identificar de onde vêm.", 60);
        Utils.slowPrint("  ║ Os raios de luz são poucos e tremem como se estivessem prestes a se apagar.", 60);
        Utils.slowPrint("  ║ A Coisa... algo que não deveria existir, mas está aqui... a espreitar.", 60);
        Utils.slowPrint("  ║ Ela é rápida, imprevisível e está faminta por sua alma.", 60);
        Utils.slowPrint("  ║ ========================================================================", 60);
        Utils.slowPrint("  ║ Você tem 7 opções de esconderijo: ", 60);
        Utils.slowPrint("  ║ 1. O Armário... mas ele está rangendo. Será que a Coisa já o usou?", 70);
        Utils.slowPrint("  ║ 2. Embaixo da Cama... onde os cobertores parecem se mover sozinhos.", 70);
        Utils.slowPrint("  ║ 3. O Porão... uma escuridão densa, onde até o ar parece se apertar.", 70);
        Utils.slowPrint("  ║ 4. O Sótão... cheiro de mofo e ecos estranhos. Ninguém jamais escapou de lá.", 70);
        Utils.slowPrint("  ║ 5. O Banheiro... a porta está trancada, mas o espelho está rachado. Algo o observa.", 70);
        Utils.slowPrint("  ║ 6. O Armário de Ferramentas... lâminas enferrujadas e sons que vêm de dentro das paredes.", 80);
        Utils.slowPrint("  ║ 7. A Escada de Incêndio... uma fuga rápida, mas a escada range como se quisesse te engolir.", 80);
        Utils.slowPrint("  ║ ========================================================================", 60);
        Utils.slowPrint("  ║ Escolha com sabedoria. Mas lembre-se: onde quer que você se esconda, a Coisa sabe.", 70);
        Utils.slowPrint("  ║ Se você for encontrado(a), não haverá mais fuga... só a escuridão.", 80);
        Utils.slowPrint("  ║ Boa sorte! ;)... e não se esqueça: ela adora caçar quem se acha esperto.", 80);
        Utils.slowPrint("Escolha >: ", 30);

        int escolha = sc.nextInt();

        // Compara esconderijo com o seguro
        if (escolha == lugarSeguranca) {
            Utils.slowPrint(" Ela passou direto... você está salvo, por enquanto. Mas, não comemore. Ainda não acabamos os jogos.", 30);
        } else {
            Utils.slowPrint(" Aahh não, você estava indo tão bem... Parece que agora a coisa vai ter que te dividir com a Banana.", 50);
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
            Utils.slowPrint("  ║       Ú  L  T  I  M  A  -  F  A  S  E        ║", 50);
            Utils.slowPrint("  ╚══════════════════════════════════════════════╝", 5);
            System.out.println("     ║  1. Jogar");
            System.out.println("     ║  2. Sair");

            // Escolha do jogo
            Utils.slowPrint("Escolha: ", 30);
            int opcao = sc.nextInt();

            // Redireciona para o jogo selecionado
            switch (opcao) {
                case 1:
                    new NumeroFantasma().jogar();
                    new EscondeEsconde().jogar();
                    new RoletaRussa().jogar();
                    new ReiDeOuros().jogar();
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