package Exercicios.AtivPraticaV.Thiago;

import java.util.Scanner;

/**
 * Created by thiago on 16/03/2017.
 */
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Produto produto;
        Venda venda;
        boolean valida=false;
        // ETAPA 1
        System.out.println("digite o codigo do item.");
        int codigo= entrada.nextInt();
        // ETAPA 2
        do{
          //  venda = new Venda(Produto.getListaProdutos());

            produto = Produto.buscar(codigo);
            if (produto==null){
                System.out.println("codigo digitado incorreto.");
                valida=false;
            }else{
                System.out.printf("Encontramos o produto %s. \n",produto.getDescricaoItem());
                valida=true;
                System.out.println("Digite a quantidade.");
                //venda
            }

        }while(valida!=true);



    }
}
