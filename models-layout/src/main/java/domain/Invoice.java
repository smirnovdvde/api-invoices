package domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class Invoice {

    @Id
    private Long id;
    private String Number;
    private LocalDate Date;
}
