import java.util.Scanner;

public class Bola {
    private double raio;
    private static final double PI = Math.PI;


    public Bola(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser um valor positivo!");
        }
        this.raio = raio;
    }


    public double calcularArea() {
        return 4 * PI * raio * raio;
    }


    public double calcularVolume() {
        return (4.0 / 3.0) * PI * raio * raio * raio;
    }

    @Override
    public String toString() {
        return String.format("Bola: Raio = %.2f, Área Superficial = %.2f, Volume = %.2f",
                raio, calcularArea(), calcularVolume());
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Cálculo de Área Superficial da Bola ===");
            System.out.print("Digite o raio: ");
            double raio = scanner.nextDouble();

            Bola bola = new Bola(raio);
            System.out.println("\n" + bola);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
