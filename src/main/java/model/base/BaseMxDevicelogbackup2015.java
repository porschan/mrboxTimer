package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMxDevicelogbackup2015<M extends BaseMxDevicelogbackup2015<M>> extends Model<M> implements IBean {

	public void setIdevID(java.lang.Integer idevID) {
		set("idevID", idevID);
	}
	
	public java.lang.Integer getIdevID() {
		return getInt("idevID");
	}

	public void setDevID(java.lang.Integer devID) {
		set("devID", devID);
	}
	
	public java.lang.Integer getDevID() {
		return getInt("devID");
	}

	public void setIdevType(java.lang.Integer idevType) {
		set("idevType", idevType);
	}
	
	public java.lang.Integer getIdevType() {
		return getInt("idevType");
	}

	public void setIdevDesc(java.lang.String idevDesc) {
		set("idevDesc", idevDesc);
	}
	
	public java.lang.String getIdevDesc() {
		return getStr("idevDesc");
	}

	public void setCrtime(java.util.Date crtime) {
		set("crtime", crtime);
	}
	
	public java.util.Date getCrtime() {
		return get("crtime");
	}

}
