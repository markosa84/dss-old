package hu.ak_academy.dss.menu.item;

import hu.ak_academy.dss.menu.executor.MenuItemExecutor;

public abstract class AbstractMenuItem implements MenuItem {

	public final static String NO_SHORTCUT = null;
	public final static MenuItemExecutor NO_EXECUTOR = null;

	public final static boolean VISIBLE = true;
	public final static boolean NOT_VISIBLE = false;
	public final static boolean DEFAULT_VISIBLE = VISIBLE;
	
	public final static boolean SELECTABLE = true;
	public final static boolean NOT_SELECTABLE = false;
	public final static boolean DEFAULT_SELECTABLE = SELECTABLE;
	
	protected String shortcut;
	protected String label;
	protected boolean visible;
	protected boolean selectable;
	
	protected MenuItemExecutor menuItemExecutor;

	public AbstractMenuItem(String shortcut, String label, boolean visible, boolean selectable, MenuItemExecutor menuItemExecutor) {
		this.shortcut = shortcut;
		this.label = label;
		this.visible = visible;
		this.selectable = selectable;
		this.menuItemExecutor = menuItemExecutor;
	}

	public AbstractMenuItem(String prefix, String label) {
		this(prefix,label,DEFAULT_VISIBLE, DEFAULT_SELECTABLE, null);
	}

	public AbstractMenuItem(String prefix, String label, MenuItemExecutor menuItemExecutor) {
		this(prefix,label,DEFAULT_VISIBLE, DEFAULT_SELECTABLE, menuItemExecutor);
	}
	
	public String getShortcut() {
		return shortcut;
	}

	public String getLabel() {
		return label;
	}
	
	public boolean isVisible() {
		return this.visible;
	}
	
	public boolean isSelectable() {
		return this.selectable;
	}
	
	public void display() {
		if(visible) {
			System.out.println(this);
		}
	}
	
	public boolean validateUserInput(String userInput) {
		if (this.selectable && 
				( 
						(this.shortcut != null && 
							this.shortcut.toLowerCase().equals(userInput.toLowerCase())) || 
							this.label.toLowerCase().equals(userInput.toLowerCase())
						)
				) {
			return true;
		}
		
		return false;
	}
	
	public boolean execute() {
		
		if (this.menuItemExecutor != null) {
			return this.menuItemExecutor.execute();
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		if (shortcut != null) {
			result += shortcut + ". ";
		}
		
		result += label;
	
		return result;
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == null) return false;
	    if (other == this) return true;
	    if (!(other instanceof AbstractMenuItem)) return false;
	    
	    AbstractMenuItem otherMenuItem = (AbstractMenuItem) other;
	    
		return this.label.equals(otherMenuItem.getLabel());
	}
}
