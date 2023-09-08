import ui.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private List<UIMenuInterface> menu;
    public Main() {
        //initialize menu list
        menu = new ArrayList<>();
        //add menu options
        menu.add(new RegistrationUI());
        menu.add(new LoginUI());
        menu.add(new LogoutUI());
        menu.add(new ExitUI());
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showMainMenu();
    }

    public void showMainMenu() {
        while(true) {
            System.out.println("Menu:");
            for (int i = 0; i < menu.size(); i++) {
                UIMenuInterface m = menu.get(i);
                System.out.println(i + 1 + ": " + m.getMenuName());
            }

            Scanner sc = new Scanner(System.in);
            System.out.print("Choice > ");
            //TODO: fix menu selection
            int selectedMenu = sc.nextInt() - 1;
            System.out.println("Your selection : " + (selectedMenu + 1));
            System.out.println(menu.get(selectedMenu).getMenuName());
            //TODO: fix this not dynamic code
            if (menu.get(selectedMenu).isExit()) {
                break;
            }
        }
    }
}