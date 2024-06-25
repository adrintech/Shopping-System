class Produto {
    
    protected String nome;
    protected double preco;
    protected Data dataValidade;
    
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public Data getDataValidade() {
        return dataValidade;
    }
    
    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    public boolean estaVencido(Data data) {
        if (dataValidade.ano < data.ano) {
            return true;
        } else if (dataValidade.ano == data.ano) {
            if (dataValidade.mes < data.mes) {
                return true;
            } else if (dataValidade.mes == data.mes) {
                if (dataValidade.dia < data.dia) {
                    return true;
                }
            }
        } 
        return false;
    }
    
    public String toString() {
        return "nome = '" + nome +
        ", preço = " + preco +
        ", data de validade = " + dataValidade.toString();
    }
}