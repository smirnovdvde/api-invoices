package sdv.spring.apiinvoices.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Builder
@Data
@Table(name="companies")
@Entity(name="companies")
@AllArgsConstructor
@NoArgsConstructor
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @NotEmpty
    private String name;
    @NotNull
    @NotEmpty
    private String country;
    @NotNull
    @NotEmpty
    private String address;
    @Email
    private String email;

    private String phone;

    @NotEmpty
    private String tin;

    @Override
    public boolean equals(Object obj) {
        if (obj  instanceof Company == false)
            return false;

        Company companyToCompare = (Company)  obj;
        if (this.getTin().equals(companyToCompare.getTin()))
            return true;
        else
            return false;

    }
}
