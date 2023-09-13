package iphone.navegador;

public class AbaNavegador {

    private String nomeSite;
    private int codigoAba;

    public AbaNavegador(String nomeSite, int codigoAba){
        this.nomeSite = nomeSite;
        this.codigoAba = codigoAba;
    }

    public String getNomeSite() {
        return nomeSite;
    }

    public int getCodigoAba() {
        return codigoAba;
    }

 
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoAba;
        return result;
    }


    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AbaNavegador other = (AbaNavegador) obj;
        if (codigoAba != other.codigoAba)
            return false;
        return true;
    }

  
    public String toString() {
        return "AbaNavegador [nomeSite: " + nomeSite + ", codigoAba: " + codigoAba + "]";
    }

    
    
    
}
