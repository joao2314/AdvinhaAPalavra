
import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class AdvinhaAlimentos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pontuacao = 0;

        String[] nomesDeAlimentos = {
            "Maça", "Banana", "Arroz", "Feijao", "Cenoura",
            "Brocolis", "Peixe", "Frango", "Pizza", "Sorvete",
            "Pera", "Abobora", "Abobrinha", "Peru", "Beringela",
            "Melancia", "Morango", "Tomate", "Batata", "Brócolis",
            "Chocolate", "Pêssego", "Melão", "Laranja", "Uva",
            "Cereja", "Abacaxi", "Espinafre", "Alface", "Cebola",
            "Alho", "Milho", "Kiwi", "Pimentão", "Pão",
            "Queijo", "Presunto", "Salada", "Manga", "Coco",
            "Amendoim", "Ameixa", "Damasco", "Mel", "Iogurte"
        };
        
        int indiceAleatorio = new Random().nextInt(nomesDeAlimentos.length);
        String escolhido = (nomesDeAlimentos[indiceAleatorio]);
        
        System.err.println("Ja pensei em um alimento tente adivinhar qual é\nDica: Ele começa com " + escolhido.charAt(0));
        String verificar = scan.nextLine();

        while(verificar != "jsjs777") {
        if(verificar.equals(escolhido)) {
             pontuacao += 100;
             System.out.println("Voce acertou! Nome Que eu pensei: " + escolhido);
             System.out.println("Sua pontuação: " + pontuacao);
             escolhido = (nomesDeAlimentos[new Random().nextInt(nomesDeAlimentos.length)]);
             System.err.println("Ja pensei em outro alimento, tente adivinhar qual é\nDica: Ele começa com " + escolhido.charAt(0));
             verificar = scan.nextLine();
        } else {
             System.out.println("Voce perdeu o nome era: " + escolhido);
             System.out.println("Seu recorde: " + pontuacao);
             System.out.println("\nDeseja continuar no jogo? (s/n)");
             char continuar = scan.next().charAt(0);
             if(continuar == 's') {
                main(new String[]{});
             }
             verificar = "jsjs777";
        }
      }
    }
}
