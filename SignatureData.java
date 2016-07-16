import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.Transient;
import com.code.dal.orm.BaseEntity;
import com.code.enums.FlagsEnum;
import com.code.services.util.HijriDateService;
@SuppressWarnings("serial")
@Entity
@Table(name = "ETR_VW_SIGNATURES")
public class SignatureData implements Serializable {
private Long id;//NUMBER
private Integer signType;//NUMBER
private String signDesc;//VARCHAR2
private String name;//VARCHAR2
private String rankDesc;//VARCHAR2
private String titleDesc;//VARCHAR2
private Integer signature;//BLOB
private Date validFrom;//DATE
private String validFromString;//TRANSIENT
private Date validTo;//DATE
private String validToString;//TRANSIENT
private String enName;//VARCHAR2
private String enRankDesc;//VARCHAR2
private String enTitleDesc;//VARCHAR2
private Long empId;//NUMBER
private String empName;//VARCHAR2
private Signature signature;//TRANSIENT
public SignatureData()
    {
signature = new Signature();
    }@Id
@Column(name = "ID")
public Long getId() {
	return id;
    }
public void setId(Long id) {
	this.id = id;
this.signature.setId(id);
    }
@Basic
@Column(name = "SIGN_TYPE")
public Integer getSignType() {
	return signType;
    }
public void setSignType(Integer signType) {
	this.signType = signType;
this.signature.setSignType(signType);
    }
@Basic
@Column(name = "SIGN_DESC")
public String getSignDesc() {
	return signDesc;
    }
public void setSignDesc(String signDesc) {
	this.signDesc = signDesc;
this.signature.setSignDesc(signDesc);
    }
@Basic
@Column(name = "NAME")
public String getName() {
	return name;
    }
public void setName(String name) {
	this.name = name;
this.signature.setName(name);
    }
@Basic
@Column(name = "RANK_DESC")
public String getRankDesc() {
	return rankDesc;
    }
public void setRankDesc(String rankDesc) {
	this.rankDesc = rankDesc;
this.signature.setRankDesc(rankDesc);
    }
@Basic
@Column(name = "TITLE_DESC")
public String getTitleDesc() {
	return titleDesc;
    }
public void setTitleDesc(String titleDesc) {
	this.titleDesc = titleDesc;
this.signature.setTitleDesc(titleDesc);
    }
@Basic
@Column(name = "SIGNATURE")
public Integer getSignature() {
	return signature;
    }
public void setSignature(Integer signature) {
	this.signature = signature;
this.signature.setSignature(signature);
    }
@Basic
@Column(name = "VALID_FROM")
@Temporal(TemporalType.TIMESTAMP)
public Date getValidFrom() {
	return validFrom;
    }
public void setValidFrom(Date validFrom) {
	this.validFrom = validFrom;
this.validFromString = HijriDateService.getHijriDateString(validFrom);
this.signature.setValidFrom(validFrom);
    }
@Transient
public String getValidFromString() {
	return validFromString;
    }
public void setValidFromString(String validFromString) {
	this.validFromString = validFromString;
    }
@Basic
@Column(name = "VALID_TO")
@Temporal(TemporalType.TIMESTAMP)
public Date getValidTo() {
	return validTo;
    }
public void setValidTo(Date validTo) {
	this.validTo = validTo;
this.validToString = HijriDateService.getHijriDateString(validTo);
this.signature.setValidTo(validTo);
    }
@Transient
public String getValidToString() {
	return validToString;
    }
public void setValidToString(String validToString) {
	this.validToString = validToString;
    }
@Basic
@Column(name = "EN_NAME")
public String getEnName() {
	return enName;
    }
public void setEnName(String enName) {
	this.enName = enName;
this.signature.setEnName(enName);
    }
@Basic
@Column(name = "EN_RANK_DESC")
public String getEnRankDesc() {
	return enRankDesc;
    }
public void setEnRankDesc(String enRankDesc) {
	this.enRankDesc = enRankDesc;
this.signature.setEnRankDesc(enRankDesc);
    }
@Basic
@Column(name = "EN_TITLE_DESC")
public String getEnTitleDesc() {
	return enTitleDesc;
    }
public void setEnTitleDesc(String enTitleDesc) {
	this.enTitleDesc = enTitleDesc;
this.signature.setEnTitleDesc(enTitleDesc);
    }
@Basic
@Column(name = "EMP_ID")
public Long getEmpId() {
	return empId;
    }
public void setEmpId(Long empId) {
	this.empId = empId;
this.signature.setEmpId(empId);
    }
@Basic
@Column(name = "EMP_NAME")
public String getEmpName() {
	return empName;
    }
public void setEmpName(String empName) {
	this.empName = empName;
    }
@Transient
public Signature getSignature() {
	return signature;
    }
public void setSignature(Signature signature) {
	this.signature = signature;
    }
}
