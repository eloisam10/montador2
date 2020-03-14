package src.br.com.wcc.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Montador
 */
public class Montador {
    private List<Placa> placas = new ArrayList<Placa>();

    //Método
    //Retorna a quantidade de placas
    //Monta n placas
    public List<Placa> montarPlacas(int numPlacas){
        for (int i = 0; i < numPlacas; i++) {
            Placa placa = montarPlaca(5);
            placas.add(placa);
        }
        return placas;
    }
    //Método
    //Retorna quantos componentes tem em cada placa
    //Monta uma só
    private Placa montarPlaca(int numComponentes) {
        Placa placa = new Placa();
        for (int i = 0; i < numComponentes; i++) {
            placa.addComponente(Componente.escolherComponente());
        }
        return placa;
    }


    @Override
    public String toString() {
        return placas.toString();
    }


}
