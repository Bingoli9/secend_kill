package com.bingo.second_kill.second_kill.exception;

/**
 * 秒杀相关的所有业务异常
 */
public class SeckillException extends RuntimeException {
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
