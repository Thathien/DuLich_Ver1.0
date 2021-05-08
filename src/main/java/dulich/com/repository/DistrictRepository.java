package dulich.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dulich.com.entity.District;

@Repository
public interface DistrictRepository extends JpaRepository<District, Long> {

}
