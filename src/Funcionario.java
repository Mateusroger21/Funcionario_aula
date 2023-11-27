
public class Funcionario {
    private String nome;

    private Cargo cargo;

    private double salario;

    private int horasTrabalhadas;

    public Funcionario(String nome) {
        this.nome =  nome;
        this.salario = 0.0;
        this.horasTrabalhadas = 0;
    }
    public void atribuirCargo(Cargo cargo) {
        this.cargo = cargo;
        System.out.println(nome + " agora é " + cargo.getNome());
    }
    public void registrarHorasTrabalho(int horas) {
        this.horasTrabalhadas += horas;
        System.out.println(nome +  " registrou " + horas + " horas de trabalho. ");
    }
    public void calcularSalario() {
        if (cargo != null) {
            this.salario = cargo.calcularSalario(horasTrabalhadas);
        }
        else {
            System.out.println("Atribua um cargo ao funcionário antes de calcular");
        }

    }
}
