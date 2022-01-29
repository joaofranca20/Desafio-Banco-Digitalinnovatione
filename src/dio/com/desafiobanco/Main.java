package dio.com.desafiobanco;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Digite seu nome: ");
        String comprador = scan.next();
        int item;

        Cliente joao = new Cliente();
        joao.setNome(comprador);

        System.out.println(" O Cliente " + comprador + " deseja comprar um item, verifique se o valor corresponde.");
        System.out.println(" Valor do item: ");
        item = scan.nextInt();


        Conta cc = new ContaCorrente(joao);
        Conta poupanca = new ContaPoupanca(joao);

        cc.depositar(3000);
        cc.transferir(3000, poupanca);

        poupanca.imprimirExtrato();

        if(item < poupanca.saldo){
            System.out.println("O item pode ser comprado!");
        } else{
            System.out.println("O item ainda não pode ser comprado.");
        }
    }



}
