package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMxMydelog<M extends BaseMxMydelog<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setDetime(java.lang.String detime) {
		set("detime", detime);
	}
	
	public java.lang.String getDetime() {
		return getStr("detime");
	}

	public void setSjType(java.lang.String sjType) {
		set("sj_type", sjType);
	}
	
	public java.lang.String getSjType() {
		return getStr("sj_type");
	}

	public void setDevId(java.lang.String devId) {
		set("dev_id", devId);
	}
	
	public java.lang.String getDevId() {
		return getStr("dev_id");
	}

	public void setCount(java.lang.String count) {
		set("count", count);
	}
	
	public java.lang.String getCount() {
		return getStr("count");
	}

}