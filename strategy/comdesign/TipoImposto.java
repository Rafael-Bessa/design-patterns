package strategy.comdesign;

import strategy.comdesign.Orcamento;

import java.math.BigDecimal;

public interface TipoImposto {

    public BigDecimal calcular(Orcamento o);
}
