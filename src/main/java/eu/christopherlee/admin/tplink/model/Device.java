package eu.christopherlee.admin.tplink.model;

public class Device {
	private String deviceType;
	private int role;
	private String fwVer;
	private String appServerUrl;
	private String deviceRegion;
	private String deviceId;
	private String deviceName;
	private String deviceHwVer;
	private String alias;
	private String deviceMac;
	private String oemId;
	private String deviceModel;
	private String hwId;
	private String fwId;
	private boolean isSameRegion;
	private int status;

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getFwVer() {
		return fwVer;
	}

	public void setFwVer(String fwVer) {
		this.fwVer = fwVer;
	}

	public String getAppServerUrl() {
		return appServerUrl;
	}

	public void setAppServerUrl(String appServerUrl) {
		this.appServerUrl = appServerUrl;
	}

	public String getDeviceRegion() {
		return deviceRegion;
	}

	public void setDeviceRegion(String deviceRegion) {
		this.deviceRegion = deviceRegion;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceHwVer() {
		return deviceHwVer;
	}

	public void setDeviceHwVer(String deviceHwVer) {
		this.deviceHwVer = deviceHwVer;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getDeviceMac() {
		return deviceMac;
	}

	public void setDeviceMac(String deviceMac) {
		this.deviceMac = deviceMac;
	}

	public String getOemId() {
		return oemId;
	}

	public void setOemId(String oemId) {
		this.oemId = oemId;
	}

	public String getDeviceModel() {
		return deviceModel;
	}

	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}

	public String getHwId() {
		return hwId;
	}

	public void setHwId(String hwId) {
		this.hwId = hwId;
	}

	public String getFwId() {
		return fwId;
	}

	public void setFwId(String fwId) {
		this.fwId = fwId;
	}

	public boolean isSameRegion() {
		return isSameRegion;
	}

	public void setSameRegion(boolean isSameRegion) {
		this.isSameRegion = isSameRegion;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
