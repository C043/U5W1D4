package U5W1D4.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_cibo")
@NoArgsConstructor
public abstract class Cibo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private int kcal;
    @Column(nullable = false)
    private double prezzo;

    public Cibo(String nome, int kcal, double prezzo) {
        this.nome = nome;
        this.kcal = kcal;
        this.prezzo = prezzo;
    }
}
