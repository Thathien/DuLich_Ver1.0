package dulich.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dulich.com.entity.NewsType;

@Repository
public interface NewsTypeRepository extends JpaRepository<NewsType, Long> {

}
