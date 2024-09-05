package U5W1D4.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Topping extends Cibo{
    public Topping(String nome, int kcal, double prezzo) {
        super(nome, kcal, prezzo);
    }

    @Override
    public String toString() {
        return "Topping: " +
                getNome() + " " +
                "Kcal: " + getKcal() + " " +
                "Prezzo " + getPrezzo() + "$";
    }
}
