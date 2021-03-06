package dulich.com.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Country")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Country implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long id;

	@Column(name = "CountryCode", columnDefinition = "nvarchar(100)", nullable = false)
	private String countryCode;

	@Column(name = "FormalName", columnDefinition = "nvarchar(100)")
	private String formalName;

	@Column(name = "CountryType", columnDefinition = "nvarchar(100)")
	private String countryType;

	@Column(name = "CountrySubType", columnDefinition = "nvarchar(100)")
	private String countrySubType;

	@Column(name = "Sovereignty", columnDefinition = "nvarchar(100)")
	private String sovereignty;

	@Column(name = "Capital", columnDefinition = "nvarchar(100)")
	private String capital;

	@Column(name = "CurrencyCode", columnDefinition = "nvarchar(100)")
	private String currencyCode;

	@Column(name = "CurrencyName", columnDefinition = "nvarchar(100)")
	private String currencyName;

	@Column(name = "TelephoneCode", columnDefinition = "nvarchar(100)")
	private String telephoneCode;

	@Column(name = "CountryCode3", columnDefinition = "nvarchar(100)")
	private String countryCode3;

	@Column(name = "CountryNumber", columnDefinition = "nvarchar(100)")
	private String countryNumber;

	@Column(name = "InternetCountryCode", columnDefinition = "nvarchar(100)")
	private String internetCountryCode;

	@Column(name = "SortOrder")
	private int sortOrder;

	@Column(name = "IsPublished", columnDefinition = "bit")
	private boolean isPublished;

	@Column(name = "Flags", columnDefinition = "nvarchar(100)")
	private String flags;

	@Column(name = "IsDeleted", columnDefinition = "bit")
	private boolean isDeleted;

	@JsonBackReference
	@OneToMany(mappedBy = "country", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Province> provinces = new HashSet<Province>();

}
