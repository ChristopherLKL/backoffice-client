package eu.christopherlee.admin.service;

import java.util.List;

import eu.christopherlee.admin.model.User;
import eu.christopherlee.admin.tplink.model.Account;
import eu.christopherlee.admin.tplink.model.Device;
import eu.christopherlee.admin.tplink.model.DeviceState;
import eu.christopherlee.admin.tplink.model.Period;

public interface BackofficeService {
	User login();
	Account getTpLinkAccount();
	List<Device> getTpLinkDevices(int accountId);
	List<DeviceState> getTpLinkDeviceStates(int accountId, String deviceId, Period period);
	List<DeviceState> getTpLinkCurrentDevicesState(int accountId);
}
