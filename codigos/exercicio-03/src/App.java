import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        double[] exercicios = new double[4];
        double[] provas = new double[2];
        double trabalho;
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Exercício " + (i + 1) + ": ");
            exercicios[i] = scanner.nextDouble();
        }
        
        for (int i = 0; i < 2; i++) {
            System.out.print("Prova " + (i + 1) + ": ");
            provas[i] = scanner.nextDouble();
        }
        
        System.out.print("Trabalho (0-20): ");
        trabalho = scanner.nextDouble();
        
        double notaFinal = calcularNota(exercicios, provas, trabalho);
        System.out.println("Nota final: " + notaFinal);
        
        scanner.close();
    }
    
    public static double calcularNota(double[] exercicios, double[] provas, double trabalho) {
        double mediaExercicios = 0;
        for (double nota : exercicios) {
            mediaExercicios += nota;
        }
        mediaExercicios /= 4;
        
        double mediaProvas = 0;
        for (double nota : provas) {
            mediaProvas += nota;
        }
        mediaProvas /= 2;
        
        double notaTrabalho = trabalho / 2.0;
        
        return (mediaExercicios * 0.2) + (mediaProvas * 0.6) + (notaTrabalho * 0.2);
    }
}
