package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMxClient<M extends BaseMxClient<M>> extends Model<M> implements IBean {

	public void setClientID(java.lang.Integer clientID) {
		set("clientID", clientID);
	}
	
	public java.lang.Integer getClientID() {
		return getInt("clientID");
	}

	public void setClientName(java.lang.String clientName) {
		set("clientName", clientName);
	}
	
	public java.lang.String getClientName() {
		return getStr("clientName");
	}

	public void setClientAccount(java.lang.String clientAccount) {
		set("clientAccount", clientAccount);
	}
	
	public java.lang.String getClientAccount() {
		return getStr("clientAccount");
	}

	public void setClientPwd(java.lang.String clientPwd) {
		set("clientPwd", clientPwd);
	}
	
	public java.lang.String getClientPwd() {
		return getStr("clientPwd");
	}

	public void setUserRole(java.lang.Integer userRole) {
		set("userRole", userRole);
	}
	
	public java.lang.Integer getUserRole() {
		return getInt("userRole");
	}

	public void setLinkName(java.lang.String linkName) {
		set("linkName", linkName);
	}
	
	public java.lang.String getLinkName() {
		return getStr("linkName");
	}

	public void setLinkPhone(java.lang.String linkPhone) {
		set("linkPhone", linkPhone);
	}
	
	public java.lang.String getLinkPhone() {
		return getStr("linkPhone");
	}

	public void setLinkMail(java.lang.String linkMail) {
		set("linkMail", linkMail);
	}
	
	public java.lang.String getLinkMail() {
		return getStr("linkMail");
	}

	public void setGuruID(java.lang.Integer guruID) {
		set("guruID", guruID);
	}
	
	public java.lang.Integer getGuruID() {
		return getInt("guruID");
	}

	public void setCrTime(java.util.Date crTime) {
		set("crTime", crTime);
	}
	
	public java.util.Date getCrTime() {
		return get("crTime");
	}

	public void setFlagtime(java.lang.Long flagtime) {
		set("flagtime", flagtime);
	}
	
	public java.lang.Long getFlagtime() {
		return getLong("flagtime");
	}

	public void setClientStatus(java.lang.Integer clientStatus) {
		set("clientStatus", clientStatus);
	}
	
	public java.lang.Integer getClientStatus() {
		return getInt("clientStatus");
	}

	public void setFilialeID(java.lang.Integer filialeID) {
		set("filialeID", filialeID);
	}
	
	public java.lang.Integer getFilialeID() {
		return getInt("filialeID");
	}

}