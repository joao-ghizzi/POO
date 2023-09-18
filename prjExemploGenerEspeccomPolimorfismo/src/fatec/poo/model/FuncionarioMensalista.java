package fatec.poo.model;
/**
 *
 * @author João Antonio Martins Ghizzi
 */
public class FuncionarioMensalista extends Funcionario {
    public double valSalMin;
    public double numSalmin;

    public FuncionarioMensalista(int registro, String nome, String dtAdmissao, double valSalMin) {
        super(registro, nome, dtAdmissao);
        this.valSalMin = valSalMin;
    }

    public void setNumSalmin(double numSalmin) {
        this.numSalmin = numSalmin;
    }
    
    
    
    public double calcSalBruto(){
        return(valSalMin * numSalmin);
    }
    
    
}
