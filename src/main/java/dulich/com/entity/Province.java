package dulich.com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
public class Province {

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

	@Column(name = "CountryCode", columnDefinition = "nvarchar(100)", nullable = false)
	private String countryCode;

	@Column(name = "SortOrder")
	private int sortOrder;

	@Column(name = "IsPublished", columnDefinition = "bit")
	private boolean isPublished;

	@Column(name = "IsDeleted", columnDefinition = "bit")
	private boolean isDeleted;
}
