package dulich.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dulich.com.entity.Ward;

@Repository
public interface WardRepository extends JpaRepository<Ward, Long> {

}
