package com.shoppingmart.exceptions;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@SuppressWarnings({"unchecked","rawtypes"})
@ControllerAdvice
public class ExceptionHelper extends ResponseEntityExceptionHandler {
	
	//private static final Logger logger = LoggerFactory.getLogger(ExceptionHelper.class);
	
	@ExceptionHandler(RecordNotFoundException.class)
	public final ResponseEntity<Object> handleRecordNotFoundException(RecordNotFoundException ex){
		ex.printStackTrace();
		ErrorResponse error = new ErrorResponse(ex.getMessage(),HttpStatus.NOT_FOUND.value());
		return new ResponseEntity(error, HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex){
		//logger.error(ex.getStackTrace().toString());
		ex.printStackTrace();
		ErrorResponse error = new ErrorResponse(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value());
		return new ResponseEntity(error, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	@ExceptionHandler(InvalidInputException.class)
	public final ResponseEntity<Object> handleInvalidInputException(InvalidInputException ex){
		ex.printStackTrace();
		ErrorResponse error = new ErrorResponse(ex.getMessage(),HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity(error, HttpStatus.BAD_REQUEST);
		
	}

}

