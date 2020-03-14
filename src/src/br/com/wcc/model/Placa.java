package src.br.com.wcc.model;

import java.util.*;

public class Placa {
    private List<Componente> componentes = new ArrayList<Componente>();

    public void addComponente(Componente componente){
        componentes.add(componente);
    }

    @Override
    public String toString() {//Faz uma representação do objeto
        return componentes.toString() + "\n";
    }
//Fez com o Getter, pra outras clases conseguirem ver o componentes
    public List<Componente> getComponentes() {
        return componentes;
    }

}


