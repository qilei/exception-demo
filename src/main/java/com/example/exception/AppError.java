package com.example.exception;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 *
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum AppError {
  CLIENT_ERROR(100, "请求参数无效"), INTER_ERROR(200, "系统错误"), SERVICE_ERROR(300,
      "远程服务错误"), USER_NOT_FOUND(201, "用户未找到");

  private int errorCode;
  private String errorMsg;

  AppError(int errorCode, String errorMsg) {
    this.errorCode = errorCode;
    this.errorMsg = errorMsg;
  }

  public int getErrorCode() {
    return errorCode;
  }

  public String getErrorMsg() {
    return errorMsg;
  }
}
