package Checkpoint1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carros carro1 = new Carros("Chery Tiggo 8", "branco","BMX4E8",4,false,1.3);
        carro1.registrar();
        carro1.isEletrico(true);
        System.out.println(carro1.possuir());
        System.out.println(carro1.ser());

        Carros carro2 = new Carros("Volvo XC60", "cinza escuro","K6I3P1",4,false,1.8);
        carro2.registrar();
        carro2.isEletrico(true);
        System.out.println(carro2.possuir());
        System.out.println(carro2.ser());

        Carros carro3 = new Carros("Ford Maverick Picape FX4", "amarelo","3MKL9R",4,true,2.0);
        carro3.registrar();
        System.out.println(carro3.possuir());
        System.out.println(carro3.ser());

        Carros carro4 = new Carros("Fiat Argo", "azul","km9jh4",2,true,1.7);
        carro4.registrar();
        System.out.println(carro3.possuir());
        System.out.println(carro3.ser());


        Clientes cliente1 = new Clientes("gustavo","moraes", 33933333333L,"rua bueno lopes nº27","33333333333",true);
        cliente1.comprar();
        System.out.println(cliente1.apostador());

        Clientes cliente2 = new Clientes("agatha","galhasso",11911111111L,"avenida rico delgado nº336","11111111111",false);
        cliente2.comprar();
        System.out.println(cliente2.apostador());

        Clientes cliente3 = new Clientes("tiago","magna",22922222222L,"rua ramos de lacosta","22222222222",true);
        cliente3.comprar();
        System.out.println(cliente3.apostador());

        Clientes cliente4 = new Clientes("bruno","stevan",44944444444L,"rua dira de ramos","44444444444",true);
        cliente4.comprar();
        System.out.println(cliente4.apostador());

        Clientes cliente5 = new Clientes("bianca","soares",66966666666L,"avenida oswaldo ibira","66666666666",false);
        cliente5.comprar();
        System.out.println(cliente5.apostador());

        Clientes cliente6 = new Clientes("antony","silva",55955555555L,"rua gamelinha branca","55555555555",true);
        cliente6.comprar();
        System.out.println(cliente6.apostador());


        Funcionarios funcionario1 = null;
        try {
            funcionario1 = new Funcionarios("david","silva","11111-1",2.000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        funcionario1.vender();

        Funcionarios funcionario2 = null;
        try {
            funcionario2 = new Funcionarios("alex","ituano","22222-2",2.200);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        funcionario2.vender();

        Funcionarios funcionario3 = null;
        try {
            funcionario3 = new Funcionarios("clara","neves","33333-3",3.000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        funcionario3.vender(500.00);
        funcionario3.addClientes(cliente1);
        funcionario3.addClientes(cliente2);
        funcionario3.addClientes(cliente3);
        funcionario3.addClientes(cliente4);
        funcionario3.addClientes(cliente5);
        funcionario3.addClientes(cliente6);

        funcionario3.mostrarClientesFidelidade();


        PecasCarros pecaCarro1 = null;
        try {
            pecaCarro1 = new PecasCarros("pneus",10,250.99);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(pecaCarro1.repor());

        PecasCarros pecaCarro2 = null;
        try {
            pecaCarro2 = new PecasCarros("pastilhas de freio",5,35.99);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(pecaCarro2.repor());

        PecasCarros pecaCarro3 = null;
        try {
            pecaCarro3 = new PecasCarros("baterias",3,1359.99);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(pecaCarro3.repor());
        carro1.mostrar(pecaCarro1);
        carro2.mostrar(pecaCarro1);
        carro2.mostrar(pecaCarro2);
        carro3.mostrar(pecaCarro2);
        carro1.mostrar(pecaCarro3);
        carro2.mostrar(pecaCarro3);
        carro3.mostrar(pecaCarro3);


        Scanner scanner = new Scanner(System.in);
        Carros carro5 = new Carros("0","0","0",0,false,0.0);
        System.out.println("\nInsira um novo modelo de carro:");
        carro5.setModelo(scanner.next());
        System.out.println("Insira uma cor:");
        carro5.setCor(scanner.next());
        System.out.println("Insira a placa do carro:");
        carro5.setPlaca(scanner.next());
        System.out.println("Insira quantas portas possui:");
        carro5.setPortas(scanner.nextInt());
        System.out.println("Insira se é carro quatro por quatro ou não:");
        carro5.setQuatroPorQuatro(scanner.nextBoolean());
        System.out.println("Insira a potência do motor:");
        carro5.setMotor(scanner.nextDouble());

        System.out.println("Novo carro modelo" + " " + carro5.getModelo() + " " + "com placa" + " " + carro5.getPlaca() + " " +
                "inserido no sistema");

    }


}
