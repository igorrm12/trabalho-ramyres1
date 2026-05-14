import java.util.Scanner;

/**
 * Classe para calcular a área de um Triângulo
 * Fórmula: Área = (base × altura) / 2
 */
public class Triangulo {
    private double base;
    private double altura;

    /**
     * Construtor do Triângulo
     * @param base a base do triângulo
     * @param altura a altura do triângulo
     */
    public Triangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Base e altura devem ser valores positivos!");
        }
        this.base = base;
        this.altura = altura;
    }

    /**
     * Calcula a área do triângulo
     * @return a área do triângulo
     */
    public double calcularArea() {
        return (base * altura) / 2.0;
    }

    @Override
    public String toString() {
        return String.format("Triângulo: Base = %.2f, Altura = %.2f, Área = %.2f",
                base, altura, calcularArea());
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Cálculo de Área do Triângulo ===");
            System.out.print("Digite a base: ");
            double base = scanner.nextDouble();
            System.out.print("Digite a altura: ");
            double altura = scanner.nextDouble();

            Triangulo triangulo = new Triangulo(base, altura);
            System.out.println("\n" + triangulo);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
