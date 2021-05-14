package dulich.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dulich.com.entity.SalesInfor;

@Repository
public interface SalesInforRepository extends JpaRepository<SalesInfor, Long>{

}
