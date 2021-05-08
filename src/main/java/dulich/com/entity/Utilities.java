package dulich.com.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

public class Utilities {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UtilId")
	private Long utilId;

	@Column(name = "UtilName", columnDefinition = "nvarchar(40)")
	private String utilName;

	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name = "CreateDate")
	private Date createDate;

	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	@Column(name = "UpdateDate")
	private Date updateDate;

}
