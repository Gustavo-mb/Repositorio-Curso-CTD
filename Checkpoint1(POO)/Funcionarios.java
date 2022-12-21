package Checkpoint1;

public class Funcionarios {
    private String nome;
    private String sobrenome;
    private String registro;
    private Double salario;


    public Funcionarios(String nome, String sobrenome, String registro, Double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.registro = registro;
        this.salario = salario;
    }

    public void vender(){
        System.out.println("\nvendedor(a)" + " " + nome + " " + sobrenome + " " + "realizou uma nova venda!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}



