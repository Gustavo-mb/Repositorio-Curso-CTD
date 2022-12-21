package Checkpoint1;

public class Clientes {
    private String nome;
    private String sobrenome;
    private String telefone;
    private String endereco;
    private String cpf;

    private Boolean isFidelidade;


    public Clientes(String nome, String sobrenome, String telefone, String endereco, String cpf, Boolean isFidelidade) {
      this.nome = nome;
      this.sobrenome = sobrenome;
      this.telefone = telefone;
      this.endereco = endereco;
      this.cpf = cpf;
      this.isFidelidade = isFidelidade;
    }


    public void comprar(){
        System.out.println("\ncliente" + " " + nome + " " + sobrenome + " " + "realizou uma nova compra");
    }

    public String apostador() {
        if (isFidelidade == true) {

            return "cliente elegível para programa fidelidade :)";

        } else

            return "cliente ainda não elegível para programa fidelidade :(";

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getFidelidade() {
        return isFidelidade;
    }

    public void setFidelidade(Boolean fidelidade) {
        isFidelidade = fidelidade;
    }
}


