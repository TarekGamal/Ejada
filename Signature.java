import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.code.dal.orm.BaseEntity;
@SuppressWarnings("serial")
@Entity
@Table(name = "ETR_SIGNATURES")
public class Signature extends BaseEntity implements Serializable {
private Long id;//NUMBER
private Integer signType;//NUMBER
private String signDesc;//VARCHAR2
private String name;//VARCHAR2
private String rankDesc;//VARCHAR2
private String titleDesc;//VARCHAR2
private Integer signature;//BLOB
private Date validFrom;//DATE
private Date validTo;//DATE
private String enName;//VARCHAR2
private String enRankDesc;//VARCHAR2
private String enTitleDesc;//VARCHAR2
private Long empId;//NUMBER
@Id
@Column(name = "ID")
public Long getId() {
	return id;
    }
public void setId(Long id) {
	this.id = id;
    }
@Basic
@Column(name = "SIGN_TYPE")
public Integer getSignType() {
	return signType;
    }
public void setSignType(Integer signType) {
	this.signType = signType;
    }
@Basic
@Column(name = "SIGN_DESC")
public String getSignDesc() {
	return signDesc;
    }
public void setSignDesc(String signDesc) {
	this.signDesc = signDesc;
    }
@Basic
@Column(name = "NAME")
public String getName() {
	return name;
    }
public void setName(String name) {
	this.name = name;
    }
@Basic
@Column(name = "RANK_DESC")
public String getRankDesc() {
	return rankDesc;
    }
public void setRankDesc(String rankDesc) {
	this.rankDesc = rankDesc;
    }
@Basic
@Column(name = "TITLE_DESC")
public String getTitleDesc() {
	return titleDesc;
    }
public void setTitleDesc(String titleDesc) {
	this.titleDesc = titleDesc;
    }
@Basic
@Column(name = "SIGNATURE")
public Integer getSignature() {
	return signature;
    }
public void setSignature(Integer signature) {
	this.signature = signature;
    }
@Basic
@Column(name = "VALID_FROM")
@Temporal(TemporalType.TIMESTAMP)
public Date getValidFrom() {
	return validFrom;
    }
public void setValidFrom(Date validFrom) {
	this.validFrom = validFrom;
    }
@Basic
@Column(name = "VALID_TO")
@Temporal(TemporalType.TIMESTAMP)
public Date getValidTo() {
	return validTo;
    }
public void setValidTo(Date validTo) {
	this.validTo = validTo;
    }
@Basic
@Column(name = "EN_NAME")
public String getEnName() {
	return enName;
    }
public void setEnName(String enName) {
	this.enName = enName;
    }
@Basic
@Column(name = "EN_RANK_DESC")
public String getEnRankDesc() {
	return enRankDesc;
    }
public void setEnRankDesc(String enRankDesc) {
	this.enRankDesc = enRankDesc;
    }
@Basic
@Column(name = "EN_TITLE_DESC")
public String getEnTitleDesc() {
	return enTitleDesc;
    }
public void setEnTitleDesc(String enTitleDesc) {
	this.enTitleDesc = enTitleDesc;
    }
@Basic
@Column(name = "EMP_ID")
public Long getEmpId() {
	return empId;
    }
public void setEmpId(Long empId) {
	this.empId = empId;
    }
}
