package main;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Sean Wallach
 */
public class ImageRepoModel {
    protected ArrayList<File> photoList = new ArrayList<File>();;  // The model class is in charge of maintaining the list of photos
    
    public ImageRepoModel() {}
    
    public ArrayList<File> addImages(File[] files) {
        for (int i = 0; i < files.length; i++) {
            //String filename = files[i].getAbsolutePath();
            if (!photoList.contains(files[i])) {
                photoList.add(files[i]);
            }   
        }
        
        // Testing purposes 
        System.out.println("PhotoList in Model:");
        for(File f:photoList) {
            System.out.println(f);
        }
        System.out.println("-----------------------------------");
        
        return photoList;
    }
}
