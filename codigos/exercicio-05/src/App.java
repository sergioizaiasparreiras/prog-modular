import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Criptografar");
        System.out.println("2. Descriptografar");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();
        
        if (opcao == 1) {
            System.out.println("Criptografado: " + criptografar(texto));
        } else {
            System.out.println("Descriptografado: " + descriptografar(texto));
        }
        
        scanner.close();
    }
    
    public static String criptografar(String texto) {
        texto = texto.replaceAll("\\s+", "").toUpperCase();
        
        while (texto.length() % 5 != 0) {
            texto += "X";
        }
        
        int linhas = texto.length() / 5;
        char[][] matriz = new char[linhas][5];
        
        int indice = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = texto.charAt(indice++);
            }
        }
        
        String resultado = "";
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < linhas; i++) {
                resultado += matriz[i][j];
            }
        }
        
        return resultado;
    }
    
    public static String descriptografar(String texto) {
        int linhas = texto.length() / 5;
        char[][] matriz = new char[linhas][5];
        
        int indice = 0;
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < linhas; i++) {
                matriz[i][j] = texto.charAt(indice++);
            }
        }
        
        String resultado = "";
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < 5; j++) {
                resultado += matriz[i][j];
            }
        }
        
        return resultado.replaceAll("X+$", "");
    }
}
