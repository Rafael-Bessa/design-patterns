package strategy.semdesign;

/**
 * Classe que não para de crescer, muitos if's
 */


import java.math.BigDecimal;

public class CalculadoraImpostos {

    public BigDecimal calcular(Orcamento o, Tipo tipoImposto){

        if(tipoImposto.equals(Tipo.ICMS)) {
            return o.getValor().multiply(new BigDecimal("0.1"));
        }

        if(tipoImposto.equals(Tipo.ISS)){
            return o.getValor().multiply(new BigDecimal("0.15"));
        }

        return BigDecimal.ZERO;

    }
}
