package dulich.com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Ward")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ward implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "Name", columnDefinition = "nvarchar(250)")
	private String name;

	@Column(name = "`Type`", columnDefinition = "nvarchar(50)")
	private String type;

	@Column(name = "LatiLongTude", columnDefinition = "nvarchar(50)")
	private String latiLongTude;

	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "DistrictID", referencedColumnName = "Id")
	private District district;

	@Column(name = "SortOrder")
	private int sortOrder;

	@Column(name = "IsPublished", columnDefinition = "bit")
	private boolean isPublished;

	@Column(name = "IsDeleted", columnDefinition = "bit")
	private boolean isDeleted;
}
