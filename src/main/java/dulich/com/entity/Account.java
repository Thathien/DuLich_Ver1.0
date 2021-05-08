package dulich.com.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Account", uniqueConstraints = { @UniqueConstraint(columnNames = "UserName", name = "ACCOUNT_UK") })
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Account {

	@Id
	@Column(name = "AccId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "FirsrName", columnDefinition = "nvarchar(40)")
	private String firstName;

	@Column(name = "LastName", columnDefinition = "nvarchar(40)")
	private String lastName;

	@Column(name = "Email", columnDefinition = "nvarchar(60)")
	private String email;

	@Column(name = "Avata", columnDefinition = "nvarchar(60)")
	private String avata;

	@Column(name = "PhoneNumber", columnDefinition = "nvarchar(10)")
	private String phoneNumber;

	@Column(name = "UserName", columnDefinition = "nvarchar(50)")
	private String userName;

	@Column(name = "Password", length = 128, nullable = false)
	private String password;

	@Column(name = "TokenActive", columnDefinition = "nvarchar(max)")
	private String tokenActive;

	@Column(name = "IsActive", columnDefinition = "bit")
	private boolean isActive;

	@Column(name = "IsLock", columnDefinition = "bit")
	private boolean isLock;

	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name = "CreateDate")
	private Date createDate;

	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	@Column(name = "UpdateDate")
	private Date updateDate;

}
