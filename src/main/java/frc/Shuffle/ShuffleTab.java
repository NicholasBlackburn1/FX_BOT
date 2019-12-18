package frc.Shuffle;

import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;

public class ShuffleTab {
    public String TabName;

    public void createTab(ShuffleboardTab tab) {

        // Creates a Shuffleboard tab named from String Defined Tabname
        tab = Shuffleboard.getTab(TabName);
    }

    public void selectTab(Shuffleboard shuffleboard) {

        // Selects user made tab in shuffleboard
        Shuffleboard.selectTab(TabName);
    }

}