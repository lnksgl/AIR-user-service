package avia.user_service.city;

public class CityNotFoundException extends RuntimeException {
    public CityNotFoundException(Long id)  {
        super("City not found. CityId: " + id);
    }
}
