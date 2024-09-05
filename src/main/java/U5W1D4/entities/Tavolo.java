package U5W1D4.entities;

import U5W1D4.enums.StatoTavolo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Tavolo {
    private int numeroTavolo;
    private int massimoCoperti;
    private StatoTavolo statoTavolo;
}
