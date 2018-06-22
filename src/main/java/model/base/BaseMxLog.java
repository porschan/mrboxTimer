package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMxLog<M extends BaseMxLog<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setLogtime(java.util.Date logtime) {
		set("logtime", logtime);
	}
	
	public java.util.Date getLogtime() {
		return get("logtime");
	}

	public void setLogcontent(java.lang.String logcontent) {
		set("logcontent", logcontent);
	}
	
	public java.lang.String getLogcontent() {
		return getStr("logcontent");
	}

	public void setUsername(java.lang.String username) {
		set("username", username);
	}
	
	public java.lang.String getUsername() {
		return getStr("username");
	}

	public void setUName(java.lang.String uName) {
		set("uName", uName);
	}
	
	public java.lang.String getUName() {
		return getStr("uName");
	}

}
