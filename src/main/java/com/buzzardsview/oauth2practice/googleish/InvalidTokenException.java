package com.buzzardsview.oauth2practice.googleish;

public class InvalidTokenException extends Exception {
    public InvalidTokenException(String message) {
        super(message);
    }
}
