package br.com.rafaeljavaudemy.primeiro_exemplo_udemy.handler;


import br.com.rafaeljavaudemy.primeiro_exemplo_udemy.model.erro.ErroMenssage;
import br.com.rafaeljavaudemy.primeiro_exemplo_udemy.model.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice//controle global de exceções
public class RestExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResouceNotFoundException(ResourceNotFoundException ex) {

        ErroMenssage erro = new ErroMenssage(
                "Recurso não encontrado",
                HttpStatus.NOT_FOUND.value(),
                ex.getMessage()
        );
                return new ResponseEntity<>(erro, HttpStatus.NOT_FOUND);

    }

}
