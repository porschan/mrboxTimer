package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMxInstrument<M extends BaseMxInstrument<M>> extends Model<M> implements IBean {

	public void setInsID(java.lang.Integer insID) {
		set("insID", insID);
	}
	
	public java.lang.Integer getInsID() {
		return getInt("insID");
	}

	public void setInsQuarkID(java.lang.Integer insQuarkID) {
		set("insQuarkID", insQuarkID);
	}
	
	public java.lang.Integer getInsQuarkID() {
		return getInt("insQuarkID");
	}

	public void setSlotId(java.lang.Integer slotId) {
		set("slotId", slotId);
	}
	
	public java.lang.Integer getSlotId() {
		return getInt("slotId");
	}

	public void setInsName(java.lang.String insName) {
		set("insName", insName);
	}
	
	public java.lang.String getInsName() {
		return getStr("insName");
	}

	public void setDevID(java.lang.Integer devID) {
		set("devID", devID);
	}
	
	public java.lang.Integer getDevID() {
		return getInt("devID");
	}

	public void setInsNo(java.lang.String insNo) {
		set("insNo", insNo);
	}
	
	public java.lang.String getInsNo() {
		return getStr("insNo");
	}

	public void setInsSn(java.lang.String insSn) {
		set("insSn", insSn);
	}
	
	public java.lang.String getInsSn() {
		return getStr("insSn");
	}

	public void setInstype(java.lang.Integer instype) {
		set("instype", instype);
	}
	
	public java.lang.Integer getInstype() {
		return getInt("instype");
	}

	public void setInsRom(java.lang.String insRom) {
		set("insRom", insRom);
	}
	
	public java.lang.String getInsRom() {
		return getStr("insRom");
	}

	public void setSimCcid(java.lang.String simCcid) {
		set("simCcid", simCcid);
	}
	
	public java.lang.String getSimCcid() {
		return getStr("simCcid");
	}

	public void setInsMac(java.lang.String insMac) {
		set("insMac", insMac);
	}
	
	public java.lang.String getInsMac() {
		return getStr("insMac");
	}

	public void setInsIp(java.lang.String insIp) {
		set("insIp", insIp);
	}
	
	public java.lang.String getInsIp() {
		return getStr("insIp");
	}

	public void setSpace(java.lang.Integer space) {
		set("space", space);
	}
	
	public java.lang.Integer getSpace() {
		return getInt("space");
	}

	public void setAddress(java.lang.String address) {
		set("address", address);
	}
	
	public java.lang.String getAddress() {
		return getStr("address");
	}

	public void setInsDesc(java.lang.String insDesc) {
		set("insDesc", insDesc);
	}
	
	public java.lang.String getInsDesc() {
		return getStr("insDesc");
	}

	public void setInstate(java.lang.Integer instate) {
		set("instate", instate);
	}
	
	public java.lang.Integer getInstate() {
		return getInt("instate");
	}

	public void setLogstate(java.lang.Integer logstate) {
		set("logstate", logstate);
	}
	
	public java.lang.Integer getLogstate() {
		return getInt("logstate");
	}

	public void setFlagtime(java.lang.Long flagtime) {
		set("flagtime", flagtime);
	}
	
	public java.lang.Long getFlagtime() {
		return getLong("flagtime");
	}

	public void setScState(java.lang.Integer scState) {
		set("sc_state", scState);
	}
	
	public java.lang.Integer getScState() {
		return getInt("sc_state");
	}

}
