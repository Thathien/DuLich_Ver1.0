package dulich.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dulich.com.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	@Query(value = "select * from Account a join AccountRole b on a.AccId=b.AccId join Role c on b.RoleId=c.RoleId where a.AccId=?1", nativeQuery = true)
	List<String> getRoleName(Long accountID);
}
