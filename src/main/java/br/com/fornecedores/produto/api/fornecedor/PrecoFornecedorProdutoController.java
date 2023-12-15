package br.com.fornecedores.produto.api.fornecedor;
import br.com.fornecedores.produto.api.ApiResponse;
import br.com.fornecedores.produto.dto.request.FornecedorProdutoRequest;
import br.com.fornecedores.produto.dto.response.FornecedorProdutoResponse;
import br.com.fornecedores.produto.exceptions.IndisponivelException;
import br.com.fornecedores.produto.exceptions.NaoEncontradoException;
import br.com.fornecedores.produto.exceptions.NegocioException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrecoFornecedorProdutoController implements PrecoFornecedorProdutoAPI {

    @Autowired
    private PrecoFornecedorProdutoFacade fornecedorProdutoFacade;

    @Override
    public ResponseEntity<FornecedorProdutoResponse> findByGtin(String gtin) {
        return ApiResponse.ok(fornecedorProdutoFacade.findByGtin(gtin));
    }

    @Override
    public ResponseEntity<?> criarPedidos(FornecedorProdutoRequest precoFornecedorProdutoRequest) throws NegocioException, IndisponivelException, NaoEncontradoException {
        fornecedorProdutoFacade.criarFornecedoresParaProduto(precoFornecedorProdutoRequest);
        return ResponseEntity.ok().build();
    }
}
