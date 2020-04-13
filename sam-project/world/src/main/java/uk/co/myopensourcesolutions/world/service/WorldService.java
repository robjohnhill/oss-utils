package uk.co.myopensourcesolutions.world.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.myopensourcesolutions.world.entity.City;
import uk.co.myopensourcesolutions.world.repository.CityRepository;

@Component
public class WorldService {

    @Autowired
    private CityRepository cityRepository;

    public Iterable<City> getAllCity() {
        return cityRepository.findAll();
    }

    public Iterable<City> getCityWithPopulationsGreaterThan(Integer population) {
        return cityRepository.findByPopulationGreaterThan(population);
    }
}
