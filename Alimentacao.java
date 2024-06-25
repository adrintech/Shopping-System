public class Alimentacao extends Loja {
    protected Data dataAlvara;
    
    public Alimentacao (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaxProdutos, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaxProdutos);
        this.dataAlvara = dataAlvara;
    }
    
    public Data getDataAlvara() {
        return dataAlvara;
    }
    
    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }
    
    public String toString() {
        return "Nome = '" + nome +
        ", Quantidade de funcionarios = " + quantidadeFuncionarios +
        ", Salário base funcionario = " + salarioBaseFuncionario +
        ", Endereço = " + endereco.toString() +
        ", Data de Fundaçao = " + dataFundacao.toString() +
        ",  Data do alvara de funcionamento = " + dataAlvara;
    }
}