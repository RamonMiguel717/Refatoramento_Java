import java.time.LocalDate;

public class Projeto {
    private String nome;
    private LocalDate prazo;
    private Funcionario responsavel;

    public Projeto(String nome, LocalDate prazo, Funcionario responsavel) {
        this.nome = nome;
        this.prazo = prazo;
        this.responsavel = responsavel;
    }

    public Projeto(String nome, LocalDate prazo) {
        this(nome, prazo, null);
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public Funcionario getResponsavel() {
        return responsavel;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.responsavel = funcionario;
        System.out.println("Funcionário " + funcionario.getNome() + " foi adicionado ao projeto.");
    }

    public void removerFuncionario() {
        this.responsavel = null;
        System.out.println("Responsável foi removido do projeto.");
    }

    public boolean validarPrazo() {
        return prazo.isAfter(LocalDate.now());
    }
}
