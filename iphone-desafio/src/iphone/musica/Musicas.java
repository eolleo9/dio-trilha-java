package iphone.musica;


public class Musicas {
    private String nomeMusica;
    private int codigoMusica;

    public Musicas(String nomeMusica, int codigoMusica){
        this.nomeMusica = nomeMusica;
        this.codigoMusica = codigoMusica;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public int getCodigoMusica() {
        return codigoMusica;
    }

  
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomeMusica == null) ? 0 : nomeMusica.hashCode());
        return result;
    }

 
    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Musicas other = (Musicas) obj;
        if (nomeMusica == null) {
            if (other.nomeMusica != null)
                return false;
        } else if (!nomeMusica.equals(other.nomeMusica))
            return false;
        return true;
    }

    
    public String toString() {
        return "Título: " + nomeMusica + ", " + "Código: " + codigoMusica;
    }

    
    
    
}
