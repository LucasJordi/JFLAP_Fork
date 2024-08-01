package gui.action;

import java.io.File;
import javax.swing.filechooser.FileFilter;

class FileNameExtensionFilter extends FileFilter {
  String[] myAcceptedFormats;
  
  String myDescription;
  
  public FileNameExtensionFilter(String description, String... formats) {
    this.myDescription = description;
    this.myAcceptedFormats = formats;
  }
  
  public boolean accept(File f) {
    if (f.isDirectory())
      return true; 
    for (int i = 0; i < this.myAcceptedFormats.length; i++) {
      if (f.getName().endsWith("." + this.myAcceptedFormats[i]))
        return true; 
    } 
    return false;
  }
  
  public String getDescription() {
    return this.myDescription;
  }
}


/* Location:              /home/yujin/Downloads/JFLAP7.1.jar!/gui/action/FileNameExtensionFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */