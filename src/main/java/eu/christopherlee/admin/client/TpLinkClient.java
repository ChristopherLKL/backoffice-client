package eu.christopherlee.admin.client;

import java.io.IOException;
import java.net.URISyntaxException;

public interface TpLinkClient {
	String getEndPoint();
	String createToken() throws URISyntaxException, IOException;
	String getDeviceList(String token) throws URISyntaxException, IOException;
	String getState(String uri, String token, String deviceId) throws URISyntaxException, IOException;
	String setState(String uri, String token, String deviceId, String state) throws URISyntaxException, IOException;
}
