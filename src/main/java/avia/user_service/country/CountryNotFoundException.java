package avia.user_service.country;

public class CountryNotFoundException extends RuntimeException {
    public CountryNotFoundException(Long id) {
        super("Country not found. CountryId: " + id);
    }
}
