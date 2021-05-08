package dulich.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dulich.com.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
