package br.com.fornecedores.produto.dto.request;
import br.com.fornecedores.produto.dto.FornecedorDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FornecedorProdutoRequest {
    private String gtin;
    private List<FornecedorDTO> fornecedores;
}
