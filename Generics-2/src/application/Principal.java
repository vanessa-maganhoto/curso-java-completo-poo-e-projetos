package application;

import entidades.Produto;
import servicos.CalculoServico;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<>();

        String caminhoArquivo = "/home/vanessa/cursos/curso-java-completo-poo-e-projetos/Generics-2/lista-produtos.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))){
            String  linha = br.readLine();
            while (linha != null){
                String [] caminho = linha.split(",");
                lista.add(new Produto(caminho[0], Double.parseDouble(caminho[1])));
                linha = br.readLine();
            }

            Produto x = CalculoServico.max(lista);
            System.out.println("Max: ");
            System.out.println(x);

        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
