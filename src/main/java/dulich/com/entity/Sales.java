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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "`Sales`")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Sales {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SalesID")
	private Long saleID;

	@Column(name = "SalesTitle")
	private String salesTitle;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DateStart", columnDefinition = "datetime")
	private Date dateStart;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DateEnd", columnDefinition = "datetime")
	private Date dateEnd;

	@Column(name = "Discounts")
	private int discounts;

	@OneToMany(mappedBy = "sales", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonBackReference
	private Set<SalesInfor> salesInfor = new HashSet<SalesInfor>();

	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name = "CreateDate")
	private Date createDate;

	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	@Column(name = "UpdateDate")
	private Date updateDate;
}
