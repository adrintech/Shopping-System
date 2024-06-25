public class Informatica extends Loja {
    protected double seguroEletronicos;
    
    public Informatica (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaxProdutos, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaxProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }
    
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }
    
    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }
    
    public String toString() {
        return "Nome = '" + nome +
        ", Quantidade de funcionarios = " + quantidadeFuncionarios +
        ", Salário base funcionario = " + salarioBaseFuncionario +
        ", Endereço = " + endereco.toString() +
        ", Data de Fundaçao = " + dataFundacao.toString() +
        ",  Seguro dos produtos = " + seguroEletronicos;
    }
}