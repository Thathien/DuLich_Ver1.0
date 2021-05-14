package dulich.com.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CustomerSupport")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomerSupport implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "EmailCustomer", columnDefinition = "nvarchar(50)")
	private String emailCustomer;
	
	@Column(name = "NameCustomer", columnDefinition = "nvarchar(40)")
	private String nameCustomer;
	
	@Column(name = "SubjectCustomer", columnDefinition = "nvarchar(40)")
	private String subjectCustomer;
	
	@Column(name = "BodyCustomer", columnDefinition = "nvarchar(max)")
	private String bodyCustomer;
	
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name = "CreateDate")
	private Date createDate;
}
