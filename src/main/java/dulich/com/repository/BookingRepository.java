package dulich.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dulich.com.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>{

}
