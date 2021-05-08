package dulich.com.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public class Homestay {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "HomeStayID")
	private Long homeStayID;

	@Column(name = "Title", columnDefinition = "nvarchar(60)")
	public String title;

	@Column(name = "Hagtag", columnDefinition = "varchar(60)")
	public String hagtag;

	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "LocationID", referencedColumnName = "Id")
	private District district;

	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "HomeStayTypeID", referencedColumnName = "HomeStayTypeID")
	private HomestayType homestayType;

	@Min(value = 10)
	@Column(name = "TotalArea")
	private int totalArea;
	
	@Min(value = 1)
	@Column(name = "MinNumberPeople")
	private int minNumberPeople;

	@Column(name = "MaxNumberPeople")
	private int maxNumberPeople;

	@Min(value = 1)
	@Column(name = "NumberAdults")
	private int numberAdults;

	@Min(value = 0)
	@Column(name = "NumberChildren")
	private int numberChildren;

	@Min(value = 0)
	@Column(name = "NumberInfant")
	private int numberInfant;

	@Column(name = "IsHide", columnDefinition = "bit")
	private boolean isHide;

	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name = "CreateDate")
	private Date createDate;

	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	@Column(name = "UpdateDate")
	private Date updateDate;

}
