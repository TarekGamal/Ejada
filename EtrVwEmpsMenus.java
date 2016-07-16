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
@Table(name = "ETR_VW_EMPS_MENUS")
public class EtrVwEmpsMenus implements Serializable {
private Long empId;//NUMBER
private Long menuId;//NUMBER
@Basic
@Column(name = "EMP_ID")
public Long getEmpId() {
	return empId;
    }
public void setEmpId(Long empId) {
	this.empId = empId;
    }
@Basic
@Column(name = "MENU_ID")
public Long getMenuId() {
	return menuId;
    }
public void setMenuId(Long menuId) {
	this.menuId = menuId;
    }
}
