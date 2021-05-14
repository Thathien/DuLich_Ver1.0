package dulich.com.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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

@Entity

public class Booking implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BookingId")
	private Long bookingId;

	@Column(name = "DateStart", columnDefinition = "datetime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateStart;

	@Column(name = "DateEnd", columnDefinition = "datetime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEnd;

	@Min(value = 1)
	@Column(name = "NumberAdults")
	private int numberAdults;

	@Min(value = 0)
	@Column(name = "NumberChildren")
	private int numberChildren;

	@Min(value = 0)
	@Column(name = "NumberInfant")
	private int numberInfant;

	@Column(name = "CustomerName", columnDefinition = "nvarchar(40)")
	private String customerName;

	@Column(name = "Country", columnDefinition = "nvarchar(40)")
	private String country;

	@Column(name = "IsBookForAnother", columnDefinition = "bit")
	private boolean isBookForAnother;

	@Column(name = "CustomerEmail", columnDefinition = "nvarchar(40)")
	private String customerEmail;

	@Column(name = "CustomerPerpose", columnDefinition = "nvarchar(40)")
	private String customerPerpose;

	@Column(name = "SalesCode", columnDefinition = "nvarchar(40)")
	private String salesCode;

	@Column(name = "BookingStatus", columnDefinition = "nvarchar(40)")
	public String bookingStatus;

	@Column(name = "PaymentStatus", columnDefinition = "nvarchar(40)")
	public String paymentStatus;

	
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name = "CreateDate")
	private Date createDate;

	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	@Column(name = "UpdateDate")
	private Date updateDate;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "HomeStayID", referencedColumnName = "HomeStayID")
	private Homestay homestay;
}
