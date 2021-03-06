package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMxWarn<M extends BaseMxWarn<M>> extends Model<M> implements IBean {

	public void setWarnId(java.lang.Integer warnId) {
		set("warnId", warnId);
	}
	
	public java.lang.Integer getWarnId() {
		return getInt("warnId");
	}

	public void setTypeId(java.lang.Integer typeId) {
		set("typeId", typeId);
	}
	
	public java.lang.Integer getTypeId() {
		return getInt("typeId");
	}

	public void setInsId(java.lang.Integer insId) {
		set("insId", insId);
	}
	
	public java.lang.Integer getInsId() {
		return getInt("insId");
	}

	public void setContent(java.lang.String content) {
		set("content", content);
	}
	
	public java.lang.String getContent() {
		return getStr("content");
	}

	public void setTime(java.util.Date time) {
		set("time", time);
	}
	
	public java.util.Date getTime() {
		return get("time");
	}

	public void setSing(java.lang.Integer sing) {
		set("sing", sing);
	}
	
	public java.lang.Integer getSing() {
		return getInt("sing");
	}

}
