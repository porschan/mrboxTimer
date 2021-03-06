package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseLigentMenu<M extends BaseLigentMenu<M>> extends Model<M> implements IBean {

	public void setMenuID(java.lang.Integer menuID) {
		set("menuID", menuID);
	}
	
	public java.lang.Integer getMenuID() {
		return getInt("menuID");
	}

	public void setMenuName(java.lang.String menuName) {
		set("menuName", menuName);
	}
	
	public java.lang.String getMenuName() {
		return getStr("menuName");
	}

	public void setMenuParent(java.lang.Integer menuParent) {
		set("menu_parent", menuParent);
	}
	
	public java.lang.Integer getMenuParent() {
		return getInt("menu_parent");
	}

	public void setLevel(java.lang.Integer level) {
		set("level", level);
	}
	
	public java.lang.Integer getLevel() {
		return getInt("level");
	}

	public void setMenuOrder(java.lang.Integer menuOrder) {
		set("menuOrder", menuOrder);
	}
	
	public java.lang.Integer getMenuOrder() {
		return getInt("menuOrder");
	}

	public void setMenuUrl(java.lang.String menuUrl) {
		set("menuUrl", menuUrl);
	}
	
	public java.lang.String getMenuUrl() {
		return getStr("menuUrl");
	}

	public void setMobileUrl(java.lang.String mobileUrl) {
		set("mobileUrl", mobileUrl);
	}
	
	public java.lang.String getMobileUrl() {
		return getStr("mobileUrl");
	}

	public void setIcon(java.lang.String icon) {
		set("icon", icon);
	}
	
	public java.lang.String getIcon() {
		return getStr("icon");
	}

	public void setStyle(java.lang.String style) {
		set("style", style);
	}
	
	public java.lang.String getStyle() {
		return getStr("style");
	}

	public void setSysType(java.lang.String sysType) {
		set("sysType", sysType);
	}
	
	public java.lang.String getSysType() {
		return getStr("sysType");
	}

	public void setFlagtime(java.lang.Long flagtime) {
		set("flagtime", flagtime);
	}
	
	public java.lang.Long getFlagtime() {
		return getLong("flagtime");
	}

	public void setMenuStatus(java.lang.Integer menuStatus) {
		set("menuStatus", menuStatus);
	}
	
	public java.lang.Integer getMenuStatus() {
		return getInt("menuStatus");
	}

}
