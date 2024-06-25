public class Shopping {
    String nome;
    Endereco endereco;
    Loja[] lojas;
    
    public Shopping(String nome, Endereco endereco, int quantidadeMaxLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaxLojas];
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Loja[] getLojas(){
        return lojas;
    }
    
    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }
    
    public boolean insereLoja(Loja novaLoja) {
        for(int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = novaLoja;
                return true;
            }
        }
        return false;
    }
    
    public boolean removeLoja(String nomeDaLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                continue;
            }
            
            if (lojas[i].getNome() == nomeDaLoja) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public Informatica lojaSeguroMaisCaro(){
        double seguroMaisCaro = 0;
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i] instanceof Informatica) {
                Informatica lojaInformatica = (Informatica) lojas[i];
                if (lojaInformatica.getSeguroEletronicos() > seguroMaisCaro) {
                    return ((Informatica) lojas[i]);
                }
            }
        }
        return null;
    }
    
    public int quantidadeLojasPorTipo(String tipoDaLoja) {
        int quantLojasTipo = 0;
        
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null) {
                switch (tipoDaLoja.toLowerCase()) {
                    case "cosmetico":
                        if (lojas[i] instanceof Cosmetico) {
                            quantLojasTipo++;               
                        }
                        break;
                    
                    case "bijuteria":
                        if (lojas[i] instanceof Bijuteria) {
                            quantLojasTipo++;
                        }
                        break;
                        
                    case "vestuario":
                        if (lojas[i] instanceof Vestuario) {
                            quantLojasTipo++;
                        }
                        break;
                    
                    case "alimentacao":
                        if (lojas[i] instanceof Alimentacao) {
                            quantLojasTipo++;
                        }
                        break;
                    
                    case "informática":
                        if (lojas[i] instanceof Informatica) {
                            quantLojasTipo++;
                        }
                        break;
                }
            }
        }
        if (quantLojasTipo == 0){
           return -1; 
        } else {
            return quantLojasTipo;
        }
    }
}