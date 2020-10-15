package hu.ak_academy.dss.menu.item;

import hu.ak_academy.dss.menu.executor.MenuItemExecutor;
import hu.ak_academy.dss.symptom.Symptom;

public class SymptomCategorySubSymptomMenuItem extends SymptomSelectorMenuItem {

	public SymptomCategorySubSymptomMenuItem(Symptom symptom, MenuItemExecutor menuItemExecutor) {
		super(NO_SHORTCUT, symptom,  menuItemExecutor);
	}

	@Override
	public void display() {
		if (symptom.isChecked()) {
			System.out.println("\t" + this + "\t(" + symptom.getSymptomState().getLabel() + ")");
		}
	}
}
