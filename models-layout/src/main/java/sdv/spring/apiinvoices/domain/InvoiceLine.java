package sdv.spring.apiinvoices.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="invoice_lines")
@Builder
public class InvoiceLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="invoice_id")
    private Invoice invoice;

    @NotEmpty
    @Column(name = "line_number")
    private String linenumber;

    @ManyToOne
    @JoinColumn(name="good_id")
    private Good good;

    @NotNull
    private BigDecimal quantity;

    @NotNull
    @Column(name="base_amount")
    private BigDecimal baseamount;

    @NotNull
    @Column(name="currency")
    private Currency curr;

    @Column(name = "amount_in_rub")
    private BigDecimal amountInRubles;


}
