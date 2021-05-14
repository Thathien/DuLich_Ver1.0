package dulich.com.entity;

import java.io.Serializable;
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
@Table(name = "NewsType")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NewsType implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NewsTypeID")
	private Long newsTypeId;

	@Column(name = "Hagtag", columnDefinition = "varchar(60)")
	public String hagtag;

	@Column(name = "NewsTypeName", columnDefinition = "nvarchar(40)", nullable = false)
	private String newsTypeName;

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
	@OneToMany(mappedBy = "newsType", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<News> news = new HashSet<>();
}
