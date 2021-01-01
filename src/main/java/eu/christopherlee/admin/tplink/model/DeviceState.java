package eu.christopherlee.admin.tplink.model;

public class DeviceState {
	public enum RelayState {
		OFF(0), ON(1);
		private int value;

		private RelayState(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	private System system;
	private Emeter emeter;

	public System getSystem() {
		return system;
	}

	public void setSystem(System system) {
		this.system = system;
	}

	public Emeter getEmeter() {
		return emeter;
	}

	public void setEmeter(Emeter emeter) {
		this.emeter = emeter;
	}
}
