import fatec.poo.model.FuncionarioHorista;
import java.text.DecimalFormat;
import fatec.poo.model.FuncionarioMensalista;
/**
 *
 * @author João Antonio Martins Ghizzi
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,
                                                            "Pedro Silveira",
                                                            "14/05/1978",
                                                            15.80);
        funcHor.setCargo("Programador");
        funcHor.setQtdeHorTrab(90);
        System.out.println("Salario Bruto => " + df.format(funcHor.calcSalBruto()));
        
        System.out.println("Desconto => " + df.format(funcHor.calcDesconto()));
        
        System.out.println("Salario Liquido => " + df.format(funcHor.calcSalLiquido()));
        
        System.out.println("cargo => " + funcHor.getCargo());
        
        System.out.println("Gratificacao => " + funcHor.calcGratificacao());
        
        FuncionarioMensalista funcMen = new FuncionarioMensalista(1010,
                                                            "Pedro Andrade",
                                                            "15/06/1979",
                                                            2.50);
        funcMen.setCargo("Programador");
        funcMen.setNumSalmin(1200);
        System.out.println("\nSalario Bruto => " + df.format(funcMen.calcSalBruto()));
        
        System.out.println("Desconto => " + df.format(funcMen.calcDesconto()));
        
        System.out.println("Salario Liquido => " + df.format(funcMen.calcSalLiquido()));
        
        System.out.println("cargo " + funcMen.getCargo());
        
    }
    
}
