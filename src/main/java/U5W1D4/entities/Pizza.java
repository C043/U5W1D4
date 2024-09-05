package U5W1D4.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Pizza extends Cibo{
    private List<Topping> toppingList;

    public Pizza(String nome, int kcal, double prezzo, List<Topping> toppingList) {
        super(nome, kcal, prezzo);
        this.toppingList = toppingList;
    }

    public void addTopping(Topping topping){
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

