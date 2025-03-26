public class Contato {

    private String nome;
    private String sexo;
    private String telefone;
    private String email;
    private double conta;

    public Contato(String nome, String sexo, String telefone, String email,double conta) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.conta= conta;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getConta() {
        return conta;
    }

    public void setConta(double conta) {
        this.conta = conta;
    }
    
    public String imprimir() {
        return ("\n Nome do Contato: "+nome+"\n Sexo do Contato: "+sexo+"\n Telefone do Contato: "+telefone+"\n Email do Contato: "+email+"\n Id:"+conta);
    }

    public Contato( double conta){
        this.conta= conta;
    }
}
