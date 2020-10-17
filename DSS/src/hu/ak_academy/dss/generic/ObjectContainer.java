package hu.ak_academy.dss.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ObjectContainer <T> {
	protected List<T> items;

	public ObjectContainer() {
		this.items = new ArrayList<>();
	}

	public ObjectContainer(T[] array) {
		this.items = new ArrayList<>(Arrays.asList(array));
	}

	public List<T> getItems() {
		return this.items;
	}

	public void add(T item) {
		this.items.add(item);
	}

	public void add(ObjectContainer <T> otherContainer) {
		for (T otherItem : otherContainer.getItems()) {
			this.add(otherItem);			
		}
	}
	
	public int size() {
		return items.size();
	}
	
	public boolean contains(T otherItem) {
		if (items.contains(otherItem)) {
			return true;
		} else {
			return false;	
		}				
	}
}
