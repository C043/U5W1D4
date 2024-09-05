package U5W1D4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Topping extends Cibo {
    @ManyToMany(mappedBy = "toppingList")
    private List<Pizza> pizzaList = new ArrayList<>();

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
