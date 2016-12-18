package trix2.exceptions;

import com.amazonaws.AmazonServiceException;

public class InvalidArgumentException extends AmazonServiceException {
	private static final long serialVersionUID = 1L;

    public InvalidArgumentException(String message) {
        super(message);
    }
}
