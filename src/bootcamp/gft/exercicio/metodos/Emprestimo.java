package bootcamp.gft.exercicio.metodos;

public class Emprestimo {

    public static int getTwoInstallments() {
        return 2;
    }

    public static int getTreeInstallments(){
        return 3;
    }

    public static double getTaxTwoInstallments(){
        return 0.3;
    }

    public static double getTaxTreeInstallments(){
        return 0.45;
    }

    public static void calculate(double value, int tax) {

        if (tax == 2) {
            double finalValue = value + (value * getTaxTwoInstallments());

            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + finalValue);
        } else if (tax == 3) {
            double finalValue = value + (value * getTaxTreeInstallments());

            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + finalValue);
        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }
    }
}
