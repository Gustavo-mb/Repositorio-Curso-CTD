package Checkpoint1;

public class Carros {
    private String modelo;
    private String cor;
    private String placa;
    private Integer portas;
    private Boolean isQuatroPorQuatro;
    private Double motor;


    public Carros(String modelo, String cor, String placa, Integer portas, Boolean isQuatroPorQuatro, Double motor) {
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.portas = portas;
        this.isQuatroPorQuatro = isQuatroPorQuatro;
        this.motor = motor;

    }


    public void registrar(){
        System.out.println("\ncarro"+ " " + modelo + "," + " " + "cor" + " " + cor + "," + " " + "placa"+ " " + placa + "," + " " + portas + " " + "portas," + " " + "motor" + " " +
             motor + " " + "inserido");
    }

    public String possuir(){
        if (motor >= 1.8) {
            return modelo + " " + "é carro top!!";
        } else return modelo + " " + "é carro bom";
    }

    public String ser(){
        if (isQuatroPorQuatro == true) {

            return "carro modelo 4x4" ;

        }else

            return "carro modelo comum";
        }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }




}

