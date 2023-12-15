package br.com.fornecedores.produto.dto;
import br.com.fornecedores.produto.utils.FormatadorUtil;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FornecedorDTO {
    private String cnpj;
    private List<PrecoDTO> precos;
    private String nome;

    public void setCnpj(String cnpj) {
        this.cnpj = FormatadorUtil.removerCaracteresNaoNumericos(cnpj);
    }
}
