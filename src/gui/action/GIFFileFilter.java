package gui.action;

import java.io.File;
import javax.swing.filechooser.FileFilter;

class GIFFileFilter extends FileFilter {
  public boolean accept(File f) {
    return !(!f.getName().endsWith(".gif") && !f.isDirectory());
  }
  
  public String getDescription() {
    return ".gif";
  }
}


/* Location:              /home/yujin/Downloads/JFLAP7.1.jar!/gui/action/GIFFileFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */