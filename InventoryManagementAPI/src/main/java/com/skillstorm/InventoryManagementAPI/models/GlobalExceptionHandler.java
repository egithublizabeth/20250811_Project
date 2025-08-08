package com.skillstorm.InventoryManagementAPI.models;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.HandlerMethodValidationException;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
//Class to handle Exceptions
public class GlobalExceptionHandler {
	/* used to handle ie @Valid @Validation on the method level(it comes from spring web) 
		in this case this class will be used for our DTO object (POST with response body input)
		b/c valid annotations are not set in DTO we never hit this exception
	*/
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationExceptions(
            MethodArgumentNotValidException ex) 
    {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult()
        	.getFieldErrors()
        	.forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));
        
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

    //used to handle variable constraints ie @NotNull (coming from hibernate)
	@ExceptionHandler(ConstraintViolationException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResponseEntity<Object> handleConstraintViolationException(ConstraintViolationException ex) 
	{
		 //create an object to store
	     Map<String, Object> responseBody = new HashMap<>();
	     
	     //create and object to store the property and valid error message
		 Map<String, String> errorMessage = new HashMap<>(); 
		 
		 //loop through all the violations and add key value pair to errorMessage object
	     for (ConstraintViolation<?> violation : ex.getConstraintViolations()) 
	     {
	         errorMessage.put(violation.getPropertyPath().toString(), violation.getMessage());
	     }
	     
	     //add key value pair to the object to be displayed in the response body
	     responseBody.put("Validation Error(s) Message", errorMessage); 
	
	     //return and error response with validation error message - returns a java script object
	     return new ResponseEntity<>(responseBody, HttpStatus.BAD_REQUEST);  
	 }
     
     //Used to handle primitive url parameter validation in a method parameter @validation
     @ExceptionHandler(HandlerMethodValidationException.class)
     @ResponseStatus(HttpStatus.BAD_REQUEST)
     public ResponseEntity<Object> handleMethodViolationException(HandlerMethodValidationException ex) 
     {

       //create an object and return an object
       Map<String, Object> responseBody = new HashMap<>();

       // Collect all validation errors
       Object[] errors = ex.getDetailMessageArguments();

       //insert a key value pair into the hashmap
       responseBody.put("Validation Error(s) Message", errors); 
       
       //return and error response with validation error message - returns a java script object
       return new ResponseEntity<>(responseBody, HttpStatus.BAD_REQUEST);   
     }
     
}
