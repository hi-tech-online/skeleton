package com.hitech.skeleton.exception;

/**
 * @author Steven
 */
public class AlreadyExistException extends GlobalException {
    public AlreadyExistException(String message, int code) {
        super(message, code);
    }
}
