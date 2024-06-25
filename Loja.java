public class Loja {
    
    protected String nome;
    protected int quantidadeFuncionarios;
    protected double salarioBaseFuncionario;
    protected Endereco endereco;
    protected Data dataFundacao;
    protected Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaxProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaxProdutos];
        
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeMaxProdutos) {
        this(nome, quantidadeFuncionarios, -1, endereco, dataFundacao, quantidadeMaxProdutos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }
    
    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos){
        this.estoqueProdutos = estoqueProdutos;
    }

    public String toString() {
        return "nome = '" + nome +
        ", quantidade de funcionarios = " + quantidadeFuncionarios +
        ", salário base funcionario = " + salarioBaseFuncionario +
        ", Endereço = " + endereco.toString() +
        ", Data de Fundaçao = " + dataFundacao.toString() +
        ", Produtos em estoque: " + estoqueProdutos.length;
    }
    
    public void imprimeProdutos() {
        for(int i = 0; i < estoqueProdutos.length; i++) {
            System.out.println("O produto na posicao " + i +" do array e  " + estoqueProdutos[i]);
        }
    }
    
    public boolean insereProduto(Produto novoProduto) {
        for(int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = novoProduto;
                return true;
            }
        }
        return false;
    }
    
    public boolean removeProduto(String nomeDoProduto) {
        for(int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                continue;
            }
            
            if (estoqueProdutos[i].getNome() == nomeDoProduto) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1;
        } else {
            return (quantidadeFuncionarios * salarioBaseFuncionario);
        }
    }
    
    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10){
            return 'P';
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }
}
