import exception.ParametrosInvalidosException;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmentro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmentro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException e){
            System.out.println("O Segundo parâmetro deve ser maior que o primeiro.");
        }

    }
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for(int i = parametroUm ; i <= parametroDois; i++){
            System.out.println("Imprimindo os números da variável contagem " + i);
        }

    }


}