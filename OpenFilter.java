// Author   : Christian Dunn
// Date     : December 8th, 2016
// Purpose  : Used to filter inputs to save and load file to appropriately
//            open or close files.
// Compiler : NetBeans IDE 8.1

import java.io.File;
import javax.swing.filechooser.FileFilter;

// Class   : OpenFilter
// Purpose : To filter the ending file extension of i/o file
public class OpenFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
        if(f.getName().indexOf(".png") > 0) { return true; }
        return false;
    }

    @Override
    public String getDescription() {
        return ".png";
    }
    
}
