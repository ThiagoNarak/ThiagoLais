package Exercicios.AtivPraticaV.Thiago;

/**
 * Created by thiago on 16/03/2017.
 */
public class Produto {
    private int codigo;
    private double valorUnidatio;
    private String descricaoItem;
    private static Produto listaProdutos[];

    public Produto(int codigo, double valorUnidatio, String descricaoItem) {
        this.codigo = codigo;
        this.valorUnidatio = valorUnidatio;
        this.descricaoItem = descricaoItem;
    }

    public static Produto[] getListaProdutos(){
        listaProdutos = new Produto[15];
        listaProdutos[0]= new Produto(1,10,"sapato");
        listaProdutos[1]= new Produto(2,30,"roupa");
        listaProdutos[2]= new Produto(3,40,"colar");
        listaProdutos[3]= new Produto(4,45,"pulseira");
        listaProdutos[4]= new Produto(5,50,"bolsa");
        listaProdutos[5]= new Produto(6,55,"brinco");
        listaProdutos[6]= new Produto(7,60,"carteira");
        listaProdutos[7]= new Produto(8,70,"lousa");
        listaProdutos[8]= new Produto(9,80,"aulas");
        listaProdutos[9]= new Produto(10,90,"tiara");
        listaProdutos[10]= new Produto(11,100,"notebook");
        listaProdutos[11]= new Produto(12,200,"netbook");
        listaProdutos[12]= new Produto(13,300,"pendrive");
        listaProdutos[13]= new Produto(14,400,"fonte");
        listaProdutos[14]= new Produto(15,500,"cadeira");
        listaProdutos[15]= new Produto(16,600,"vidro");
        return listaProdutos;
    }

    public static Produto buscar(int codigo){

        return  null;
    }
    public String getDescricaoItem(){

        return descricaoItem;
    }

}
