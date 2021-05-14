package dulich.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dulich.com.entity.CustomerSupport;

@Repository
public interface CustomerSupportRepository extends JpaRepository<CustomerSupport, Long> {

}
