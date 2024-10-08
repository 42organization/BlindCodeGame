package gg.blind.exception;

import lombok.Getter;

@Getter
public class CustomRuntimeException extends RuntimeException {
	private ErrorCode errorCode;

	public CustomRuntimeException(ErrorCode errorCode) {
		super(errorCode.getMessage());
		this.errorCode = errorCode;
	}
}
