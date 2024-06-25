public class Bijuteria extends Loja {
    protected double metaVendas;
    
    public Bijuteria (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaxProdutos, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaxProdutos);
        this.metaVendas = metaVendas;
    }
    
    public double getMetaVendas() {
        return metaVendas;
    }
    
    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }
    
    public String toString() {
        return "Nome = '" + nome +
        ", Quantidade de funcionarios = " + quantidadeFuncionarios +
        ", Salário base funcionario = " + salarioBaseFuncionario +
        ", Endereço = " + endereco.toString() +
        ", Data de Fundaçao = " + dataFundacao.toString() +
        ",  Meta de Vendas = " + metaVendas;
    }
}