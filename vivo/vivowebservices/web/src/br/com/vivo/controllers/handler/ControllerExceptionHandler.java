package br.com.vivo.controllers.handler;

import br.com.vivo.core.exceptions.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ControllerExceptionHandler {

//    @ExceptionHandler(RuntimeException.class) // colocar a exception criada
//    public ResponseEntity<StandardError> DataCardProblems(RuntimeException e){
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(StandardError.valueOf(
//                HttpStatus.BAD_REQUEST.value(), e.getMessage(), LocalDateTime.now()));
//    }

//    @ExceptionHandler(ObjectNotFoundException.class)
//    public ResponseEntity<StandardError> customerNotFound(ObjectNotFoundException e){
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(StandardError.valueOf(
//                HttpStatus.BAD_REQUEST.value(), e.getMessage(), LocalDateTime.now()
//        ));
//    }
}
