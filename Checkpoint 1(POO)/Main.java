package Checkpoint1;

public class Main {
    public static void main(String[] args) {
        Carros carro1 = new Carros("Chery Tiggo 8", "branco","BMX4E8",4,false,1.5);
        carro1.registrar();
        System.out.println(carro1.possuir());
        System.out.println(carro1.ser());

        Carros carro2 = new Carros("Volvo XC60", "cinza escuro","K6I3P1",4,false,1.8);
        carro2.registrar();
        System.out.println(carro2.possuir());
        System.out.println(carro2.ser());

        Carros carro3 = new Carros("Ford Maverick Picape FX4", "amarelo","3MKL9R",4,true,2.0);
        carro3.registrar();
        System.out.println(carro3.possuir());
        System.out.println(carro3.ser());

        Clientes cliente1 = new Clientes("gustavo","moraes", "(11)91111-1111","rua bueno lopes nº27","11111111111",true);
        cliente1.comprar();
        System.out.println(cliente1.apostador());

        Clientes cliente2 = new Clientes("agatha","galhasso","(12)92222-2222","avenida rico delgado nº336","22222222222",false);
        cliente2.comprar();
        System.out.println(cliente2.apostador());

        Clientes cliente3 = new Clientes("tiago","magna","(13)93333-3333","rua ramos de lacosta","333333333333",true);
        cliente3.comprar();
        System.out.println(cliente3.apostador());

        Funcionarios funcionario1 = new Funcionarios("david","silva","11111-1",2.500);
        funcionario1.vender();

        Funcionarios funcionario2 = new Funcionarios("alex","ituano","22222-2",2.200);
        funcionario2.vender();

        Funcionarios funcionario3 = new Funcionarios("clara","neves","33333-3",3.000);
        funcionario3.vender();

        PecasCarros pecaCarro1 = new PecasCarros("pneu",10,250.99);
        System.out.println(pecaCarro1.repor());

        PecasCarros pecaCarro2 = new PecasCarros("pastilhas de freio",5,35.99);
        System.out.println(pecaCarro2.repor());

        PecasCarros pecaCarro3 = new PecasCarros("bateria",3,1359.99);
        System.out.println(pecaCarro3.repor());









    }


}
