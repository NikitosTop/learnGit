package com.company;

public class UserNotFoundExeption extends RuntimeException{

    public UserNotFoundExeption(String message) {
        super(message);
    }
}
