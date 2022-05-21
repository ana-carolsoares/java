public class Mamifero {
    private Integer peso;
    private boolean ehPeludo;

    public Mamifero(Integer peso, boolean ehPeludo) {
        this.peso = peso;
        this.ehPeludo = ehPeludo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public boolean isEhPeludo() {
        return ehPeludo;
    }

    public void setEhPeludo(boolean ehPeludo) {
        this.ehPeludo = ehPeludo;
    }
}
