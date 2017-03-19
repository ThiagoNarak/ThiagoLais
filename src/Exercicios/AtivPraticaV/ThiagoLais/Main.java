package Exercicios.AtivPraticaV.ThiagoLais;


        import java.util.Scanner;

/**
 * Created by lais on 18/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        //variaveis

        int codigo;
        int quantidade;

        //declarando o objeto

        Produto produto;
        Venda venda;

        Scanner scanner = new Scanner(System.in);
        venda = new Venda();

        // valida e receber o codigo do produto
        boolean repete = false;
        do {
            System.out.println("Informe o codigo do produto");
            codigo = scanner.nextInt();

            produto = Produto.buscar(codigo);
           // venda.imprimirCarrinho();
            if(produto == null){
                System.out.println("Codigo invalido");
            }else{
                System.out.println("O produto selecionado é: " +produto.getDescricao());

                System.out.println("Informe quantos intens você vai levar desse produto");
                quantidade= scanner.nextInt();

                venda.setProduto(quantidade,produto);

                System.out.println("Deseja inserir outro produto");
                System.out.println("1-sim, 2-não");
                codigo = scanner.nextInt();

                if(codigo == 1){
                    repete = true;
                }else{
                    System.out.println("Imprimindo o resumo da comprar ");
                    venda.imprimirCarrinho();
                    System.out.println("Valor total é: " +venda.valorTotal);
                    Pagamento pagamento;
                    System.out.println("Digite a forma de pagamento");
                    System.out.println("1- Credito");
                    System.out.println("2- Vista");
                    System.out.println("3- Cheque");
                    int menu=scanner.nextInt();
                    repete=false;

                    switch (menu){
                        case 1:
                            pagamento=new Credit();
                            pagamento.formaPagamento(venda.valorTotal);
                            break;
                        case 2:
                            pagamento = new Vista();
                            pagamento.formaPagamento(venda.valorTotal);
                            break;
                        case 3:
                            pagamento = new Cheque();
                            pagamento.formaPagamento(venda.valorTotal);
                            break;


                    }
                }
            }
        }while(repete != false);



    }



}