
package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario[] funcionarios; //multiplicidade 1..*
    private int numFunc;
    
    

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[3];
        numFunc = 0;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc++] = f;
    }
    public void listFuncionario(){
        System.out.println("\nSigla: " + sigla);
        System.out.println("nome: " + nome);
        System.out.println("Quantidade de funcionarios: " + numFunc);
        System.out.println("\nRegistro\t\tnome\t\tCargo");
        for(int i = 0; i < numFunc ; i++){
            System.out.println(funcionarios[i].getRegistro() +"\t\t\t" + funcionarios[i].getNome() + "\t" + funcionarios[i].getCargo());
            
        }
        
    }
}
