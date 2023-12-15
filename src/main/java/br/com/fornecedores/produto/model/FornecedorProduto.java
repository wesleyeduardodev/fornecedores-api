package br.com.fornecedores.produto.model;
import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "fornecedor_produto")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FornecedorProduto {

    @Id
    @SequenceGenerator(name = "id_fornecedor_produto_seq", sequenceName = "pk_id_fornecedor_produto", allocationSize = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_fornecedor_produto_seq")
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_produto", nullable = false)
    private Produto produto;

    @OneToOne
    @JoinColumn(name = "id_fornecedor", nullable = false)
    private Fornecedor fornecedor;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<PrecoFornecedorProduto> precosFornecedorProduto;
}
