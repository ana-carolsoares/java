import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        Cachorro var1 = new Cachorro(10, true, "Nala");
        Cachorro var2 = new Cachorro(20, true, "Ace");

        Baleia var3 = new Baleia(2000);
        Baleia var4 = new Baleia(1000);

        List<Mamifero> listaVacinados = new ArrayList<>();
        listaVacinados.add(var1);
        listaVacinados.add(var2);
        listaVacinados.add(var3);

        for (int i = 0; i < listaVacinados.size(); i++) {
            if (listaVacinados.get(i) instanceof Cachorro) {
                Cachorro a = (Cachorro) listaVacinados.get(i);
                a.latir();
            } else if (listaVacinados.get(i) instanceof Baleia) {
                Baleia a = (Baleia) listaVacinados.get(i);
            }
        }
    }
}
