public class Vestuario extends Loja {
    protected boolean produtosImportados;
    
    public Vestuario (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaxProdutos, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaxProdutos);
        this.produtosImportados = produtosImportados;
    }
    
    public boolean getProdutosImportados() {
        return produtosImportados;
    }
    
    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }
    
    public String toString() {
        return "Nome = '" + nome +
        ", Quantidade de funcionarios = " + quantidadeFuncionarios +
        ", Salário base funcionario = " + salarioBaseFuncionario +
        ", Endereço = " + endereco.toString() +
        ", Data de Fundaçao = " + dataFundacao.toString() +
        ", Produtos importados = " + produtosImportados;
    }
}