package com.org.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.org.dto.ErrorResponseDTO;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	

	@ResponseBody
	@ExceptionHandler(ReservationAlreadyExist.class)
	public ResponseEntity<ErrorResponseDTO> reservationAlreadyExist(ReservationAlreadyExist reservationAlreadyExist){
		ErrorResponseDTO error=new ErrorResponseDTO(ApplicationErrorCodes.errorCode,ApplicationErrorCodes.errorName1001,reservationAlreadyExist.getMessage(),reservationAlreadyExist.getResId());
		return ResponseEntity.status(ApplicationErrorCodes.errorCode).body(error);
	}
	
	@ResponseBody
	@ExceptionHandler(NotFoundExceptionApplication.class)
	public ResponseEntity<ErrorResponseDTO> notFoundException(NotFoundExceptionApplication notFoundException){
		ErrorResponseDTO error=new ErrorResponseDTO(404,"NOT_FOUND",notFoundException.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
}


