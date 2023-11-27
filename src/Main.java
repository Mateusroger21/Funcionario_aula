import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionario 1: ");
        String nomeFuncionario1 = scanner.nextLine();
        Funcionario funcionario1= new Funcionario(nomeFuncionario1);

        System.out.print("Digite o nome do funcionario 2: ");
        String nomeFuncionario2 = scanner.nextLine();
        Funcionario funcionario2 = new Funcionario(nomeFuncionario2);

        System.out.print("Digite o nome do cargo: ");
        String nomeCargo = scanner.nextLine();

        System.out.print("Digite o  salário base do cargo: ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite os benefícios do cargo: ");
        String beneficiosCargo = scanner.nextLine();

        Cargo cargo = new Cargo(nomeCargo, salarioBase, beneficiosCargo);

        funcionario1.atribuirCargo(cargo);
        funcionario2.atribuirCargo(cargo);
        System.out.print("Informe o numero de horas trabalhadas pelo funcionario 1: ");
        int horasTrabalhadas1 = scanner.nextInt();
        funcionario1.registrarHorasTrabalho(horasTrabalhadas1);

        funcionario1.calcularSalario();

        System.out.print("Informe o numero de horas trabalhadas pelo funcionario 2: ");
        int horasTrabalhadas2 = scanner.nextInt();

        funcionario2.registrarHorasTrabalho(horasTrabalhadas2);
        funcionario2.calcularSalario();


    }
}
