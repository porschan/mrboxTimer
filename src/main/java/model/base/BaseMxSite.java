package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMxSite<M extends BaseMxSite<M>> extends Model<M> implements IBean {

	public void setSiteID(java.lang.Integer siteID) {
		set("siteID", siteID);
	}
	
	public java.lang.Integer getSiteID() {
		return getInt("siteID");
	}

	public void setSiteNo(java.lang.String siteNo) {
		set("siteNo", siteNo);
	}
	
	public java.lang.String getSiteNo() {
		return getStr("siteNo");
	}

	public void setLng(java.lang.Double lng) {
		set("lng", lng);
	}
	
	public java.lang.Double getLng() {
		return getDouble("lng");
	}

	public void setLat(java.lang.Double lat) {
		set("lat", lat);
	}
	
	public java.lang.Double getLat() {
		return getDouble("lat");
	}

	public void setGlng(java.lang.Double glng) {
		set("glng", glng);
	}
	
	public java.lang.Double getGlng() {
		return getDouble("glng");
	}

	public void setGlat(java.lang.Double glat) {
		set("glat", glat);
	}
	
	public java.lang.Double getGlat() {
		return getDouble("glat");
	}

	public void setBlng(java.lang.Double blng) {
		set("blng", blng);
	}
	
	public java.lang.Double getBlng() {
		return getDouble("blng");
	}

	public void setBlat(java.lang.Double blat) {
		set("blat", blat);
	}
	
	public java.lang.Double getBlat() {
		return getDouble("blat");
	}

	public void setAddress(java.lang.String address) {
		set("address", address);
	}
	
	public java.lang.String getAddress() {
		return getStr("address");
	}

	public void setCode(java.lang.String code) {
		set("code", code);
	}
	
	public java.lang.String getCode() {
		return getStr("code");
	}

	public void setCity(java.lang.String city) {
		set("city", city);
	}
	
	public java.lang.String getCity() {
		return getStr("city");
	}

	public void setLac(java.lang.String lac) {
		set("lac", lac);
	}
	
	public java.lang.String getLac() {
		return getStr("lac");
	}

	public void setCell(java.lang.String cell) {
		set("cell", cell);
	}
	
	public java.lang.String getCell() {
		return getStr("cell");
	}

	public void setProvince(java.lang.String province) {
		set("province", province);
	}
	
	public java.lang.String getProvince() {
		return getStr("province");
	}

	public void setFlagtime(java.lang.Long flagtime) {
		set("flagtime", flagtime);
	}
	
	public java.lang.Long getFlagtime() {
		return getLong("flagtime");
	}

}
