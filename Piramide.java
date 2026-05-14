import java.util.Scanner;

public class Piramide {
    private double ladoBase;
    private double apotema;

 
    public Piramide(double ladoBase, double apotema) {
        if (ladoBase <= 0 || apotema <= 0) {
            throw new IllegalArgumentException("Lado e apótema devem ser valores positivos!");
        }
        this.ladoBase = ladoBase;
        this.apotema = apotema;
    }


    public double calcularAreaBase() {
        return ladoBase * ladoBase;
    }


    public double calcularAreaLateral() {
        return 2 * ladoBase * apotema;
    }

    public double calcularArea() {
        return calcularAreaBase() + calcularAreaLateral();
    }

    @Override
    public String toString() {
        return String.format("Pirâmide: Lado Base = %.2f, Apótema = %.2f, Área Base = %.2f, Área Lateral = %.2f, Área Total = %.2f",
                ladoBase, apotema, calcularAreaBase(), calcularAreaLateral(), calcularArea());
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Cálculo de Área Superficial da Pirâmide ===");
            System.out.print("Digite o lado da base: ");
            double ladoBase = scanner.nextDouble();
            System.out.print("Digite a apótema (altura da face triangular): ");
            double apotema = scanner.nextDouble();

            Piramide piramide = new Piramide(ladoBase, apotema);
            System.out.println("\n" + piramide);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
