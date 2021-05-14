package dulich.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dulich.com.entity.News;
@Repository
public interface NewsRepository extends JpaRepository<News, Long>{

}
