package hu.ak_academy.dss.menu.executor;

import hu.ak_academy.dss.builder.SymptomSelectorMenuBuilder;
import hu.ak_academy.dss.container.SymptomContainer;
import hu.ak_academy.dss.interfaces.MenuItemExecutor;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;
import hu.ak_academy.dss.symptom.category.SymptomCategory;

public class SymptomCategoryMenuItemExecutor implements MenuItemExecutor {

	private SymptomCategory symptomCategory;
	private UserInputHandler userInputHandler;
	private SymptomContainer symptomContainer;

	public SymptomCategoryMenuItemExecutor(SymptomCategory symptomCategory, UserInputHandler userInputHandler,
			SymptomContainer symptomContainer) {
		
		this.symptomCategory = symptomCategory;
		this.userInputHandler = userInputHandler;
		this.symptomContainer = symptomContainer;
	}
	
	@Override
	public boolean execute() {

		SymptomSelectorMenuBuilder.build(userInputHandler, symptomContainer, symptomCategory).execute();

		return true;
	}
}
