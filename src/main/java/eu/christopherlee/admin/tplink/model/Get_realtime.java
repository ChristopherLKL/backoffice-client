package eu.christopherlee.admin.tplink.model;

import java.util.Date;

public class Get_realtime {
	private float current;
	private float voltage;
	private float power;
	private float total;
	private int current_ma;
	private int voltage_mv;
	private int power_mw;
	private int total_wh;
	private Date startTime;

	public float getCurrent() {
		return current;
	}

	public void setCurrent(float current) {
		this.current = current;
	}

	public float getVoltage() {
		return voltage;
	}

	public void setVoltage(float voltage) {
		this.voltage = voltage;
	}

	public float getPower() {
		return power;
	}

	public void setPower(float power) {
		this.power = power;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public int getCurrent_ma() {
		return current_ma;
	}

	public void setCurrent_ma(int current_ma) {
		this.current_ma = current_ma;
	}

	public int getVoltage_mv() {
		return voltage_mv;
	}

	public void setVoltage_mv(int voltage_mv) {
		this.voltage_mv = voltage_mv;
	}

	public int getPower_mw() {
		return power_mw;
	}

	public void setPower_mw(int power_mw) {
		this.power_mw = power_mw;
	}

	public int getTotal_wh() {
		return total_wh;
	}

	public void setTotal_wh(int total_wh) {
		this.total_wh = total_wh;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
