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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Province")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Province implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long id;

	@Column(name = "Name", columnDefinition = "nvarchar(250)", nullable = false)
	private String name;

	@Column(name = "`Type`", columnDefinition = "nvarchar(20)")
	private String type;

	@Column(name = "TelephoneCode")
	private int telephoneCode;

	@Column(name = "ZipCode", columnDefinition = "nvarchar(20)")
	private String zipCode;

	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "CountryId", referencedColumnName = "Id")
	private Country country;

	@Column(name = "CountryCode", columnDefinition = "nvarchar(100)", nullable = false)
	private String countryCode;

	@Column(name = "SortOrder")
	private int sortOrder;

	@Column(name = "IsPublished", columnDefinition = "bit")
	private boolean isPublished;

	@Column(name = "IsDeleted", columnDefinition = "bit")
	private boolean isDeleted;

	@JsonBackReference
	@OneToMany(mappedBy = "province", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<District> districts = new HashSet<District>();
}
