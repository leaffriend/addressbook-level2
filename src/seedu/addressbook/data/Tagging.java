package seedu.addressbook.data;

import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.tag.Tag;

public class Tagging {

	private enum Action{
		ADD, REMOVE;
	}
	
	private static final String ADD_ICON = "+";
	private static final String REMOVE_ICON = "-";
	
	private Name personName;
	private Tag tag;
	private String icon;
	
	public Tagging(Action action, Tag tag, Name personName){
		this.tag = tag;
		this.personName = personName;
		
		if(action == Action.ADD){
			icon = ADD_ICON;
		} else if(action == Action.REMOVE){
			icon = REMOVE_ICON;
		}
	}
	
	@Override
	public String toString(){
		return icon + " "
				+ personName.toString() + " "
				+ tag.toString();
	}
}
