package desafios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
DESAFIO

Jogo de Craps:
Faça um programa que implemente um jogo de Craps. O jogador lança um par de dados, obtendo um valor entre 2 e 12.

Regras:

a) Se, na primeira jogada, você tirar 7 ou 11, você é um "Natural" e ganha;
b) Se você tirar 2, 3 ou 12 na primeira jogada, isto é chamado de "Craps" e você perdeu;

c) Se, na primeira jogada, você fez um 4, 5, 6, 8, 9 ou 10, este é seu "Ponto";
d) Seu objetivo agora é continuar jogando os dados até tirar este número novamente;
e) Você perde, no entanto, se tirar um 7 antes de tirar este Ponto novamente;
 */


public class CrapsDesafio {

    public static void main(String args[]) {
        System.out.println("______ JOGO CRAPS - BOA SORTE - _____ ");
        System.out.println(" ");


        int[] v = gerarVetor(2);
        System.out.println(Arrays.toString(v) + " ");

        int[] vDois = gerarVetorDois(2);


        int i;
        for (i = 0; i < v.length; i++) {
            if ((v[i] == 7) || (v[i] == 11)) {
                System.out.println("VOCÊ GANHOU!");
                break;

            } else if((v[i] == 2) || (v[i] == 3) || (v[i] == 12)){
                System.out.println("VOCÊ PERDEU!");
                break;

            }else if((v[i] == 4) || (v[i] == 5) || (v[i] == 6) || (v[i] == 8) || (v[i] == 9) || (v[i] == 10)){

                System.out.println("VAMOS TENTAR NOVAMENTE?");
                System.out.println(Arrays.toString(vDois) + " ");

                if(vDois[i] == 7) {
                    System.out.println(" VOCê PERDEU ");
                }
            }
        }
    }



    public static int[] gerarVetor(int tamanho) {

            int[] vetor = new int[tamanho];
            Random gerador = new Random();

            for(int i = 0; i < vetor.length; i++){
                vetor[i] = gerador.nextInt(12) + 2;
            }

            return vetor;
        }

    public static int[] gerarVetorDois(int tamanho) {

        int[] vDois = new int[tamanho];
        Random gerador = new Random();

        for(int j = 0; j < vDois.length; j++){
            vDois[j] = gerador.nextInt(12) + 2;
        }

        return vDois;
    }



    }


