package dulich.com.entity;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@Table(name = "HomestayType")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HomestayType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "HomeStayTypeID")
	private Long homeStayTypeID;

	@Column(name = "HomeStayTypeName", columnDefinition = "nvarchar(40)")
	private String homeStayTypeName;

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

	@JsonBackReference
	@OneToMany(mappedBy = "homestayType", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Set<Homestay> homestays= new HashSet<Homestay>();
	
}
