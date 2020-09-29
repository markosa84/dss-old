package hu.ak_academy.dss;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hu.ak_academy.dss.menu.Menu;
import hu.ak_academy.dss.organ.Organ;
import hu.ak_academy.dss.symptom.BadBreath;
import hu.ak_academy.dss.symptom.Cough;
import hu.ak_academy.dss.symptom.HeadAche;
import hu.ak_academy.dss.symptom.SoreThroat;
import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.ToothAche;
import hu.ak_academy.dss.userinputhandler.UserInputHandler;

public class DSS {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			List<String> nameOfOrgans = new ArrayList<>();
			for (Organ organ : Organ.values()) {
				nameOfOrgans.add(organ.getName());
				System.out.println(organ);
			}
			UserInputHandler userInputManagement = new UserInputHandler(input, nameOfOrgans);
			Symptom[] menuOptions = { new BadBreath(userInputManagement), new Cough(userInputManagement), new ToothAche(userInputManagement), new SoreThroat(userInputManagement), new HeadAche(userInputManagement) };
			Menu menu = new Menu(menuOptions, userInputManagement);
			boolean isItStillRunnig = true;
			while (isItStillRunnig) {
				isItStillRunnig = menu.choose();
			}
			System.out.println("Good Bye!");
		}
	}

}
