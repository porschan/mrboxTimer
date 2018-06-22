package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseLigentAction<M extends BaseLigentAction<M>> extends Model<M> implements IBean {

	public void setActionID(java.lang.Integer actionID) {
		set("actionID", actionID);
	}
	
	public java.lang.Integer getActionID() {
		return getInt("actionID");
	}

	public void setActionName(java.lang.String actionName) {
		set("actionName", actionName);
	}
	
	public java.lang.String getActionName() {
		return getStr("actionName");
	}

	public void setCrTIme(java.util.Date crTIme) {
		set("crTIme", crTIme);
	}
	
	public java.util.Date getCrTIme() {
		return get("crTIme");
	}

	public void setActionDesc(java.lang.String actionDesc) {
		set("actionDesc", actionDesc);
	}
	
	public java.lang.String getActionDesc() {
		return getStr("actionDesc");
	}

	public void setActionParent(java.lang.Integer actionParent) {
		set("action_parent", actionParent);
	}
	
	public java.lang.Integer getActionParent() {
		return getInt("action_parent");
	}

	public void setFlagtime(java.lang.Long flagtime) {
		set("flagtime", flagtime);
	}
	
	public java.lang.Long getFlagtime() {
		return getLong("flagtime");
	}

}