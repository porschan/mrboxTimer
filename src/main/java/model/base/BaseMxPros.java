package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMxPros<M extends BaseMxPros<M>> extends Model<M> implements IBean {

	public void setProID(java.lang.Integer proID) {
		set("proID", proID);
	}
	
	public java.lang.Integer getProID() {
		return getInt("proID");
	}

	public void setProName(java.lang.String proName) {
		set("proName", proName);
	}
	
	public java.lang.String getProName() {
		return getStr("proName");
	}

	public void setPsname(java.lang.String psname) {
		set("psname", psname);
	}
	
	public java.lang.String getPsname() {
		return getStr("psname");
	}

	public void setPcap(java.lang.String pcap) {
		set("pcap", pcap);
	}
	
	public java.lang.String getPcap() {
		return getStr("pcap");
	}

	public void setAreaID(java.lang.Integer areaID) {
		set("areaID", areaID);
	}
	
	public java.lang.Integer getAreaID() {
		return getInt("areaID");
	}

	public void setAreaName(java.lang.String areaName) {
		set("areaName", areaName);
	}
	
	public java.lang.String getAreaName() {
		return getStr("areaName");
	}

	public void setVital(java.lang.String vital) {
		set("vital", vital);
	}
	
	public java.lang.String getVital() {
		return getStr("vital");
	}

	public void setFlagtime(java.lang.Long flagtime) {
		set("flagtime", flagtime);
	}
	
	public java.lang.Long getFlagtime() {
		return getLong("flagtime");
	}

}
