package hu.ak_academy.dss.menu.item;

import hu.ak_academy.dss.menu.executor.MenuItemExecutor;
import hu.ak_academy.dss.symptom.Symptom;

public class SymptomSelectorMenuItem extends GenericMenuItem {

	protected Symptom symptom;

	public SymptomSelectorMenuItem(String prefix, Symptom symptom, MenuItemExecutor menuItemExecutor) {
		super(prefix, symptom.getLabel(), menuItemExecutor);
		this.symptom = symptom;
	}

	@Override
	public void display() {
		System.out.println(this + "\t(" + symptom.getSymptomState().getLabel() + ")");
	}
}
