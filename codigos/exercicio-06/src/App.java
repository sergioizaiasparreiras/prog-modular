import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma data (DD/MM/AAAA): ");
        String data = scanner.nextLine();
        
        System.out.println(validarData(data));
        
        scanner.close();
    }
    
    public static String validarData(String data) {
        if (data.length() != 10 || data.charAt(2) != '/' || data.charAt(5) != '/') {
            return "INVÁLIDA - Formato incorreto";
        }
        
        try {
            String[] partes = data.split("/");
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);
            
            if (ano < 1 || ano > 9999) {
                return "INVÁLIDA - Ano inválido";
            }
            
            if (mes < 1 || mes > 12) {
                return "INVÁLIDA - Mês inválido";
            }
            
            int diasNoMes = getDiasNoMes(mes, ano);
            if (dia < 1 || dia > diasNoMes) {
                return "INVÁLIDA - Dia inválido";
            }
            
            return "VÁLIDA";
            
        } catch (NumberFormatException e) {
            return "INVÁLIDA - Formato incorreto";
        }
    }
    
    public static int getDiasNoMes(int mes, int ano) {
        switch (mes) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return ehBissexto(ano) ? 29 : 28;
            default:
                return 31;
        }
    }
    
    public static boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}
