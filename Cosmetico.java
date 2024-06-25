public class Cosmetico extends Loja {
    protected double taxaComercializacao;
    
    public Cosmetico (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaxProdutos, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaxProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }
    
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }
    
    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }
    
    public String toString() {
        return "Nome = '" + nome +
        ", Quantidade de funcionarios = " + quantidadeFuncionarios +
        ", Salário base funcionario = " + salarioBaseFuncionario +
        ", Endereço = " + endereco.toString() +
        ", Data de Fundaçao = " + dataFundacao.toString() +
        ", Taxa de comercializaçao = " + taxaComercializacao;
    }
}