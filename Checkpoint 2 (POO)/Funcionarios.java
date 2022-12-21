package Checkpoint1;

import java.util.ArrayList;
import java.util.Collections;

public class Funcionarios {
    private String nome;
    private String sobrenome;
    private String registro;
    private Double salario;
    private ArrayList<Clientes> listaClientes = new ArrayList<>();
    public Funcionarios(String nome, String sobrenome, String registro, Double salario) throws Exception {

        if (salario < 2.000) {
           throw new Exception("O numero inserido é inválido!");
        }

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.registro = registro;
        this.salario = salario;
    }

    public void vender(){
        System.out.println("\nvendedor(a)" + " " + nome + " " + sobrenome + " " + "realizou uma nova venda!");
    }

    public void vender(Double bonus){
        System.out.println("\nparabéns vendedor(a)" + " " + nome + " " + sobrenome + " " + " que realizou uma nova venda e ganhou um bonus de" +
                " " + bonus);
    }


    public void addClientes(Clientes cliente){
        listaClientes.add(cliente);
        System.out.println("\nnovo cliente chamado" + " " + cliente.getNome() + " " + cliente.getSobrenome() + " " + "adicionado");
    }

    public void mostrarClientesFidelidade() {
        Collections.sort(listaClientes);
        for (Clientes clientes : listaClientes) {
            if (clientes.getFidelidade()) {
                System.out.println("\nNome:" + clientes.getNome() + " " + clientes.getSobrenome() + " " + clientes.getTelefone());
            }
        }

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



