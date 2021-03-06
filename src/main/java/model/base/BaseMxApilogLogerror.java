package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMxApilogLogerror<M extends BaseMxApilogLogerror<M>> extends Model<M> implements IBean {

	public void setLogID(java.lang.Integer logID) {
		set("logID", logID);
	}
	
	public java.lang.Integer getLogID() {
		return getInt("logID");
	}

	public void setAskUrl(java.lang.String askUrl) {
		set("askUrl", askUrl);
	}
	
	public java.lang.String getAskUrl() {
		return getStr("askUrl");
	}

	public void setAskJson(java.lang.String askJson) {
		set("askJson", askJson);
	}
	
	public java.lang.String getAskJson() {
		return getStr("askJson");
	}

	public void setResult(java.lang.String result) {
		set("result", result);
	}
	
	public java.lang.String getResult() {
		return getStr("result");
	}

	public void setErrorMsg(java.lang.String errorMsg) {
		set("errorMsg", errorMsg);
	}
	
	public java.lang.String getErrorMsg() {
		return getStr("errorMsg");
	}

	public void setLogTime(java.util.Date logTime) {
		set("logTime", logTime);
	}
	
	public java.util.Date getLogTime() {
		return get("logTime");
	}

}
