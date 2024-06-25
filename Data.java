class Data {
    
    protected int dia;
    protected int mes;
    protected int ano;
    
    public Data(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data invalida. Alterando para data padrao 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }
    
    public int getDia() {
        return dia;
    }
    
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public int getMes() {
        return mes;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    private boolean validarData(int dia, int mes, int ano) {
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1 || dia > diasNoMes(mes, ano)) {
            return false;
        } else {
            return true;
        }
    }
    
    private int diasNoMes(int mes, int ano) {
        switch (mes) {
            case 2:
                if (verificaAnoBissexto()) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
    
    public boolean verificaAnoBissexto() {
        if (ano % 4 == 0 && ano % 100 != 0) {
            return true;
        }
        return false;
    }
    
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}