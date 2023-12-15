package br.com.fornecedores.produto.model;
import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "fornecedor")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Fornecedor {

    @Id
    @SequenceGenerator(name = "id_fornecedor_seq", sequenceName = "pk_id_fornecedor", allocationSize = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_fornecedor_seq")
    private Long id;

    @Column(name = "cnpj", unique = true, nullable = false, length = 14)
    private String cnpj;

    @Column(name = "nome", nullable = false, length = 256)
    private String nome;
}
