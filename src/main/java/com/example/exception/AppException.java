package com.example.exception;


/**
 * Created by qilei on 17/4/1.
 */
public class AppException extends RuntimeException {

  private AppError appError;

  public AppException(AppError appError) {
    this.appError = appError;
  }

  public AppException(String message, AppError appError) {
    super(message);
    this.appError = appError;
  }

  public AppException(String message, Throwable cause, AppError appError) {
    super(message, cause);
    this.appError = appError;
  }

  public AppException(Throwable cause, AppError appError) {
    super(cause);
    this.appError = appError;
  }

  public AppError getAppError() {
    return appError;
  }
}
