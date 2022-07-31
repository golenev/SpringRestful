package com.golenev.spingrrestful.spingrrestful.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS)
public class CustomException extends RuntimeException{

}
