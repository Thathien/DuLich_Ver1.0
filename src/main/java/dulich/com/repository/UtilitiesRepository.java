package dulich.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dulich.com.entity.Utilities;

@Repository
public interface UtilitiesRepository extends JpaRepository<Utilities, Long>{

}
