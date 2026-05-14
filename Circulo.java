import java.util.Scanner;


public class Circulo {
    private double raio;
    private static final double PI = Math.PI;

  
    public Circulo(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser um valor positivo!");
        }
        this.raio = raio;
    }


    public double calcularArea() {
        return PI * raio * raio;
    }

 
    public double calcularPerimetro() {
        return 2 * PI * raio;
    }

    @Override
    public String toString() {
        return String.format("Círculo: Raio = %.2f, Área = %.2f, Perímetro = %.2f",
                raio, calcularArea(), calcularPerimetro());
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Cálculo de Área do Círculo ===");
            System.out.print("Digite o raio: ");
            double raio = scanner.nextDouble();

            Circulo circulo = new Circulo(raio);
            System.out.println("\n" + circulo);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
