package org.crumb.be.common.exception;

public class NotFoundException extends BusinessException {
    public NotFoundException(String message) {
        super(ErrorCode.NOT_FOUND, message);
    }
}
