package hu.ak_academy.dss;

import java.util.Scanner;

import hu.ak_academy.dss.builder.GlobalSymptomContainerBuilder;
import hu.ak_academy.dss.builder.SymptomCategoryMenuBuilder;
import hu.ak_academy.dss.container.SymptomContainer;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;

public class DSS {
	
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {

			UserInputHandler userInputHandler = new UserInputHandler(input);
			SymptomContainer allSymptoms = GlobalSymptomContainerBuilder.build();
			
			SymptomCategoryMenuBuilder.build(userInputHandler, allSymptoms).execute();			
			
			System.out.println("Good Bye!");
		}
	}

}
