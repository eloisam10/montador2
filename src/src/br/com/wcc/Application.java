package src.br.com.wcc;

import src.br.com.wcc.model.Componente;
import src.br.com.wcc.model.Contador;
import src.br.com.wcc.model.Montador;
import src.br.com.wcc.model.Placa;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args){
        Montador montador = new Montador(); //Montando como objeto
        final List<Placa> placas = montador.montarPlacas(5);
        System.out.println(placas.toString());

        Contador contador = new Contador();
        Map<Componente,Integer> tabelaContador = contador.contaComponentes(placas);
        for (Map.Entry<Componente, Integer> linha : tabelaContador.entrySet()) {
            System.out.println(linha.getKey() + ":" + linha.getValue());
        }
    }
}