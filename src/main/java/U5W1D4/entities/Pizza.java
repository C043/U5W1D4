package U5W1D4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Pizza extends Cibo {
    @ManyToMany
    @JoinTable(
            name = "pizza_topping",
            joinColumns = @JoinColumn(name = "pizza_id"),
            inverseJoinColumns = @JoinColumn(name = "topping_id")
    )
    private List<Topping> toppingList = new ArrayList<>();

    public Pizza(String nome, int kcal, double prezzo, List<Topping> toppingList) {
        super(nome, kcal, prezzo);
        this.toppingList = toppingList;
    }

    public void addTopping(Topping topping) {
        this.toppingList.add(topping);
    }

    @Override
    public String toString() {
        return "Pizza: " +
                getNome() + " " +
                "Kcal: " + getKcal() + " " +
                "Prezzo " + getPrezzo() + "$";
    }
}

