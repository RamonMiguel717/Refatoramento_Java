
public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario(String nome, String cargo) {
        this(nome, cargo, 0);
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public String getInfo() {
        return "Nome: " + nome + ", Cargo: " + cargo + ", Salário: " + salario;
    }

    public void exibirInfo() {
        System.out.println(getInfo());
    }
}
