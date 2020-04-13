package uk.co.myopensourcesolutions.world.repository;

import org.springframework.data.repository.CrudRepository;
import uk.co.myopensourcesolutions.world.entity.City;

import java.util.List;

public interface CityRepository extends CrudRepository<City, Integer> {
//    @Query("SELECT con FROM Contact con  WHERE con.phoneType=(:pType) AND con.lastName= (:lName)")
//    List<Contact> findByLastNameAndPhoneType(@Param("pType") PhoneType pType, @Param("lName") String lName);

    List<City> findByPopulationGreaterThan(Integer population);
}
