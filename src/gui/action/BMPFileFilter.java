package gui.action;

import java.io.File;
import javax.swing.filechooser.FileFilter;

class BMPFileFilter extends FileFilter {
  public boolean accept(File f) {
    return f.getName().endsWith(".bmp");
  }
  
  public String getDescription() {
    return ".bmp";
  }
}


/* Location:              /home/yujin/Downloads/JFLAP7.1.jar!/gui/action/BMPFileFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */