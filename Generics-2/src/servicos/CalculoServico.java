package servicos;

import java.util.List;

public class CalculoServico {

    public static < T extends Comparable<T>> T max(List <T> lista){
        if (lista.isEmpty()){
            throw new IllegalStateException("A lista está vazia. Não é possível continuar a operação");
        }
        T max = lista.get(0);
        for (T item : lista){
            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }
}
