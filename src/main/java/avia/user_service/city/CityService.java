package avia.user_service.city;

import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class CityService {

    CityRepository cityRepository;

    public void saveCity(City city) {
        cityRepository.save(city);
    }

    public City getCityById(Long id) {
        return cityRepository.findById(id).orElseThrow(() -> new CityNotFoundException(id));
    }

    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    public void updateCity(City city) {
        saveCity(city);
    }

    public void deleteCity(City city) {
        cityRepository.delete(city);
    }
}
