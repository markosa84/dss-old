package hu.ak_academy.dss.menu.item;

public abstract class AbstractMenuItem implements MenuItem {

	public final static boolean DEFAULT_VISIBLE = true;
	public final static boolean DEFAULT_SELECTABLE = true;
	
	protected String prefix;
	protected String label;
	protected boolean visible;
	protected boolean selectable;

	public AbstractMenuItem(String prefix, String label, boolean visible, boolean selectable) {
		this.prefix = prefix;
		this.label = label;
		this.visible = visible;
		this.selectable = selectable;
	}

	public AbstractMenuItem(String prefix, String label) {
		this(prefix,label,DEFAULT_VISIBLE, DEFAULT_SELECTABLE);
	}
	
	public String getPrefix() {
		return prefix;
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
		System.out.println(this);
	}
	
	public boolean validateUserInput(String userInput) {
		if (this.selectable && (this.prefix.equals(userInput) || this.label.equals(userInput)) ) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		if (prefix != null) {
			result += prefix + ". ";
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
