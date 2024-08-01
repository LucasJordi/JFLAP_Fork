package gui.action;

import java.io.File;
import javax.swing.filechooser.FileFilter;

class AcceptAllFileFilter extends FileFilter {
  public boolean accept(File f) {
    return true;
  }
  
  public String getDescription() {
    return "All files";
  }
}


/* Location:              /home/yujin/Downloads/JFLAP7.1.jar!/gui/action/AcceptAllFileFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */