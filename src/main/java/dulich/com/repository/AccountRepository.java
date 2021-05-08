package dulich.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dulich.com.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
