package strategy.comdesign;

import strategy.comdesign.Orcamento;

import java.math.BigDecimal;

public class ICMS implements  TipoImposto{

    public BigDecimal calcular(Orcamento o){
        return o.getValor().multiply(new BigDecimal("0.1"));
    }


}
