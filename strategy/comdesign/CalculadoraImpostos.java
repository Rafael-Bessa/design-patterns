package strategy.comdesign;

import strategy.comdesign.Orcamento;
import strategy.comdesign.TipoImposto;

import java.math.BigDecimal;

public class CalculadoraImpostos {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto){
        return tipoImposto.calcular(orcamento);
    }
}
