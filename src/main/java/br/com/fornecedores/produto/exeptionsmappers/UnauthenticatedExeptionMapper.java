package br.com.fornecedores.produto.exeptionsmappers;
import br.com.fornecedores.produto.api.ApiResponse;
import br.com.fornecedores.produto.exceptions.NegocioException;
import br.com.fornecedores.produto.exceptions.UnauthenticatedExeption;
import br.com.fornecedores.produto.view.ErroView;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class UnauthenticatedExeptionMapper {

    @ExceptionHandler(value = UnauthenticatedExeption.class)
    public ResponseEntity<ErroView> toResponse(NegocioException e) {
        return ApiResponse.unauthorized(e.getMessage());
    }
}
