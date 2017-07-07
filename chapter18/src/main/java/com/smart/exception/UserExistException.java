package com.smart.exception;

/**
 * @author jerry
 * @create 17/7/7 20:25
 */
public class UserExistException extends Exception
{
    public UserExistException(String errorMsg)
    {
        super(errorMsg);
    }
}

