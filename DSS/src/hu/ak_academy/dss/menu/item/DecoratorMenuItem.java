package hu.ak_academy.dss.menu.item;

public class DecoratorMenuItem extends AbstractMenuItem {

	public DecoratorMenuItem(String label) {
		super(null, label, true, false);
	}

	@Override
	public boolean execute() {
		// No-OP
		return false;
	}
}
