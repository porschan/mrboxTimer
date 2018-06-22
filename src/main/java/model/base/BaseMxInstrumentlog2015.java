package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMxInstrumentlog2015<M extends BaseMxInstrumentlog2015<M>> extends Model<M> implements IBean {

	public void setIlogID(java.lang.Integer ilogID) {
		set("ilogID", ilogID);
	}
	
	public java.lang.Integer getIlogID() {
		return getInt("ilogID");
	}

	public void setInsID(java.lang.Integer insID) {
		set("insID", insID);
	}
	
	public java.lang.Integer getInsID() {
		return getInt("insID");
	}

	public void setIlogType(java.lang.Integer ilogType) {
		set("ilogType", ilogType);
	}
	
	public java.lang.Integer getIlogType() {
		return getInt("ilogType");
	}

	public void setIlogDesc(java.lang.String ilogDesc) {
		set("ilogDesc", ilogDesc);
	}
	
	public java.lang.String getIlogDesc() {
		return getStr("ilogDesc");
	}

	public void setCrtime(java.util.Date crtime) {
		set("crtime", crtime);
	}
	
	public java.util.Date getCrtime() {
		return get("crtime");
	}

}
