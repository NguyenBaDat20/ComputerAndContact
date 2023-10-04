package defaultComputer;

import controller.Manager;

public class Main {

    public static void main(String[] args) {
        while (true) {
            int choice = Manager.mennu();
            switch (choice) {
                case 1:
                    Manager.normalCalculator();
                    break;
                case 2:
                    Manager.BMICalculator();
                    break;
                case 3:
                    return;
            }
        }
    }
}
