package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseLigentRoleMenu<M extends BaseLigentRoleMenu<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setRoleID(java.lang.Integer roleID) {
		set("roleID", roleID);
	}
	
	public java.lang.Integer getRoleID() {
		return getInt("roleID");
	}

	public void setMenuID(java.lang.Integer menuID) {
		set("menuID", menuID);
	}
	
	public java.lang.Integer getMenuID() {
		return getInt("menuID");
	}

}
