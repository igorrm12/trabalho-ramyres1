import java.util.Scanner;


public class Caixa {
    private double comprimento;
    private double largura;
    private double altura;

 
    public Caixa(double comprimento, double largura, double altura) {
        if (comprimento <= 0 || largura <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Todas as dimensões devem ser valores positivos!");
        }
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    
    public double calcularArea() {
        return 2 * (comprimento * largura + comprimento * altura + largura * altura);
    }

 
    public double calcularVolume() {
        return comprimento * largura * altura;
    }

    @Override
    public String toString() {
        return String.format("Caixa: Comprimento = %.2f, Largura = %.2f, Altura = %.2f, Área = %.2f, Volume = %.2f",
                comprimento, largura, altura, calcularArea(), calcularVolume());
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Cálculo de Área Superficial da Caixa ===");
            System.out.print("Digite o comprimento: ");
            double comprimento = scanner.nextDouble();
            System.out.print("Digite a largura: ");
            double largura = scanner.nextDouble();
            System.out.print("Digite a altura: ");
            double altura = scanner.nextDouble();

            Caixa caixa = new Caixa(comprimento, largura, altura);
            System.out.println("\n" + caixa);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
