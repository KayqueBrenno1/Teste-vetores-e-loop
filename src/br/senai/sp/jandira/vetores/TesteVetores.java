package br.senai.sp.jandira.vetores;

public class TesteVetores {

    public static void main(String[] args) {
        double[] notas = new double[6];
        notas[3] = 9.0;
        notas[1] = 8.6;
        notas[4] = 7.4;
        notas[0] = 6.9;
        notas[2] = 7.1;
        notas[5] = 10.0;

        System.out.println("Nota 4: " + notas[3]);

        notas[3] = 8.7;

        System.out.println("Nota 4: " + notas[3]);

        System.out.println("Tamanho do vetor: " + notas.length);

        double[] notas2 = notas.clone();

        System.out.println("------------------");
        System.out.println(notas2[3]);
        notas2[3] = 2.9;
        System.out.println(notas2[3]);
        System.out.println(notas[3]);

        System.out.println("------------------");

        int i = 0;
        while (i < notas.length){
            System.out.println(i + " - " + notas[i]);
            i = i + 1;
        }
        System.out.println("F I M");
    }
}
