
import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class AdvinhaObjetos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pontuacao = 0;

        String[] nomesDeObjetos = {
            "Cadeira", "Mesa", "Laptop", "Caneta", "Livro",
            "Telefone", "Relogio", "Carro", "Carrinho", "Bicicleta",
            "Peneira", "Capinha", "Ventilador", "Liquidificador", 
            "Pano", "Papel", "Raquete", "Ralador", "Pá", "Caixa",
            "Papelao", "Radar", "Ralo", "Vaso", "Casa", "Maca",
            "Maquete", "Madeira", "Peres", "Canoa", "Camisa", "Talher",
            "Prato", "Mamadeira", "Xadrez", "Xicara", "Xale", "Zulueta",
            "Ziper", "Guarda-Chuva", "Garfo", "Guitarra", "Grelha",
            "Geladeira", "Micro-Ondas", "Giz", "Garrafa", "Gaiola",
            "Hidrante", "Helicoptero", "Helice", "Harpa", "Holograma",
            "Fogão", "Faca", "Frigideira", "Frasco", "Forno", "Foguete",
            "Fone", "Sofa", "Skate", "Sexofone", "Sapato", "Secador",
            "Saco", "Quadro", "Quebra-Cabeça", "Quadriciclo", "Cinto",
            "Chapeu", "Cofre", "Cortina", "Calendario", "Chave", "Camera",
            "Cama","Computador", "Copo", "Colher", "Ouro", "Ferro", "Cobre",
            "Diamante", "Dado", "Diario", "Dardo", "Detergente", "Damas"
        };

        int indiceAleatorio = new Random().nextInt(nomesDeObjetos.length);
        String escolhido = (nomesDeObjetos[indiceAleatorio]);
        
        System.err.println("Ja pensei em um objeto tente adivinhar qual é\nDica: Ele começa com " + escolhido.charAt(0));
        String verificar = scan.nextLine();

        while(verificar != "jsjs777") {
        if(verificar.equals(escolhido)) {
             pontuacao += 100;
             System.out.println("Voce acertou! Nome Que eu pensei: " + escolhido);
             System.out.println("Sua pontuação: " + pontuacao);
             escolhido = (nomesDeObjetos[new Random().nextInt(nomesDeObjetos.length)]);
             System.err.println("Ja pensei em outro objeto, tente adivinhar qual é\nDica: Ele começa com " + escolhido.charAt(0));
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
