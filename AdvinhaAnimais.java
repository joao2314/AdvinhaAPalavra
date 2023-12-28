
import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class AdvinhaAnimais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pontuacao = 0;

        String[] nomesDeAnimais = {
            "Leao", "Elefante", "Girafa", "Tigre", "Macaco",
            "Pinguim", "Canguru", "Golfinho", "Orangotango", "Panda",
            "Jacare", "Tubarao", "Borboleta", "Gato", "Cachorro",
            "Cavalo", "Coala", "Raposa", "Coruja", "Zebra", "Camelo",
            "Tatu", "Tartaruga", "Rato", "Pato", "Onça", "Ovelha",
            "Paca", "Guepardo", "Hipopótamo", "Avestruz", "Alce", "Aranha",
            "Pangolim", "Suricata", "Texugo", "Foca", "Panda Vermelho",
            "Arara", "Cisne", "Peixe-palhaço", "Gorila", "Lobo", "Vaca",
            "Cobra", "Porco-espinho", "Caracol", "Elefante-marinho", "Papagaio",
            "Iguana", "Quati", "Abutre", "Morcego", "Hiena", "Salamandra"
        };
        

        int indiceAleatorio = new Random().nextInt(nomesDeAnimais.length);
        String escolhido = (nomesDeAnimais[indiceAleatorio]);
        
        System.err.println("Ja pensei em um animal tente adivinhar qual é\nDica: Ele começa com " + escolhido.charAt(0));
        String verificar = scan.nextLine();

        while(verificar != "jsjs777") {
        if(verificar.equals(escolhido)) {
             pontuacao += 100;
             System.out.println("Voce acertou! Nome Que eu pensei: " + escolhido);
             System.out.println("Sua pontuação: " + pontuacao);
             escolhido = (nomesDeAnimais[new Random().nextInt(nomesDeAnimais.length)]);
             System.err.println("Ja pensei em outro aniaml, tente adivinhar qual é\nDica: Ele começa com " + escolhido.charAt(0));
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
