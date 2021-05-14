package dulich.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dulich.com.entity.HomestayType;

@Repository
public interface HomestayTypeRepository extends JpaRepository<HomestayType, Long> {

}
