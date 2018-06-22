package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMxDevice<M extends BaseMxDevice<M>> extends Model<M> implements IBean {

	public void setDevID(java.lang.Integer devID) {
		set("devID", devID);
	}
	
	public java.lang.Integer getDevID() {
		return getInt("devID");
	}

	public void setDevQuarkID(java.lang.Integer devQuarkID) {
		set("devQuarkID", devQuarkID);
	}
	
	public java.lang.Integer getDevQuarkID() {
		return getInt("devQuarkID");
	}

	public void setDevNo(java.lang.String devNo) {
		set("devNo", devNo);
	}
	
	public java.lang.String getDevNo() {
		return getStr("devNo");
	}

	public void setClientID(java.lang.Integer clientID) {
		set("clientID", clientID);
	}
	
	public java.lang.Integer getClientID() {
		return getInt("clientID");
	}

	public void setUnitID(java.lang.Integer unitID) {
		set("unitID", unitID);
	}
	
	public java.lang.Integer getUnitID() {
		return getInt("unitID");
	}

	public void setPointID(java.lang.Integer pointID) {
		set("pointID", pointID);
	}
	
	public java.lang.Integer getPointID() {
		return getInt("pointID");
	}

	public void setAreaID(java.lang.Integer areaID) {
		set("areaID", areaID);
	}
	
	public java.lang.Integer getAreaID() {
		return getInt("areaID");
	}

	public void setDevVer(java.lang.String devVer) {
		set("devVer", devVer);
	}
	
	public java.lang.String getDevVer() {
		return getStr("devVer");
	}

	public void setSimCcid(java.lang.String simCcid) {
		set("simCcid", simCcid);
	}
	
	public java.lang.String getSimCcid() {
		return getStr("simCcid");
	}

	public void setIptype(java.lang.Integer iptype) {
		set("iptype", iptype);
	}
	
	public java.lang.Integer getIptype() {
		return getInt("iptype");
	}

	public void setDevIp(java.lang.String devIp) {
		set("devIp", devIp);
	}
	
	public java.lang.String getDevIp() {
		return getStr("devIp");
	}

	public void setDevGw(java.lang.String devGw) {
		set("devGw", devGw);
	}
	
	public java.lang.String getDevGw() {
		return getStr("devGw");
	}

	public void setDevMask(java.lang.String devMask) {
		set("devMask", devMask);
	}
	
	public java.lang.String getDevMask() {
		return getStr("devMask");
	}

	public void setDevDesc(java.lang.String devDesc) {
		set("devDesc", devDesc);
	}
	
	public java.lang.String getDevDesc() {
		return getStr("devDesc");
	}

	public void setDevStatus(java.lang.Integer devStatus) {
		set("devStatus", devStatus);
	}
	
	public java.lang.Integer getDevStatus() {
		return getInt("devStatus");
	}

	public void setCsqValue(java.lang.Integer csqValue) {
		set("csq_value", csqValue);
	}
	
	public java.lang.Integer getCsqValue() {
		return getInt("csq_value");
	}

	public void setEthStatus(java.lang.Integer ethStatus) {
		set("eth_status", ethStatus);
	}
	
	public java.lang.Integer getEthStatus() {
		return getInt("eth_status");
	}

	public void setMemFree(java.lang.Integer memFree) {
		set("mem_free", memFree);
	}
	
	public java.lang.Integer getMemFree() {
		return getInt("mem_free");
	}

	public void setCpuIdle(java.lang.Double cpuIdle) {
		set("cpu_idle", cpuIdle);
	}
	
	public java.lang.Double getCpuIdle() {
		return getDouble("cpu_idle");
	}

	public void setLocalDhcp(java.lang.Integer localDhcp) {
		set("local_dhcp", localDhcp);
	}
	
	public java.lang.Integer getLocalDhcp() {
		return getInt("local_dhcp");
	}

	public void setLocalIp(java.lang.String localIp) {
		set("local_ip", localIp);
	}
	
	public java.lang.String getLocalIp() {
		return getStr("local_ip");
	}

	public void setLocalMask(java.lang.String localMask) {
		set("local_mask", localMask);
	}
	
	public java.lang.String getLocalMask() {
		return getStr("local_mask");
	}

	public void setCidLac(java.lang.String cidLac) {
		set("cid_lac", cidLac);
	}
	
	public java.lang.String getCidLac() {
		return getStr("cid_lac");
	}

	public void setFlagtime(java.lang.Long flagtime) {
		set("flagtime", flagtime);
	}
	
	public java.lang.Long getFlagtime() {
		return getLong("flagtime");
	}

	public void setScStatus(java.lang.Integer scStatus) {
		set("sc_status", scStatus);
	}
	
	public java.lang.Integer getScStatus() {
		return getInt("sc_status");
	}

	public void setBjStatus(java.lang.Integer bjStatus) {
		set("bj_status", bjStatus);
	}
	
	public java.lang.Integer getBjStatus() {
		return getInt("bj_status");
	}

}