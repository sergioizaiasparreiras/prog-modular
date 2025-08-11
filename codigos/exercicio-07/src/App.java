import java.util.Scanner;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Criptografia");
        System.out.println("2. Descriptografia");
        System.out.println("3. Validação de datas");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1: processarCriptografia(); break;
            case 2: processarDescriptografia(); break;
            case 3: processarDatas(); break;
        }
        
        scanner.close();
    }
    
    public static void processarCriptografia() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("entrada_criptografia.txt"));
        PrintWriter writer = new PrintWriter(new FileWriter("saida_criptografia.txt"));
        
        int n = Integer.parseInt(reader.readLine());
        writer.println(n);
        
        for (int i = 0; i < n; i++) {
            String texto = reader.readLine();
            String resultado = criptografar(texto);
            writer.println(resultado);
            System.out.println(texto + " -> " + resultado);
        }
        
        reader.close();
        writer.close();
        System.out.println("Processado!");
    }
    
    public static void processarDescriptografia() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("entrada_descriptografia.txt"));
        PrintWriter writer = new PrintWriter(new FileWriter("saida_descriptografia.txt"));
        
        int n = Integer.parseInt(reader.readLine());
        writer.println(n);
        
        for (int i = 0; i < n; i++) {
            String texto = reader.readLine();
            String resultado = descriptografar(texto);
            writer.println(resultado);
            System.out.println(texto + " -> " + resultado);
        }
        
        reader.close();
        writer.close();
        System.out.println("Processado!");
    }
    
    public static void processarDatas() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("entrada_datas.txt"));
        PrintWriter writer = new PrintWriter(new FileWriter("saida_datas.txt"));
        
        int n = Integer.parseInt(reader.readLine());
        writer.println(n);
        
        for (int i = 0; i < n; i++) {
            String data = reader.readLine();
            String resultado = validarData(data);
            writer.println(data + " -> " + resultado);
            System.out.println(data + " -> " + resultado);
        }
        
        reader.close();
        writer.close();
        System.out.println("Processado!");
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
    
    public static String validarData(String data) {
        if (data.length() != 10 || data.charAt(2) != '/' || data.charAt(5) != '/') {
            return "INVÁLIDA";
        }
        
        try {
            String[] partes = data.split("/");
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);
            
            if (ano < 1 || ano > 9999) return "INVÁLIDA";
            if (mes < 1 || mes > 12) return "INVÁLIDA";
            
            int diasNoMes = getDiasNoMes(mes, ano);
            if (dia < 1 || dia > diasNoMes) return "INVÁLIDA";
            
            return "VÁLIDA";
            
        } catch (NumberFormatException e) {
            return "INVÁLIDA";
        }
    }
    
    public static int getDiasNoMes(int mes, int ano) {
        switch (mes) {
            case 4: case 6: case 9: case 11: return 30;
            case 2: return ehBissexto(ano) ? 29 : 28;
            default: return 31;
        }
    }
    
    public static boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}
