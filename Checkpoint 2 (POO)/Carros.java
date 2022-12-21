package Checkpoint1;

import java.util.ArrayList;

     public class Carros implements CarroEletrico {
         private String modelo;
         private String cor;
         private String placa;
         private Integer portas;
         private Boolean isQuatroPorQuatro;
         private Double motor;

         private ArrayList<PecasCarros> listaPecas = new ArrayList<>();



         public Carros(String modelo, String cor, String placa, Integer portas, Boolean isQuatroPorQuatro, Double motor) {
             this.modelo = modelo;
             this.cor = cor;
             this.placa = placa;
             this.portas = portas;
             this.isQuatroPorQuatro = isQuatroPorQuatro;
             this.motor = motor;

         }

         public void registrar() {
             System.out.println("\ncarro" + " " + modelo + "," + " " + "cor" + " " + cor + "," + " " + "placa" + " " + placa + "," + " " + portas + " " + "portas," + " " + "motor" + " " +
                     motor + " " + "inserido");
         }

         public String possuir() {
             if (motor >= 1.8) {
                 return modelo + " " + "é carro top!!";
             } else return modelo + " " + "é carro bom";
         }

         public String ser() {
             if (isQuatroPorQuatro == true) {

                 return "carro modelo 4x4";

             } else

                 return "carro modelo comum";
         }

         public void mostrar(PecasCarros pecas) {
             listaPecas.add(pecas);
             System.out.println("\npeças de carro disponíveis para" + " " + getModelo() + ":" + " " + pecas.getTipo() +
                     " " + "saindo por" +  " " + pecas.getPreco() + " " + "cada");

         }

         @Override
         public void isEletrico(Boolean valor){
             if (valor == true){
                 System.out.println("Carro" + " " + getModelo() + " " + "placa" + " " + getPlaca() + " " + "é um carro elétrico");
             } else
                System.out.println("Carro" + " " + getModelo() + " " + "placa" + " " + getPlaca() + " " + " não é um carro elétrico!");
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

         public String getPlaca() {
             return placa;
         }

         public void setPlaca(String placa) {
             this.placa = placa;
         }

         public Integer getPortas() {
             return portas;
         }

         public void setPortas(Integer portas) {
             this.portas = portas;
         }

         public Boolean getQuatroPorQuatro() {
             return isQuatroPorQuatro;
         }

         public void setQuatroPorQuatro(Boolean quatroPorQuatro) {
             isQuatroPorQuatro = quatroPorQuatro;
         }

         public Double getMotor() {
             return motor;
         }

         public void setMotor(Double motor) {
             this.motor = motor;
         }

         public ArrayList<PecasCarros> getListaPecas() {
             return listaPecas;
         }

         public void setListaPecas(ArrayList<PecasCarros> listaPecas) {
             this.listaPecas = listaPecas;
         }
     }