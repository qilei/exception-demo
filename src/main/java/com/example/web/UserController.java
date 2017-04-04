package com.example.web;

import com.example.exception.AppError;
import com.example.exception.AppException;
import com.example.domain.User;
import com.example.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qilei on 17/3/29.
 */
@RestController
@ControllerAdvice
public class UserController {

  private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

  @Autowired
  private UserService userService;

  @RequestMapping("/user/{id}")
  public ResponseEntity<User> findOne(@PathVariable Integer id) {
    User user = userService.findOne(id);
    return new ResponseEntity(user, HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @ExceptionHandler(AppException.class)
  public ResponseEntity<AppError> handleException(AppException ex) {
    LOG.error(ex.getMessage(), ex);
    return new ResponseEntity(ex.getAppError(), HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
