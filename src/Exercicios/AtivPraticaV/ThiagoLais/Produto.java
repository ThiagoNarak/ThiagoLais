package Exercicios.AtivPraticaV.ThiagoLais;
public class Produto {
    //variaveis

    private int codigo;
    private double precoUnitario;
    private String descricao;

    //vetor que se chama ListaProduto do tipo Produto

    private static Produto ListaProduto[];

    //construtor padrao

    public Produto() {
    }


    //construtor personalizado

    public Produto(int codigo, double precoUnitario, String descricao) {
        this.codigo = codigo;
        this.precoUnitario = precoUnitario;
        this.descricao = descricao;
    }

    //intanciando a classe Produto e retornando a ListaProduto

    public static Produto [] getListaProduto(){
        ListaProduto = new Produto[15];
        ListaProduto[0] = new Produto(1,50,"blusa");
        ListaProduto[1] = new Produto(2,70,"calca");
        ListaProduto[2] = new Produto(3,50,"bolsa");
        ListaProduto[3] = new Produto(4,30,"binco");
        ListaProduto[4] = new Produto(5,40,"colar");
        ListaProduto[5] = new Produto(6,80,"short");
        ListaProduto[6] = new Produto(7,100,"blusa da moda");
        ListaProduto[7] = new Produto(8,40,"capinha de celular");
        ListaProduto[8] = new Produto(9,80,"vestido");
        ListaProduto[9] = new Produto(10,70,"saia");
        ListaProduto[10] = new Produto(11,50,"casaco");
        ListaProduto[11] = new Produto(12,80,"tenis");
        ListaProduto[12] = new Produto(13,20,"meia");
        ListaProduto[13] = new Produto(14,5,"liga de cabelo");
        ListaProduto[14] = new Produto(15,150,"berloque pandora");

        return ListaProduto;
    }

    //metodo para buscar qual produto corresponde ao codigo selecionado static esta sempre exposto

    public static Produto buscar(int codigo){
        Produto lista[]= getListaProduto();
        Produto produto = new Produto();
        for (int i = 0; i < 14; i++) {
            if(lista[i].codigo == codigo){
                produto=lista[i];
            }

        }
        return produto;

    }

    //metodos get and set


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static void setListaProduto(Produto[] listaProduto) {
        ListaProduto = listaProduto;
    }
}