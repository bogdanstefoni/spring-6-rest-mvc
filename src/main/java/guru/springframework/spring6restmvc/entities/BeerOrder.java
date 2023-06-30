package guru.springframework.spring6restmvc.entities;

import jakarta.persistence.Entity;
import lombok.*;


@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BeerOrder extends AbstractBeerBaseClass{

    private String customerRef;

}
