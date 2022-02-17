package app;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.println("Quantos estudantes estão matriculados na turma A: " );
        int n = entrada.nextInt();

        for(int i=0; i<n; i++){
            int numAluno = entrada.nextInt();
            a.add(numAluno);
        }

        System.out.println("Quantos estudantes estão matriculados na turma B: " );
        n = entrada.nextInt();

        for(int i=0; i<n; i++){
            int numAluno = entrada.nextInt();
            b.add(numAluno);
        }

        System.out.println("Quantos estudantes estão matriculados na turma C: " );
        n = entrada.nextInt();

        for(int i=0; i<n; i++){
            int numAluno = entrada.nextInt();
            c.add(numAluno);
        }

        Set<Integer> totalAlunos = new HashSet<>(a);
        totalAlunos.addAll(b);
        totalAlunos.addAll(c);

        System.out.println("Total de estudantes: " + totalAlunos.size());
    }
}










