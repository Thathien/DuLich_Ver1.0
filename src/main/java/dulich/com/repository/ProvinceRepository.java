package dulich.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dulich.com.entity.Province;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, Long> {

}
