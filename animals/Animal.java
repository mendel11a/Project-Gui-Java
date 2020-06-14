/**
 * Simon Mendel Amar
 * 337790786
 */
package animals;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;

import Olympics.Medal;
import graphics.IAnimal;
import graphics.IDrawable;
import graphics.CompetitionPanel;
import mobility.ILocatable;
import mobility.Mobile;
import mobility.Point;
/**
 * Animal class that describe a an abstract animal and his caracteristics
 */
public abstract class Animal extends Mobile implements ILocatable,Cloneable,IAnimal,IDrawable{
	private String name;
	public enum gender{
		Male,
		Female,
		Hermaphrodite		
	}
	private gender gend;
	private double weight;
	private double speed;
	private Medal[] medals;
	private String animal_individual_sound;

	
	protected int size;
    public enum Orientation {EAST, SOUTH, WEST,NORTH}
    protected Orientation orien;
	protected int maxEnergy;
    protected int current_energy;
    private double distance;
	protected int energyPerMeter;
	protected CompetitionPanel pan;
	protected BufferedImage img1, img2, img3, img4;


	/**
	 * Ctor that get all the informations of the animal
	 */
	public Animal(Point location,double totalDistance,String name,gender gender,double weight,double speed,Medal[] medals) {
		super(location,totalDistance);
		this.name=name;
		this.gend=gender;
		this.speed=speed;
		this.weight=weight;
		this.medals=medals;
	    this.size = 65;
	    this.orien = Orientation.EAST;
	    this.maxEnergy = 60;
	    this.current_energy = 30;
	    this.energyPerMeter = 4;
	    this.distance = 0;
	    this.pan = new CompetitionPanel();
	}
	
	/**
	 * Default Ctor
	 */
	public Animal() {
		this(new Point(0,0),0,"None",gender.Male,0,0,new Medal[1]);
		this.size = 65;
	    this.orien = Orientation.EAST;
	    this.maxEnergy = 60;
	    this.current_energy = 30;
	    this.energyPerMeter = 4;
	    this.distance = 0;
	    this.pan = new CompetitionPanel();
	}
	/**
	 * To string function
	 */
	@Override
	public String toString() {
		return "Name:" + name +"\n"+super.toString()+ "Gender:" + gend +"\n"+ "Weight:" + weight + "\n"+"Speed:" + speed +"\n" +"Medals:"
				+ Arrays.toString(medals) +"\n"+ "Animal Individual Sound:" + animal_individual_sound;
	}
	/**
	 * Make sound function
	 */
	public void makeSound() {
		System.out.println("Animal "+ name+" said "+getAnimalSound()+"\n");
	}
	/**
	 * function that returns the sound of the animal
	 */
	protected String getAnimalSound() {
		return this.animal_individual_sound;
	}
	/**
	 * function that sets the sound of the animal
	 * @param sound
	 */
	protected boolean setAnimalSound(String sound) {
		this.animal_individual_sound=sound;
		return true;
	}
	/**
	 * function that sets the medals of the animal
	 * @param medals
	 */
	protected boolean setMedals(Medal[] medals) {
		this.medals=medals;
		return true;
	}
	/**
	 * function that returns the speed of the animal
	 */
	public double getSpeed() {
		return this.speed;
	}
	/**
	 * function that sets the speed of the animal
	 * @param speed
	 */
	protected boolean setSpeed(Double speed) {
		this.speed=speed;
		return true;
	}
	/**
	 * function that returns the name of the animal
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * function that returns the current energy of the animal
	 */
	public int getCurrentEnergy() {
		return this.current_energy;
	}
	/**
	 * function that returns the distance of the animal
	 */
	public double getDistance() {
		return this.distance;
	}
	
	
	public boolean setDistance(double dist) {
		if(dist>=0) {
			this.distance=dist;
			return true;
		}
		return false;
	}
	/**
	 * function that feed the animals
	 * @param energy
	 */
	public boolean eat(int energy) {
        int tempEnergy = this.current_energy + energy;

        if(tempEnergy > this.maxEnergy) {
            this.current_energy = this.maxEnergy;
        }
        else {
            this.current_energy += energy;
        }
        if(this.current_energy > 0 && this.current_energy > this.energyPerMeter) {
            super.setLocation(new Point((int) (super.getLocation().getX()+getSpeed()),super.getLocation().getY()));
            this.current_energy -= this.energyPerMeter;
            ++distance;
        }
        return true;
    }
	/**
	 * function that load pictures and make the pictures appear on screen
	 * @param nm
	 */
	@Override
    public void loadImages(String nm) throws IOException {
        img1 = ImageIO.read(new File(IDrawable.PICTURE_PATH + nm));
        img2 = ImageIO.read(new File(IDrawable.PICTURE_PATH + nm));
        img3 = ImageIO.read(new File(IDrawable.PICTURE_PATH + nm));
        img4 = ImageIO.read(new File(IDrawable.PICTURE_PATH + nm));
    }

	/**
	 * function that draw pictures on screen and make possible to change them
	 * @param g
	 */
    @Override
    public void drawObject(Graphics g) {
  
	     if(orien==Orientation.EAST) // animal move to the east side
	         g.drawImage(img1, super.getLocation().getX(), super.getLocation().getY(), size, size,
	                    pan);
	        
        else if(orien==Orientation.SOUTH) // animal move to the south side
            g.drawImage(img2, super.getLocation().getX(), super.getLocation().getY(), size, size,
                    pan);
        else if(orien==Orientation.WEST) // animal move to the west side
            g.drawImage(img3, super.getLocation().getX(), super.getLocation().getY(), size, size,
                    pan);
        else if(orien==Orientation.NORTH) // animal move to the north side
            g.drawImage(img4, super.getLocation().getX()-size/2, super.getLocation().getY(), size,
                    size, pan);

    }
	
}
