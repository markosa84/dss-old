package hu.ak_academy.dss.organ;

public enum Organ {

	MOUTH("mouth"), HEAD("head"), NOSE("nose"), CHEST("chest"), WHOLEBODY("whole body"), EYES("eyes"), LEGS("legs"), HANDS("hands");

	private String name;

	private Organ(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
