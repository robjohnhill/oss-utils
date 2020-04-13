package uk.co.myopensourcesolutions.world.repository;

import org.springframework.data.repository.CrudRepository;
import uk.co.myopensourcesolutions.world.entity.CountryLanguage;
import uk.co.myopensourcesolutions.world.entity.CountryLanguageIdentity;

public interface CountryLanguageRepository extends CrudRepository<CountryLanguage, CountryLanguageIdentity> {

}
