package Exercicios.AtivPraticaV.Thiago;

/**
 * Created by thiago on 16/03/2017.
 */
public class Venda {
    private Produto carrinho[];
    int quantidade[];


    public Venda(Produto[] listaProduto,int qtd) {
       // this.carrinho = new Produto[];
        quantidade=new int [qtd];

    }
    public void setProduto(Produto produto,int quantidade){
        double total= produto.getValorUnidatio()*quantidade;


    }


}
