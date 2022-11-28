package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeOlympicsTeam implements OlympicsTeam{
	
	private ArrayList<OlympicsTeam> children;
	private String name;
	
	public CompositeOlympicsTeam(String n) {
		name = n;
		children = new ArrayList<OlympicsTeam>();
	}
	
	public CompositeOlympicsTeam(String n, OlympicsTeam[] child) {
		name = n;
		children = new ArrayList<OlympicsTeam>();
		for(int i=0; i < child.length; i++) {
			add(child[i]);
		}
	}
	
	@Override
	public void accept(Visitor v) {
		v.visitCompositeTeam(this);
		
	}
	
	public void add(OlympicsTeam ot) {
		children.add(ot);
	}
	
	public void remove(OlympicsTeam ot) {
		children.remove(ot);
	}
	
	public ArrayList<OlympicsTeam> getChildren() {
		return children;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
