import java.util.Scanner;


public class Tubo {
    private double raio;
    private double altura;
    private static final double PI = Math.PI;

 
    public Tubo(double raio, double altura) {
        if (raio <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Raio e altura devem ser valores positivos!");
        }
        this.raio = raio;
        this.altura = altura;
    }


    public double calcularAreaBases() {
        return 2 * PI * raio * raio;
    }
    public double calcularAreaLateral() {
        return 2 * PI * raio * altura;
    }

  
    public double calcularArea() {
        return calcularAreaBases() + calcularAreaLateral();
    }


    public double calcularVolume() {
        return PI * raio * raio * altura;
    }

    @Override
    public String toString() {
        return String.format("Tubo: Raio = %.2f, Altura = %.2f, Área Bases = %.2f, Área Lateral = %.2f, Área Total = %.2f, Volume = %.2f",
                raio, altura, calcularAreaBases(), calcularAreaLateral(), calcularArea(), calcularVolume());
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Cálculo de Área Superficial do Tubo ===");
            System.out.print("Digite o raio: ");
            double raio = scanner.nextDouble();
            System.out.print("Digite a altura: ");
            double altura = scanner.nextDouble();

            Tubo tubo = new Tubo(raio, altura);
            System.out.println("\n" + tubo);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
