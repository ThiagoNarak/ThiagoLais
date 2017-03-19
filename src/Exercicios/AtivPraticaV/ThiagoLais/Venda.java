package Exercicios.AtivPraticaV.ThiagoLais;
public class Venda {

    //variaveis - vetor n inicialisando

    private Produto produtosCarrinhos[] = new Produto[100];
    private int quantidadeIntens[]= new int[100];
    double valorTotal=0;
    int aux =0;

    //construtor padrao

    public Venda(){

    }

    //set de produto

    public void setProduto(int quantidade, Produto produto){
        this.produtosCarrinhos[aux] = produto;
        this.quantidadeIntens[aux]= quantidade;
        this.valorTotal = valorTotal+(produto.getPrecoUnitario()*quantidade);

        this.aux++;
    }

    //Imprimir os produtos e os valores

    public void imprimirCarrinho(){
        for (int i = 0; i < produtosCarrinhos.length; i++) {
            if(produtosCarrinhos[i]==null){

                break;
            }else{
                System.out.printf("Produto: %s\tQuantidade: %d\tValor Unitario: %.2f\tValor Agupado: %.2f \n",this.produtosCarrinhos[i].getDescricao(),this.quantidadeIntens[i], this.produtosCarrinhos[i].getPrecoUnitario(), this.produtosCarrinhos[i].getPrecoUnitario()*this.quantidadeIntens[i]  );

            }
        }
    }

}