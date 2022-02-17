package app;

import entidades.EntradaLogs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o caminho do arquivo que deseja ser lido: ");
        String arquivo = entrada.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(arquivo))){

            Set<EntradaLogs> set = new HashSet<>();
            String linha = br.readLine();
            while (linha != null){

                String[] campo = linha.split(" ");
                String usuario = campo[0];
                Date h = Date.from(Instant.parse(campo[1]));

                set.add(new EntradaLogs(usuario,h));

                linha = br.readLine();
            }
            System.out.println("Total de usuários: " + set.size());
        } catch (IOException e){
            System.out.println("ERRO! " + e.getMessage());
        }
    }
}








