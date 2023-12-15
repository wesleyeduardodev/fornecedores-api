package br.com.fornecedores.produto.model;
import lombok.*;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "preco_fornecedor_produto")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PrecoFornecedorProduto {

    @Id
    @SequenceGenerator(name = "id_preco_fornecedor_produto_seq", sequenceName = "pk_id_preco_fornecedor_produto", allocationSize = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_preco_fornecedor_produto_seq")
    private Long id;

    @Column(name = "quantidade_minima", nullable = false)
    private Integer quantidadeMinima;

    @Column(name = "preco", nullable = false)
    private BigDecimal preco;

    @ManyToOne
    @JoinColumn(name = "id_fornecedor_produto", referencedColumnName = "id")
    private FornecedorProduto fornecedorProduto;
}
