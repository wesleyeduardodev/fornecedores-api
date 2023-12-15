package br.com.fornecedores.produto.model;
import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "produto")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    @Id
    @SequenceGenerator(name = "id_produto_seq", sequenceName = "pk_id_produto", allocationSize = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_produto_seq")
    private Long id;

    @Column(name = "gtin", unique = true, length = 256, nullable = false)
    private String gtin;

    @Column(name = "nome", nullable = false, length = 256)
    private String nome;
}
