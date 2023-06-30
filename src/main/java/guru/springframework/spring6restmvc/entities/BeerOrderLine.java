package guru.springframework.spring6restmvc.entities;

import jakarta.persistence.Entity;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BeerOrderLine extends AbstractBeerBaseClass{
    private Integer orderQuantity = 0;
    private Integer quantityAllocated = 0;
}
