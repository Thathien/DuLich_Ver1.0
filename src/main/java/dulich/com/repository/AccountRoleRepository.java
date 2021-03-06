package dulich.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dulich.com.entity.AccountRole;

@Repository
public interface AccountRoleRepository extends JpaRepository<AccountRole, Long> {

}
