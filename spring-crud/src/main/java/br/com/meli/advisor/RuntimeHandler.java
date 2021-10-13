package br.com.meli.advisor;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import br.com.meli.exception.PersistenceException;
import br.com.meli.exception.ServiceException;

@RestControllerAdvice
public class RuntimeHandler {

	@Autowired
	private MessageSource messageSource; // https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/MessageSource.html

	@ExceptionHandler(value = RuntimeException.class)
	protected ResponseEntity<Object> handleConflict(RuntimeException ex, WebRequest request) {
		String bodyOfResponse = ex.getMessage();
		return ResponseEntity.badRequest().body(bodyOfResponse);
	}

	@ExceptionHandler(value = ArithmeticException.class)
	protected ResponseEntity<Object> handleArithmetic(ArithmeticException ex, WebRequest request) {
		String bodyOfResponse = ex.getMessage();
		return ResponseEntity.badRequest().body(bodyOfResponse);
	}

	@ExceptionHandler(value = PersistenceException.class)
	protected ResponseEntity<Object> handleArithmetic(PersistenceException ex, WebRequest request) {
		String bodyOfResponse = ex.getMessage();
		return ResponseEntity.badRequest().body(bodyOfResponse);
	}

	@ExceptionHandler(value = ServiceException.class)
	protected ResponseEntity<Object> handleArithmetic(ServiceException ex, WebRequest request) {
		String bodyOfResponse = ex.getMessage();
		return ResponseEntity.badRequest().body(bodyOfResponse);
	}

	
	
	/**
	 * para testar se a internacionalização funciona corretamente, adicione um Header à requisição (no Postman):
	 * KEY: Accept-Language
	 * VALUE: en-US; pt-BR; etc
	 * @param ex
	 * @return
	 */
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String fieldName = ((FieldError) error).getField();
			// String errorMessage = error.getDefaultMessage();
			String errorMessage = messageSource.getMessage(error, LocaleContextHolder.getLocale());
			errors.put(fieldName, errorMessage);
		});
		return errors;
	}
}
