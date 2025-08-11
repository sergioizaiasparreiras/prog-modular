import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Largura: ");
        int largura = scanner.nextInt();
        System.out.print("Altura: ");
        int altura = scanner.nextInt();
        System.out.print("Deslocamento: ");
        int deslocamento = scanner.nextInt();
        
        desenharRetangulo(largura, altura, deslocamento);
        scanner.close();
    }
    
    public static void desenharRetangulo(int largura, int altura, int deslocamento) {
        for (int linha = 0; linha < altura; linha++) {
            for (int i = 0; i < deslocamento; i++) {
                System.out.print(" ");
            }
            
            if (linha == 0 || linha == altura - 1) {
                for (int i = 0; i < largura; i++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int i = 0; i < largura - 2; i++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
