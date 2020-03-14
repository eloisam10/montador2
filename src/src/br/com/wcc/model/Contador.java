package src.br.com.wcc.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contador {
    public Map<Componente, Integer> contaComponentes(List<Placa> placas){
        Map<Componente, Integer> contador = new HashMap<Componente, Integer>();
        //iterando sobre a lista de placas
        for (Placa placa: placas) {
            List<Componente> componentes = placa.getComponentes();
            //iterando sobre a lista de componentes
            for (Componente componente: componentes) {
                //numero atual de um tipo de componente
                //pode ser substituido pelo contador.compute()
                contador.compute(componente, (chave, valor) ->
                        valor == null ? 1 : valor + 1);
            }
        }
        return contador;
    }
}
