package dulich.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import dulich.com.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	
	@Query(value = "from Account where UserName =:username and Password =:password")
	List<Account> login(@Param("username") String username, @Param("password") String password);
	
	@Query(value="select * from account a where a.username=:usernames", nativeQuery = true)
	Account findByUserName(@Param("username")String userName);

}
