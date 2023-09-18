package fatec.poo.model;

/**
 *
 * @author João Antonio Martins Ghizzi
 */
public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;

    public Funcionario(int registro, String nome, String dtAdmissao) {
        this.registro = registro;
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
    }

    public int getRegistro() {
        return registro;
    }
    
    
    public String getCargo() {
        return cargo;
    }
    

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }
}
