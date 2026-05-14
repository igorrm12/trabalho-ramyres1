import java.util.Scanner;

/**
 * Classe para calcular a área de um Retângulo
 * Fórmula: Área = base × altura
 */
public class Retangulo {
    private double base;
    private double altura;

    /**
     * Construtor do Retângulo
     * @param base a base do retângulo
     * @param altura a altura do retângulo
     */
    public Retangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Base e altura devem ser valores positivos!");
        }
        this.base = base;
        this.altura = altura;
    }

    /**
     * Calcula a área do retângulo
     * @return a área do retângulo
     */
    public double calcularArea() {
        return base * altura;
    }

    /**
     * Calcula o perímetro do retângulo
     * @return o perímetro do retângulo
     */
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return String.format("Retângulo: Base = %.2f, Altura = %.2f, Área = %.2f, Perímetro = %.2f",
                base, altura, calcularArea(), calcularPerimetro());
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Cálculo de Área do Retângulo ===");
            System.out.print("Digite a base: ");
            double base = scanner.nextDouble();
            System.out.print("Digite a altura: ");
            double altura = scanner.nextDouble();

            Retangulo retangulo = new Retangulo(base, altura);
            System.out.println("\n" + retangulo);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
