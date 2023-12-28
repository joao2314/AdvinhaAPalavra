import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo ao jogo de advinha oque to pensando\nEscolha um dos modos de jogo para começar!\n\n1 - Alimentos\n2 - Animais\n3 - Objetos");
        int mode = scan.nextInt();
        AdvinhaAlimentos advinhaAlimentos = new AdvinhaAlimentos();
        AdvinhaAnimais advinhaAnimais = new AdvinhaAnimais();
        AdvinhaObjetos advinhaObjetos = new AdvinhaObjetos();

        switch (mode) {
            case 1:
                advinhaAlimentos.main(new String[]{});
                break;
            case 2:
                advinhaAnimais.main(new String[]{});
                break;
            case 3:
               advinhaObjetos.main(new String[]{});
                break;
            default:
                System.err.println("Este modo de jogo não existe");
                break;
        }
    }
}