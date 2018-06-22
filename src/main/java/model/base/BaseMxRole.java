package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMxRole<M extends BaseMxRole<M>> extends Model<M> implements IBean {

	public void setRoleId(java.lang.Integer roleId) {
		set("roleId", roleId);
	}
	
	public java.lang.Integer getRoleId() {
		return getInt("roleId");
	}

	public void setRoleName(java.lang.String roleName) {
		set("roleName", roleName);
	}
	
	public java.lang.String getRoleName() {
		return getStr("roleName");
	}

	public void setSysId(java.lang.Integer sysId) {
		set("sysId", sysId);
	}
	
	public java.lang.Integer getSysId() {
		return getInt("sysId");
	}

	public void setSort(java.lang.Integer sort) {
		set("sort", sort);
	}
	
	public java.lang.Integer getSort() {
		return getInt("sort");
	}

	public void setDepict(java.lang.String depict) {
		set("depict", depict);
	}
	
	public java.lang.String getDepict() {
		return getStr("depict");
	}

	public void setFlagtime(java.lang.Long flagtime) {
		set("flagtime", flagtime);
	}
	
	public java.lang.Long getFlagtime() {
		return getLong("flagtime");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

}