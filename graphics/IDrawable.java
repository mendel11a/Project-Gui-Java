package graphics;

import java.awt.Graphics;
import java.io.IOException;
/**
 * Class that describes an IDrawable attributes
 *  * @author Mendel Amar id:337790786
 */
public interface IDrawable {
	public final static String PICTURE_PATH = "graphics//";
	public void loadImages(String nm) throws IOException;
	public void drawObject (Graphics g);

}
