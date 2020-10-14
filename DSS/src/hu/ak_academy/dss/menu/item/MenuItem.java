package hu.ak_academy.dss.menu.item;

public interface MenuItem {
	String getPrefix();
	String getLabel();
	boolean isVisible();
	boolean isSelectable();
	
	void display();
	boolean validateUserInput(String userInput);
	
	boolean execute();
	
	@Override
	String toString();

	@Override
	boolean equals(Object other);
}
