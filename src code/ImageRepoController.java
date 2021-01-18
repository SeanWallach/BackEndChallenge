package main;
import java.io.File;
import java.util.ArrayList;
/**
 * This Class is the intermediary between the View and the Model
 * For now, it does not do much, however, it would be easy to add more functionality to it
 * @author Sean Wallach
 */
public class ImageRepoController {
    ImageRepoModel model= new ImageRepoModel();
    
    public ImageRepoController() {}
    
    /*
    * Files are received from the GUI, and sent immediately to the model. 
    * The model returns the files in an ArrayList for easier manipulation
    */
    public ArrayList<File> addImages(File[] files) {
        return model.addImages(files);
    }
}
