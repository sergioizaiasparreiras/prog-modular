import java.util.Scanner;
import java.util.ArrayList;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Double> numeros = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        int opcao;
        
        do {
            mostrarMenu();
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1: dividirNumeros(); break;
                case 2: maiorDeTres(); break;
                case 3: armazenarNumeros(); break;
                case 4: somarNumeros(); break;
                case 5: contarParesImpares(); break;
            }
        } while (opcao != 0);
        
        scanner.close();
    }
    
    public static void mostrarMenu() {
        System.out.println("\n1. Dividir dois números");
        System.out.println("2. Maior entre três");
        System.out.println("3. Armazenar números");
        System.out.println("4. Somar números");
        System.out.println("5. Contar pares/ímpares");
        System.out.println("0. Sair");
        System.out.print("Opção: ");
    }
    
    public static void dividirNumeros() {
        System.out.print("Primeiro número: ");
        double a = scanner.nextDouble();
        System.out.print("Segundo número: ");
        double b = scanner.nextDouble();
        
        if (b != 0) {
            System.out.println("Resultado: " + (a / b));
        } else {
            System.out.println("Erro: divisão por zero");
        }
    }
    
    public static void maiorDeTres() {
        System.out.print("Primeiro: ");
        double a = scanner.nextDouble();
        System.out.print("Segundo: ");
        double b = scanner.nextDouble();
        System.out.print("Terceiro: ");
        double c = scanner.nextDouble();
        
        double maior = a;
        if (b > maior) maior = b;
        if (c > maior) maior = c;
        
        System.out.println("Maior: " + maior);
    }
    
    public static void armazenarNumeros() {
        System.out.print("Quantos números? ");
        int qtd = scanner.nextInt();
        
        numeros.clear();
        for (int i = 0; i < qtd; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros.add(scanner.nextDouble());
        }
        System.out.println("Números armazenados!");
    }
    
    public static void somarNumeros() {
        if (numeros.isEmpty()) {
            System.out.println("Nenhum número armazenado");
            return;
        }
        
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        System.out.println("Soma: " + soma);
    }
    
    public static void contarParesImpares() {
        if (numeros.isEmpty()) {
            System.out.println("Nenhum número armazenado");
            return;
        }
        
        int pares = 0, impares = 0;
        for (double num : numeros) {
            if ((int) num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares + " | Ímpares: " + impares);
    }
}
