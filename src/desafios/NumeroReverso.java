package desafios;

import java.util.Scanner;

public class NumeroReverso {
    public static void numeroReverso() {

            Scanner scan = new Scanner(System.in);
            do {
                System.out.println("Informe um valor inteiro e positivo (este número deverá conter 4 dígitos): ");
                int numeroInformado = scan.nextInt();
                String numeroInformadoString = String.valueOf(numeroInformado);
                if (numeroInformado >= 1000 && numeroInformado <= 9999) {
                    StringBuilder stringBuilder = new StringBuilder(numeroInformadoString);
                    System.out.println(stringBuilder.reverse());
                    break;
                } else if (numeroInformadoString.length() < 4) {
                    System.out.println("O número informado deverá conter 4 dígitos!");
                }
            } while (true);
        }
    }
