package avia.user_service.country;

import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class CountryService {

    CountryRepository countryRepository;

    public void saveCountry(Country country) {
        countryRepository.save(country);
    }

    public Country getCountryById(Long id) {
        return countryRepository.findById(id).orElseThrow(() -> new CountryNotFoundException(id));
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public void updateCountry(Country country) {
        saveCountry(country);
    }

    public void deleteCountry(Country country) {
        countryRepository.delete(country);
    }
}
