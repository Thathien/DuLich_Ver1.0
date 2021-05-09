package dulich.com.entity;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Homestay")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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
	private District districtLocaion;

	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "HomeStayTypeID", referencedColumnName = "HomeStayTypeID")
	private HomestayType homestayType;

	@Min(value = 10)
	@Column(name = "TotalArea")
	private int totalArea;

	@Column(name = "BodyContent", columnDefinition = "nvarchar(max)")
	private String bodyContent;

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

	@Min(value = 1)
	@Column(name = "MinOfNight")
	private int minOfNight;

	@Min(value = 1)
	@Column(name = "MaxOfNight")
	private int maxOfNight;

	@Min(value = 0)
	@Column(name = "PassengerFeeIncrease", columnDefinition = "money")
	private double passengerFeeIncrease;

	@Min(value = 0)
	@Column(name = "ChildFeesIncrease", columnDefinition = "money")
	private double childFeesIncrease;

	@Min(value = 1)
	@Column(name = "WeekdayPrice", columnDefinition = "money")
	private double weekdayPrice;

	@Min(value = 1)
	@Column(name = "WeeKendPrice", columnDefinition = "money")
	private double weekendPrice;

	@Min(value = 1)
	@Column(name = "HolidayPrice", columnDefinition = "money")
	private double holidayPrice;

	@Min(value = 1)
	@Column(name = "NumberRoom")
	private int numberRoom;
	
	@Column(name = "IsHide", columnDefinition = "bit")
	private boolean isHide;

	@Column(name = "IsAprove", columnDefinition = "bit")
	private boolean isAprove;

	@Column(name = "IsPriority", columnDefinition = "bit")
	private boolean isPriority;

	@JsonBackReference
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name = "CreateDate")
	private Date createDate;

	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	@Column(name = "UpdateDate")
	private Date updateDate;

	@JsonBackReference
	@OneToMany(mappedBy = "homestay", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<HomestayImages> homestayImages = new HashSet<HomestayImages>();

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@JoinTable(name = "HomestayUtills", joinColumns = @JoinColumn(name = "HomeStayID"), inverseJoinColumns = @JoinColumn(name = "UtilId"))
	private Collection<Utilities> utilities = new HashSet<Utilities>();

}
