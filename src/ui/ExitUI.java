package ui;

public class ExitUI extends UIMenu {

    public ExitUI() {
        this.setMenuName("Exit");
    }

    @Override
    public boolean isExit() {
        return true;
    }
}
