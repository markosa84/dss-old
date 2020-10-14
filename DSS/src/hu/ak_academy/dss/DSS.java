package hu.ak_academy.dss;

import java.util.Scanner;

import hu.ak_academy.dss.menu.SymptomCategoryMenu;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;
import hu.ak_academy.dss.symptom.BadBreath;
import hu.ak_academy.dss.symptom.Cough;
import hu.ak_academy.dss.symptom.HeadAche;
import hu.ak_academy.dss.symptom.SoreThroat;
import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.ToothAche;
import hu.ak_academy.dss.symptom.container.SymptomContainer;

public class DSS {
	
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {

			UserInputHandler userInputHandler = new UserInputHandler(input);

			Symptom[] GlobalSymptoms = { 
					new BadBreath(), 
					new Cough(),
					new ToothAche(),
					new SoreThroat(),
					new HeadAche()
			};
						
			SymptomContainer allSymptoms = new SymptomContainer(GlobalSymptoms);
			
			new SymptomCategoryMenu(userInputHandler, allSymptoms).execute();
//			new SymptomCategoryMenu(input, allSymptoms).execute();
			
			System.out.println("Good Bye!");
		}
	}

}
