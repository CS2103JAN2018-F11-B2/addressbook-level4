package seedu.address.model.person.exceptions;

import seedu.address.commons.exceptions.DuplicateDataException;

/**
 * Signals that the operation will result in duplicate Person objects.
 */
public class DuplicateClientException extends DuplicateDataException {
    public DuplicateClientException() {
        super("Operation would result in duplicate clients");
    }
}
