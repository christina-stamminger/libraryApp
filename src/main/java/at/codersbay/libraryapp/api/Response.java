package at.codersbay.libraryapp.api;

import java.util.ArrayList;

public class Response {

    private static final int ARRAY_INITIAL_CAPACITY = 3;

    private ArrayList<String> message = new ArrayList<>(ARRAY_INITIAL_CAPACITY);
    private ArrayList<String> errorMessage = new ArrayList<>(ARRAY_INITIAL_CAPACITY);
    public boolean addMessage(String message) {
        return this.message.add(message);
    }
    public boolean addErrorMessage(String message) {
        return this.errorMessage.add(message);
    }
}
