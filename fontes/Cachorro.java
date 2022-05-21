public class Cachorro extends Mamifero {
    private String nome;

    public Cachorro(Integer peso, boolean ehPeludo, String nome) {
        super(peso, ehPeludo);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void latir() {
        System.out.println("AU AU !");
    }
}
//
//public
//private
//protected
