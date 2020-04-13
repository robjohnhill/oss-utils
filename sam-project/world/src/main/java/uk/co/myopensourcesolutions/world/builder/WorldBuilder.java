package uk.co.myopensourcesolutions.world.builder;

import org.springframework.stereotype.Component;
import uk.co.myopensourcesolutions.world.api.CityResponse;
import uk.co.myopensourcesolutions.world.api.CityResponses;
import uk.co.myopensourcesolutions.world.entity.City;

import java.util.ArrayList;
import java.util.List;

@Component
public class WorldBuilder {
    public CityResponse buildCityResponse(City city) {
        CityResponse cityResponse = new CityResponse();
        cityResponse.setId(city.getId());
        cityResponse.setName(city.getName());
        cityResponse.setCountryCode(city.getCountryCode());
        cityResponse.setDistrict(city.getDistrict());
        cityResponse.setPopulation(city.getPopulation());
        return cityResponse;
    }

    public CityResponses buildCityResponses(Iterable<City> cities) {
        List<CityResponse> cityResponsesList = new ArrayList<>();
        cities.forEach(c -> cityResponsesList.add(buildCityResponse(c)));
        CityResponses cityResponses = new CityResponses();
        cityResponses.setCities(cityResponsesList);
        return cityResponses;
    }
}
