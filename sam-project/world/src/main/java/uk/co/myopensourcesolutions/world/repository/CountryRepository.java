package uk.co.myopensourcesolutions.world.repository;

import org.springframework.data.repository.CrudRepository;
import uk.co.myopensourcesolutions.world.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Integer> {

}
