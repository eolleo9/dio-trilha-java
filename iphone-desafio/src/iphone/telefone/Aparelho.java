package iphone.telefone;

public class Aparelho {

    private String nomeContato;
    private int codigoContato;

    public Aparelho(String nomeContato, int codigoContato){
        this.nomeContato = nomeContato;
        this.codigoContato = codigoContato;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public int getCodigoContato() {
        return codigoContato;
    }

    
    public String toString() {
        return "nomeContato: " + nomeContato + ", codigoContato: " + codigoContato + "";
    }
    
    
}
