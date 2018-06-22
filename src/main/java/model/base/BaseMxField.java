package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMxField<M extends BaseMxField<M>> extends Model<M> implements IBean {

	public void setFieldID(java.lang.Integer fieldID) {
		set("fieldID", fieldID);
	}
	
	public java.lang.Integer getFieldID() {
		return getInt("fieldID");
	}

	public void setFieldName(java.lang.String fieldName) {
		set("fieldName", fieldName);
	}
	
	public java.lang.String getFieldName() {
		return getStr("fieldName");
	}

	public void setFieldNum(java.lang.String fieldNum) {
		set("fieldNum", fieldNum);
	}
	
	public java.lang.String getFieldNum() {
		return getStr("fieldNum");
	}

	public void setApiName(java.lang.String apiName) {
		set("apiName", apiName);
	}
	
	public java.lang.String getApiName() {
		return getStr("apiName");
	}

	public void setAimtable(java.lang.String aimtable) {
		set("aimtable", aimtable);
	}
	
	public java.lang.String getAimtable() {
		return getStr("aimtable");
	}

	public void setFieldDesc(java.lang.String fieldDesc) {
		set("fieldDesc", fieldDesc);
	}
	
	public java.lang.String getFieldDesc() {
		return getStr("fieldDesc");
	}

	public void setIsColor(java.lang.Integer isColor) {
		set("isColor", isColor);
	}
	
	public java.lang.Integer getIsColor() {
		return getInt("isColor");
	}

	public void setIsBlack(java.lang.Integer isBlack) {
		set("isBlack", isBlack);
	}
	
	public java.lang.Integer getIsBlack() {
		return getInt("isBlack");
	}

	public void setFieldStatus(java.lang.Integer fieldStatus) {
		set("fieldStatus", fieldStatus);
	}
	
	public java.lang.Integer getFieldStatus() {
		return getInt("fieldStatus");
	}

}
