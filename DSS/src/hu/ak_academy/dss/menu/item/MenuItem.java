package hu.ak_academy.dss.menu.item;

public interface MenuItem {
	String getPrefix();
	String getLabel();
	boolean isVisible();
	boolean isSelectable();
	
	@Override
	String toString();

	@Override
	boolean equals(Object other);
}
