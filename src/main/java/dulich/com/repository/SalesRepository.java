package dulich.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dulich.com.entity.Sales;

@Repository
public interface SalesRepository extends JpaRepository<Sales, Long>{

}
