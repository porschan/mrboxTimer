package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseLigentUserOrg<M extends BaseLigentUserOrg<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setUserID(java.lang.Integer userID) {
		set("userID", userID);
	}
	
	public java.lang.Integer getUserID() {
		return getInt("userID");
	}

	public void setOrgID(java.lang.Integer orgID) {
		set("orgID", orgID);
	}
	
	public java.lang.Integer getOrgID() {
		return getInt("orgID");
	}

}
