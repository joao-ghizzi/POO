
import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;



public class Aplic {    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in); 
       DecimalFormat df = new DecimalFormat("#,##0.00");
       ContaCorrente[] banco = new ContaCorrente[15];
       int numConta, num, opcao, cont; 
       double valor;
       
       for (cont = 0; cont < 15; cont++){
           System.out.print("Digite o numero da conta: ");
           numConta = entrada.nextInt();
           System.out.print("Digite o saldo inicial: ");
           valor = entrada.nextDouble();
           banco[cont] = new ContaCorrente(numConta, valor);
       }
       
       do{
            System.out.println("\n\n\n\tConta Corrente");
            System.out.println("\n1-Depositar");
            System.out.println("2-Sacar");
            System.out.println("3-Consultar saldo");
            System.out.println("4-Listar Contas");
            System.out.println("5-Sair");
            System.out.print("\n\n\tDigite a opcao: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.print("\nDigite o numero da conta");
                    numConta = entrada.nextInt();                   
                    for (cont=0; cont < 15; cont++){
                        if (banco[cont].getNumero() == numConta){
                            break;
                        }    
                    }
                    if (cont == 15) { 
                        System.out.println("Conta nao cadastrada!");
                    }
                    else{
                        System.out.print("\nDigite o valor depósito: ");
                        banco[cont].depositar(entrada.nextDouble());                       
                    }
                    break;
                    
                case 2:
                    System.out.print("\nDigite o numero da conta");
                    numConta = entrada.nextInt();
                    for (cont=0; cont < 15; cont++){
                        if (banco[cont].getNumero() == numConta){
                            break;
                        }    
                    }
                    if (cont == 15) { 
                        System.out.println("Conta nao cadastrada!");
                    }
                    else{
                        System.out.print("\nDigite o valor do saque: ");
                        valor = entrada.nextDouble();
                        if(valor > banco[cont].getSaldo()){
                            System.out.println("Saldo insuficiente!");
                        }
                        else{
                            banco[cont].sacar(valor);                            
                        }
                    }                    
                    break;
                
                case 3:
                    System.out.print("\nDigite o numero da conta");
                    numConta = entrada.nextInt();
                    for (cont=0; cont < 15; cont++){
                        if (banco[cont].getNumero() == numConta){
                            break;
                        }    
                    }
                    if (cont == 15) { 
                        System.out.println("Conta nao cadastrada!");
                    }
                    else{
                        System.out.println("O saldo da conta: " + df.format(banco[cont].getSaldo()));
                    }                    
                    break;
                
                case 4: 
                    System.out.println("\n\tNúmero da Conta\t\tSaldo");
                    for (cont=0; cont < 15; cont++){
                        System.out.println("\t\t"+ banco[cont].getNumero() + 
                                           "\t\t" + df.format(banco[cont].getSaldo()));
                    }
                    break;
            }       
        }while(opcao != 5);
    }    
}
