package Exercicios.AtivPraticaV.Thiago;

/**
 * Created by thiago on 16/03/2017.
 */
public class Produto {
    private int codigo;
    private double valorUnidatio;
    private String descricaoItem;
    private static Produto listaProdutos[];
    private int quantidade;

    public Produto(int codigo, double valorUnidatio, String descricaoItem,int quantidade) {
        this.codigo = codigo;
        this.valorUnidatio = valorUnidatio;
        this.descricaoItem = descricaoItem;
        this.quantidade = quantidade;
    }

    public static Produto[] getListaProdutos(){
        listaProdutos = new Produto[15];
        listaProdutos[0]= new Produto(1,10,"sapato",10);
        listaProdutos[1]= new Produto(2,30,"roupa",10);
        listaProdutos[2]= new Produto(3,40,"colar",10);
        listaProdutos[3]= new Produto(4,45,"pulseira",10);
        listaProdutos[4]= new Produto(5,50,"bolsa",10);
        listaProdutos[5]= new Produto(6,55,"brinco",10);
        listaProdutos[6]= new Produto(7,60,"carteira",10);
        listaProdutos[7]= new Produto(8,70,"lousa",10);
        listaProdutos[8]= new Produto(9,80,"aulas",10);
        listaProdutos[9]= new Produto(10,90,"tiara",10);
        listaProdutos[10]= new Produto(11,100,"notebook",10);
        listaProdutos[11]= new Produto(12,200,"netbook",10);
        listaProdutos[12]= new Produto(13,300,"pendrive",10);
        listaProdutos[13]= new Produto(14,400,"fonte",10);
        listaProdutos[14]= new Produto(15,500,"cadeira",10);
        return listaProdutos;
    }

    public static Produto buscar(int codigo){
        Produto produto[];
        Produto produtoRetorno;
        produto =getListaProdutos();
        for (int i = 0; i <15 ; i++) {
            if(produto[i].codigo==codigo){
                 produtoRetorno=produto[i];
                return produtoRetorno;
            }
        }
        return  null;
    }
    public String getDescricaoItem(){

        return descricaoItem;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValorUnidatio() {
        return valorUnidatio;
    }

    public void setValorUnidatio(double valorUnidatio) {
        this.valorUnidatio = valorUnidatio;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public static void setListaProdutos(Produto[] listaProdutos) {
        Produto.listaProdutos = listaProdutos;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
