package dulich.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dulich.com.entity.Homestay;

@Repository
public interface HomestayRepository extends JpaRepository<Homestay, Long> {

}
