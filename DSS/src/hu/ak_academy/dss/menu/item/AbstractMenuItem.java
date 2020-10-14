package hu.ak_academy.dss.menu.item;

public abstract class AbstractMenuItem implements MenuItem {

	private final static boolean DEFAULT_VISIBLE = true;
	private final static boolean DEFAULT_SELECTABLE = true;
	
	private String prefix;
	private String label;
	private boolean visible;
	private boolean selectable;

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
