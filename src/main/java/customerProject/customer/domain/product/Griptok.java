package customerProject.customer.domain.product;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("G")
@Getter
@Setter
public class Griptok extends Product{
}
