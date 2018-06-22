package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAsEmp<M extends BaseAsEmp<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setUsername(java.lang.String username) {
		set("username", username);
	}
	
	public java.lang.String getUsername() {
		return getStr("username");
	}

	public void setSex(java.lang.Integer sex) {
		set("sex", sex);
	}
	
	public java.lang.Integer getSex() {
		return getInt("sex");
	}

	public void setPhone(java.lang.String phone) {
		set("phone", phone);
	}
	
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	public void setCompany(java.lang.String company) {
		set("company", company);
	}
	
	public java.lang.String getCompany() {
		return getStr("company");
	}

	public void setIdentityCard(java.lang.String identityCard) {
		set("identityCard", identityCard);
	}
	
	public java.lang.String getIdentityCard() {
		return getStr("identityCard");
	}

	public void setIdPhoto(java.lang.String idPhoto) {
		set("idPhoto", idPhoto);
	}
	
	public java.lang.String getIdPhoto() {
		return getStr("idPhoto");
	}

	public void setBirthday(java.util.Date birthday) {
		set("birthday", birthday);
	}
	
	public java.util.Date getBirthday() {
		return get("birthday");
	}

	public void setNation(java.lang.String nation) {
		set("nation", nation);
	}
	
	public java.lang.String getNation() {
		return getStr("nation");
	}

	public void setAddress(java.lang.String address) {
		set("address", address);
	}
	
	public java.lang.String getAddress() {
		return getStr("address");
	}

	public void setDuties(java.lang.String duties) {
		set("duties", duties);
	}
	
	public java.lang.String getDuties() {
		return getStr("duties");
	}

	public void setState(java.lang.Integer state) {
		set("state", state);
	}
	
	public java.lang.Integer getState() {
		return getInt("state");
	}

}