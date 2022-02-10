package bootcamp.gft.exercicio.metodos;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercicio Calculadora");
        Calculadora.sum(3, 6);
        Calculadora.less(9, 1.8);
        Calculadora.multiplication(7, 8);
        Calculadora.division(7, 8);

        System.out.println("Exercício Mensagem");
        Mensagem.getMessage(9);
        Mensagem.getMessage(14);
        Mensagem.getMessage(1);

        System.out.println("Exercício Emprestimo");
        Emprestimo.calculate(1000, Emprestimo.getTwoInstallments());
        Emprestimo.calculate(1000, Emprestimo.getTreeInstallments());
        Emprestimo.calculate(1000, 5);
    }
}
