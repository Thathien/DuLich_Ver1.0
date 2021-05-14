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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "News")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class News implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "NewsID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long newsID;
	
	@Column(name = "NewsName", columnDefinition = "nvarchar(80)",nullable = false)
	private String newsName;
	
	@Column(name = "Hagtag", columnDefinition = "varchar(60)")
	public String hagtag;
	
	@Column(name = "BodyContent", columnDefinition = "nvarchar(max)")
	private String bodyContent;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "AuthorID", referencedColumnName = "AccId")
	private Account account;

	@Column(name = "IsHide", columnDefinition = "bit")
	private boolean isHide;

	@Column(name = "IsAprove", columnDefinition = "bit")
	private boolean isAprove;

	@Column(name = "IsPriority", columnDefinition = "bit")
	private boolean isPriority;

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
	@JoinColumn(name = "NewsTypeID", referencedColumnName = "NewsTypeID")
	private NewsType newsType;
}
