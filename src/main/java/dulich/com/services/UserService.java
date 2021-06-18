package dulich.com.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import dulich.com.entity.Account;
import dulich.com.repository.AccountRepository;
import dulich.com.repository.RoleRepository;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	AccountRepository accountRepository;

	@Autowired
	RoleRepository roleRepository;

	public List<Account> login(String username, String password) {
		return accountRepository.login(username, password);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Account account = accountRepository.findByUserName(username);

		if (account != null) {
			System.out.println("User not found! " + username);
			throw new UsernameNotFoundException("User " + username + " was not found in the database");
		}
		System.out.println("Found User: " + account);

		List<String> roleNames = roleRepository.getRoleName(Long.valueOf(account.getId()));
		List<GrantedAuthority> authorities = new ArrayList<>();
		if (roleNames != null) {
			for (String role : roleNames) {
				GrantedAuthority authority = new SimpleGrantedAuthority(role);
				authorities.add(authority);
			}
		}
		UserDetails userDetails = (UserDetails) account;
		return userDetails;
	}

}
