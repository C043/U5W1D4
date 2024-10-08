package U5W1D4.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Bevanda extends Cibo {
    private double litri;

    public Bevanda(String nome, int kcal, double prezzo, double litri) {
        super(nome, kcal, prezzo);
        this.litri = litri;
    }

    @Override
    public String toString() {
        return "Bevanda: " +
                getNome() + " " +
                getLitri() + "l " +
                "Kcal: " + getKcal() + " " +
                "Prezzo " + getPrezzo() + "$";
    }
}
