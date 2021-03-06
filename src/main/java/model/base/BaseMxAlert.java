package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMxAlert<M extends BaseMxAlert<M>> extends Model<M> implements IBean {

	public void setAlmID(java.lang.Integer almID) {
		set("almID", almID);
	}
	
	public java.lang.Integer getAlmID() {
		return getInt("almID");
	}

	public void setInsSn(java.lang.String insSn) {
		set("insSn", insSn);
	}
	
	public java.lang.String getInsSn() {
		return getStr("insSn");
	}

	public void setInsID(java.lang.Integer insID) {
		set("insID", insID);
	}
	
	public java.lang.Integer getInsID() {
		return getInt("insID");
	}

	public void setUserID(java.lang.Integer userID) {
		set("userID", userID);
	}
	
	public java.lang.Integer getUserID() {
		return getInt("userID");
	}

	public void setAlmtype(java.lang.Integer almtype) {
		set("almtype", almtype);
	}
	
	public java.lang.Integer getAlmtype() {
		return getInt("almtype");
	}

	public void setAlmtime(java.util.Date almtime) {
		set("almtime", almtime);
	}
	
	public java.util.Date getAlmtime() {
		return get("almtime");
	}

	public void setAlmpostion(java.lang.String almpostion) {
		set("almpostion", almpostion);
	}
	
	public java.lang.String getAlmpostion() {
		return getStr("almpostion");
	}

	public void setAlmmessage(java.lang.String almmessage) {
		set("almmessage", almmessage);
	}
	
	public java.lang.String getAlmmessage() {
		return getStr("almmessage");
	}

	public void setAlmcode(java.lang.String almcode) {
		set("almcode", almcode);
	}
	
	public java.lang.String getAlmcode() {
		return getStr("almcode");
	}

	public void setAlminsID(java.lang.Integer alminsID) {
		set("alminsID", alminsID);
	}
	
	public java.lang.Integer getAlminsID() {
		return getInt("alminsID");
	}

	public void setFlagtime(java.lang.Long flagtime) {
		set("flagtime", flagtime);
	}
	
	public java.lang.Long getFlagtime() {
		return getLong("flagtime");
	}

}
