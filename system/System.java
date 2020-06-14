/**
 * Simon Mendel Amar
 * 337790786
 */
/**
* system.java implementation
*/
package system;
import animals.*;
import animals.Animal.gender;
import animals.Dolphin.WaterType;
import animals.Snake.PoisonLevel;
import animals.Snake.Poisonous;
import mobility.Point;

import java.util.Scanner;

import Olympics.*;
import Olympics.Medal.type;
/**
 * The main class for testing the assignment
 */
public class System {

	public static void main(String[] args) {
		Scanner s=new Scanner(java.lang.System.in);
		java.lang.System.out.println("Please enter amount of animals:");
		int numOfAnimals=s.nextInt();
		Animal[] animals=new Animal[numOfAnimals];
		for(int i=0;i<numOfAnimals;++i) {
		
		int choice1;
		do {
			java.lang.System.out.println(
					"Which type of Animal would you like to add?\nPress-1 |For water animals ,Press-2 |For terrestrial animals ,Press-3 |For air animals.");
			choice1 = s.nextInt();
		} while (choice1<1 || choice1>3);
		
		switch(choice1) 
		{
			case 1:
				int choice2;
				do {
					java.lang.System.out.println("Please choose one of the water animals.\n");
					java.lang.System.out.println("Press-1 |For alligator,Press-2 |For Dolphin ,Press-3 |For Whale.");
					choice2 = s.nextInt();
				} while (choice2<1 || choice2>3);
				
				switch(choice2) {
					case 1:
						int choiceAl;
						do {
						java.lang.System.out.println("If you want to create a default aligator|Press-1\nIf you want to enter values for your alligator|Press-2");
						choiceAl=s.nextInt();
						}while(choiceAl<1 || choiceAl>2);
						switch(choiceAl) {
						case 1:
							animals[i]=new Alligator();
							break;
						case 2:
							int m;
							int X;
							int Y;
							double dist;
							double weight;
							double speed;
							int medal;
							int year;
							double dive;
							String city;
							String area;
							gender gen = null;
							String name;
							java.lang.System.out.println("Please enter x and y coordinators for his position:");
							X=s.nextInt();
							Y=s.nextInt();
							java.lang.System.out.println("Please enter the distance he has done:");
							dist=s.nextDouble();
							java.lang.System.out.println("Please enter his name:");
							name=s.next();
							do {
							java.lang.System.out.println("Please enter his gender:\nFor Female|Press-1\nFor Male|Press-2\nFor Hermaphrodite|Press-3");
							m=s.nextInt();
							}while(m<1 || m>3);
							switch(m) {
							case 1:
								gen=gender.Female;
								break;
							case 2:
								gen=gender.Male;
								break;
							case 3:
								gen=gender.Hermaphrodite;
								break;
							}
							java.lang.System.out.println("Please enter his weight:");
							weight=s.nextDouble();
							java.lang.System.out.println("Please enter his speed:");
							speed=s.nextDouble();
							java.lang.System.out.println("Please enter amount of medals:");
							medal=s.nextInt();
							Medal[] medals=new Medal[medal];
							for(int j=0;j<medal;++j) {
								java.lang.System.out.println("Please enter a medal:");
								java.lang.System.out.println("Please enter the city where the medal was won:");
								city=s.next();
								java.lang.System.out.println("Please enter the year the medal was won:");
								year=s.nextInt();
								int c;
								do {
									java.lang.System.out.println("Please enter the type of the medal:\nFor gold|Press-1\nFor silver|Press-2\nFor bronze|Press-3");
								c=s.nextInt();
								}while(c<1 || c>3);
								type t = null;
								switch(c) {
								case 1: 
									t=type.gold;
									break;
								case 2:
									t=type.silver;
									break;
								case 3:
									t=type.bronze;
									break;
								}
								medals[j]=new Medal(city,year,t);
							}
							java.lang.System.out.println("Please enter his dive depth:");
							dive=s.nextDouble();
							java.lang.System.out.println("Please enter his area of living:");
							area=s.next();
							Point p=new Point(X,Y);
							animals[i]=new Alligator(p,dist,name,gen,weight,speed,medals,dive,area);
						}
				 
						break;// end of alligator
					case 2:
						int choiceDol;
						do {
						java.lang.System.out.println("If you want to create a default dolphin|Press-1\nIf you want to enter values for your dolphin|Press-2");
						choiceDol=s.nextInt();
						}while(choiceDol<1 || choiceDol>2);
						switch(choiceDol) {
						case 1:
							animals[i]=new Dolphin();
							break;
						case 2:
							int m;
							int X;
							int Y;
							double dist;
							double weight;
							double speed;
							int medal;
							int year;
							double dive;
							String city;
							gender gen = null;
							String name;
							java.lang.System.out.println("Please enter x and y coordinators for his position:");
							X=s.nextInt();
							Y=s.nextInt();
							java.lang.System.out.println("Please enter the distance he has done:");
							dist=s.nextDouble();
							java.lang.System.out.println("Please enter his name:");
							name=s.next();
							do {
							java.lang.System.out.println("Please enter his gender:\nFor Female|Press-1\nFor Male|Press-2\nFor Hermaphrodite|Press-3");
							m=s.nextInt();
							}while(m<1 || m>3);
							switch(m) {
							case 1:
								gen=gender.Female;
								break;
							case 2:
								gen=gender.Male;
								break;
							case 3:
								gen=gender.Hermaphrodite;
								break;
							}
							java.lang.System.out.println("Please enter his weight:");
							weight=s.nextDouble();
							java.lang.System.out.println("Please enter his speed:");
							speed=s.nextDouble();
							java.lang.System.out.println("Please enter amount of medals:");
							medal=s.nextInt();
							Medal[] medals=new Medal[medal];
							for(int j=0;j<medal;++j) {
								java.lang.System.out.println("Please enter a medal:");
								java.lang.System.out.println("Please enter the city where the medal was won:");
								city=s.next();
								java.lang.System.out.println("Please enter the year the medal was won:");
								year=s.nextInt();
								int c;
								do {
									java.lang.System.out.println("Please enter the type of the medal:\nFor gold|Press-1\nFor silver|Press-2\nFor bronze|Press-3");
								c=s.nextInt();
								}while(c<1 || c>3);
								type t = null;
								switch(c) {
								case 1: 
									t=type.gold;
									break;
								case 2:
									t=type.silver;
									break;
								case 3:
									t=type.bronze;
									break;
								}
								medals[j]=new Medal(city,year,t);
							}
							java.lang.System.out.println("Please enter his dive depth:");
							dive=s.nextDouble();
							int water;
							WaterType w=null;
							do {
							java.lang.System.out.println("Please enter the type of water the dolphin lives in:For sea water|Press-1,For sweet water|Press-2");
							water=s.nextInt();
							}while(water<1|| water>2);
							switch(water) {
							case 1:
								w=WaterType.Sea;
								break;
							case 2:
								w=WaterType.Sweet;
								break;
							}
							Point p=new Point(X,Y);
							animals[i]=new Dolphin(p,dist,name,gen,weight,speed,medals,dive,w);
						}
						break;//end of dolphin
					case 3:
						int choiceWhale;
						do {
						java.lang.System.out.println("If you want to create a default whale|Press-1\nIf you want to enter values for your whale|Press-2");
						choiceWhale=s.nextInt();
						}while(choiceWhale<1 || choiceWhale>2);
						switch(choiceWhale) {
						case 1:
							animals[i]=new Dolphin();
							break;
						case 2:
							int m;
							int X;
							int Y;
							double dist;
							double weight;
							double speed;
							int medal;
							int year;
							double dive;
							String city;
							gender gen = null;
							String name;
							java.lang.System.out.println("Please enter x and y coordinators for his position:");
							X=s.nextInt();
							Y=s.nextInt();
							java.lang.System.out.println("Please enter the distance he has done:");
							dist=s.nextDouble();
							java.lang.System.out.println("Please enter his name:");
							name=s.next();
							do {
							java.lang.System.out.println("Please enter his gender:\nFor Female|Press-1\nFor Male|Press-2\nFor Hermaphrodite|Press-3");
							m=s.nextInt();
							}while(m<1 || m>3);
							switch(m) {
							case 1:
								gen=gender.Female;
								break;
							case 2:
								gen=gender.Male;
								break;
							case 3:
								gen=gender.Hermaphrodite;
								break;
							}
							java.lang.System.out.println("Please enter his weight:");
							weight=s.nextDouble();
							java.lang.System.out.println("Please enter his speed:");
							speed=s.nextDouble();
							java.lang.System.out.println("Please enter amount of medals:");
							medal=s.nextInt();
							Medal[] medals=new Medal[medal];
							for(int j=0;j<medal;++j) {
								java.lang.System.out.println("Please enter a medal:");
								java.lang.System.out.println("Please enter the city where the medal was won:");
								city=s.next();
								java.lang.System.out.println("Please enter the year the medal was won:");
								year=s.nextInt();
								int c;
								do {
								java.lang.System.out.println("Please enter the type of the medal:\nFor gold|Press-1\nFor silver|Press-2\nFor bronze|Press-3");
								c=s.nextInt();
								}while(c<1 || c>3);
								type t = null;
								switch(c) {
								case 1: 
									t=type.gold;
									break;
								case 2:
									t=type.silver;
									break;
								case 3:
									t=type.bronze;
									break;
								}
								medals[j]=new Medal(city,year,t);
							}
							java.lang.System.out.println("Please enter his dive depth:");
							dive=s.nextDouble();
							String food;
							java.lang.System.out.println("Please enter his food type:");
							food=s.next();
							Point p=new Point(X,Y);
							animals[i]=new Whale(p,dist,name,gen,weight,speed,medals,dive,food);
						}						
						break;//end of Whale
				}
			
			break;//end of water animal
		case 2:
			int choice3;
			do {
				java.lang.System.out.println("Please choose one of the terrestrial animals.\n");
				java.lang.System.out.println("Press-1 |For dog ,Press-2 |For cat ,Press-3 |For snake.");
				choice3 = s.nextInt();
			} while (choice3<1 || choice3>3);
			 switch(choice3) {
			 case 1://dog
				 int choiceDog;
					do {
					java.lang.System.out.println("If you want to create a default dog|Press-1\nIf you want to enter values for your dog|Press-2");
					choiceDog=s.nextInt();
					}while(choiceDog<1 || choiceDog>2);
					switch(choiceDog) {
					case 1:
						animals[i]=new Dog();
						break;
					case 2:
						int m;
						int X;
						int Y;
						double dist;
						double weight;
						double speed;
						int medal;
						int year;
						String breed;
						int legs;
						String city;
						gender gen = null;
						String name;
						java.lang.System.out.println("Please enter x and y coordinators for his position:");
						X=s.nextInt();
						Y=s.nextInt();
						java.lang.System.out.println("Please enter the distance he has done:");
						dist=s.nextDouble();
						java.lang.System.out.println("Please enter his name:");
						name=s.next();
						do {
						java.lang.System.out.println("Please enter his gender:\nFor Female|Press-1\nFor Male|Press-2\nFor Hermaphrodite|Press-3");
						m=s.nextInt();
						}while(m<1 || m>3);
						switch(m) {
						case 1:
							gen=gender.Female;
							break;
						case 2:
							gen=gender.Male;
							break;
						case 3:
							gen=gender.Hermaphrodite;
							break;
						}
						java.lang.System.out.println("Please enter his weight:");
						weight=s.nextDouble();
						java.lang.System.out.println("Please enter his speed:");
						speed=s.nextDouble();
						java.lang.System.out.println("Please enter amount of medals:");
						medal=s.nextInt();
						Medal[] medals=new Medal[medal];
						for(int j=0;j<medal;++j) {
							java.lang.System.out.println("Please enter a medal:");
							java.lang.System.out.println("Please enter the city where the medal was won:");
							city=s.next();
							java.lang.System.out.println("Please enter the year the medal was won:");
							year=s.nextInt();
							int c;
							do {
								java.lang.System.out.println("Please enter the type of the medal:\nFor gold|Press-1\nFor silver|Press-2\nFor bronze|Press-3");
							c=s.nextInt();
							}while(c<1 || c>3);
							type t = null;
							switch(c) {
							case 1: 
								t=type.gold;
								break;
							case 2:
								t=type.silver;
								break;
							case 3:
								t=type.bronze;
								break;
							}
							medals[j]=new Medal(city,year,t);
						}
						java.lang.System.out.println("Please enter number of legs for the dog:");
						legs=s.nextInt();
						java.lang.System.out.println("Please enter the dog's breed:");
						breed=s.next();
						Point p=new Point(X,Y);
						animals[i]=new Dog(p,dist,name,gen,weight,speed,medals,legs,breed);
					}
					break;// end of dog
				 
			 case 2://cat
				 int choiceCat;
					do {
					java.lang.System.out.println("If you want to create a default cat|Press-1\nIf you want to enter values for your cat|Press-2");
					choiceCat=s.nextInt();
					}while(choiceCat<1 || choiceCat>2);
					switch(choiceCat) {
					case 1:
						animals[i]=new Cat();
						break;
					case 2:
						int m;
						int X;
						int Y;
						double dist;
						double weight;
						double speed;
						int medal;
						int year;
						boolean cast;
						int legs;
						String city;
						gender gen = null;
						String name;
						java.lang.System.out.println("Please enter x and y coordinators for his position:");
						X=s.nextInt();
						Y=s.nextInt();
						java.lang.System.out.println("Please enter the distance he has done:");
						dist=s.nextDouble();
						java.lang.System.out.println("Please enter his name:");
						name=s.next();
						do {
						java.lang.System.out.println("Please enter his gender:\nFor Female|Press-1\nFor Male|Press-2\nFor Hermaphrodite|Press-3");
						m=s.nextInt();
						}while(m<1 || m>3);
						switch(m) {
						case 1:
							gen=gender.Female;
							break;
						case 2:
							gen=gender.Male;
							break;
						case 3:
							gen=gender.Hermaphrodite;
							break;
						}
						java.lang.System.out.println("Please enter his weight:");
						weight=s.nextDouble();
						java.lang.System.out.println("Please enter his speed:");
						speed=s.nextDouble();
						java.lang.System.out.println("Please enter amount of medals:");
						medal=s.nextInt();
						Medal[] medals=new Medal[medal];
						for(int j=0;j<medal;++j) {
							java.lang.System.out.println("Please enter a medal:");
							java.lang.System.out.println("Please enter the city where the medal was won:");
							city=s.next();
							java.lang.System.out.println("Please enter the year the medal was won:");
							year=s.nextInt();
							int c;
							do {
								java.lang.System.out.println("Please enter the type of the medal:\nFor gold|Press-1\nFor silver|Press-2\nFor bronze|Press-3");
							c=s.nextInt();
							}while(c<1 || c>3);
							type t = null;
							switch(c) {
							case 1: 
								t=type.gold;
								break;
							case 2:
								t=type.silver;
								break;
							case 3:
								t=type.bronze;
								break;
							}
							medals[j]=new Medal(city,year,t);
						}
						java.lang.System.out.println("Please enter number of legs for the dog:");
						legs=s.nextInt();
						java.lang.System.out.println("Please enter if he is castrated:true/false");
						cast=s.nextBoolean();
						Point p=new Point(X,Y);
						animals[i]=new Cat(p,dist,name,gen,weight,speed,medals,legs,cast);
					}
					break;// end of cat
			 case 3://snake
				 int choiceSnake;
					do {
					java.lang.System.out.println("If you want to create a default snake|Press-1\nIf you want to enter values for your snake|Press-2");
					choiceSnake=s.nextInt();
					}while(choiceSnake<1 || choiceSnake>2);
					switch(choiceSnake) {
					case 1:
						animals[i]=new Snake();
						break;
					case 2:
						int m;
						int X;
						int Y;
						double dist;
						double weight;
						double speed;
						int medal;
						int year;
						Poisonous poison=null;
						PoisonLevel level=null;
						double length;
						int legs;
						String city;
						gender gen = null;
						String name;
						java.lang.System.out.println("Please enter x and y coordinators for his position:");
						X=s.nextInt();
						Y=s.nextInt();
						java.lang.System.out.println("Please enter the distance he has done:");
						dist=s.nextDouble();
						java.lang.System.out.println("Please enter his name:");
						name=s.next();
						do {
						java.lang.System.out.println("Please enter his gender:\nFor Female|Press-1\nFor Male|Press-2\nFor Hermaphrodite|Press-3");
						m=s.nextInt();
						}while(m<1 || m>3);
						switch(m) {
						case 1:
							gen=gender.Female;
							break;
						case 2:
							gen=gender.Male;
							break;
						case 3:
							gen=gender.Hermaphrodite;
							break;
						}
						java.lang.System.out.println("Please enter his weight:");
						weight=s.nextDouble();
						java.lang.System.out.println("Please enter his speed:");
						speed=s.nextDouble();
						java.lang.System.out.println("Please enter amount of medals:");
						medal=s.nextInt();
						Medal[] medals=new Medal[medal];
						for(int j=0;j<medal;++j) {
							java.lang.System.out.println("Please enter a medal:");
							java.lang.System.out.println("Please enter the city where the medal was won:");
							city=s.next();
							java.lang.System.out.println("Please enter the year the medal was won:");
							year=s.nextInt();
							int c;
							do {
								java.lang.System.out.println("Please enter the type of the medal:\nFor gold|Press-1\nFor silver|Press-2\nFor bronze|Press-3");
							c=s.nextInt();
							}while(c<1 || c>3);
							type t = null;
							switch(c) {
							case 1: 
								t=type.gold;
								break;
							case 2:
								t=type.silver;
								break;
							case 3:
								t=type.bronze;
								break;
							}
							medals[j]=new Medal(city,year,t);
						}
						java.lang.System.out.println("Please enter the snake length:");
						length=s.nextDouble();
						java.lang.System.out.println("Please enter number of legs for the dog:");
						legs=s.nextInt();
						Point p=new Point(X,Y);
						int p1;
						do {
						java.lang.System.out.println("Please enter if the snake is Poisonous:\nFor Poisonous|Press-1\nFor Not Poisonous|Press-2");
						p1=s.nextInt();
						}while(p1<1 ||p1>2);
						switch(p1) {
						case 1:
							poison=Poisonous.Poisonous;
							break;
						case 2:
							poison=Poisonous.NotPoisonous;
							break;
						}
						if(poison==Poisonous.Poisonous)
						{
							int p2;
							do {
							java.lang.System.out.println("Please enter the level of the poison:\nFor High|Press-1\nFor Medium|Press-2\nFor Low|Press-3");
							p2=s.nextInt();
							}while(p2<1 ||p2>2);
							switch(p2) {
							case 1:
								level=PoisonLevel.High;
								break;
							case 2:
								level=PoisonLevel.Medium;
								break;
							case 3:
								level=PoisonLevel.Low;
								break;
								
							}
							animals[i]=new Snake(p,dist,name,gen,weight,speed,medals,legs,poison,length,level);

						}
						else
							animals[i]=new Snake(p,dist,name,gen,weight,speed,medals,legs,poison,length);

					}
					break;// end of snake
			 }
			break;// end of terrestrial animals
		case 3:
			int choice4;
			do {
				java.lang.System.out.println("Please choose one of the air animals.\n");
				java.lang.System.out.println("For eagle|Press-1\nFor pigeon|Press-2");
				choice4 = s.nextInt();
			} while (choice4<1 || choice4>3);
			switch(choice4) {
			 case 1://eagle
				 int choiceEagle;
					do {
					java.lang.System.out.println("If you want to create a default eagle|Press-1\nIf you want to enter values for your eagle|Press-2");
					choiceEagle=s.nextInt();
					}while(choiceEagle<1 || choiceEagle>2);
					switch(choiceEagle) {
					case 1:
						animals[i]=new Eagle();
						break;
					case 2:
						int m;
						int X;
						int Y;
						double dist;
						double weight;
						double speed;
						int medal;
						int year;
						String city;
						double wing;
						double altitude;
						gender gen = null;
						String name;
						java.lang.System.out.println("Please enter x and y coordinators for his position:");
						X=s.nextInt();
						Y=s.nextInt();
						java.lang.System.out.println("Please enter the distance he has done:");
						dist=s.nextDouble();
						java.lang.System.out.println("Please enter his name:");
						name=s.next();
						do {
						java.lang.System.out.println("Please enter his gender:\nFor Female|Press-1\nFor Male|Press-2\nFor Hermaphrodite|Press-3");
						m=s.nextInt();
						}while(m<1 || m>3);
						switch(m) {
						case 1:
							gen=gender.Female;
							break;
						case 2:
							gen=gender.Male;
							break;
						case 3:
							gen=gender.Hermaphrodite;
							break;
						}
						java.lang.System.out.println("Please enter his weight:");
						weight=s.nextDouble();
						java.lang.System.out.println("Please enter his speed:");
						speed=s.nextDouble();
						java.lang.System.out.println("Please enter amount of medals:");
						medal=s.nextInt();
						Medal[] medals=new Medal[medal];
						for(int j=0;j<medal;++j) {
							java.lang.System.out.println("Please enter a medal:");
							java.lang.System.out.println("Please enter the city where the medal was won:");
							city=s.next();
							java.lang.System.out.println("Please enter the year the medal was won:");
							year=s.nextInt();
							int c;
							do {
								java.lang.System.out.println("Please enter the type of the medal:\nFor gold|Press-1\nFor silver|Press-2\nFor bronze|Press-3");
							c=s.nextInt();
							}while(c<1 || c>3);
							type t = null;
							switch(c) {
							case 1: 
								t=type.gold;
								break;
							case 2:
								t=type.silver;
								break;
							case 3:
								t=type.bronze;
								break;
							}
							medals[j]=new Medal(city,year,t);
						}
						java.lang.System.out.println("Please enter the span of the wings of the eagle:");
						wing=s.nextDouble();
						java.lang.System.out.println("Please enter the eagle's altitude");
						altitude=s.nextDouble();
						Point p=new Point(X,Y);
						animals[i]=new Eagle(p,dist,name,gen,weight,speed,medals,wing,altitude);
					}
					break;// end of eagle
			 	
		 	case 2://pigeon
				 int choicePig;
					do {
					java.lang.System.out.println("If you want to create a default eagle|Press-1\nIf you want to enter values for your eagle|Press-2");
					choicePig=s.nextInt();
					}while(choicePig<1 || choicePig>2);
					switch(choicePig) {
					case 1:
						animals[i]=new Pigeon();
						break;
					case 2:
						int m;
						int X;
						int Y;
						double dist;
						double weight;
						double speed;
						int medal;
						int year;
						String city;
						double wing;
						String family;
						gender gen = null;
						String name;
						java.lang.System.out.println("Please enter x and y coordinators for his position:");
						X=s.nextInt();
						Y=s.nextInt();
						java.lang.System.out.println("Please enter the distance he has done:");
						dist=s.nextDouble();
						java.lang.System.out.println("Please enter his name:");
						name=s.next();
						do {
						java.lang.System.out.println("Please enter his gender:\nFor Female|Press-1\nFor Male|Press-2\nFor Hermaphrodite|Press-3");
						m=s.nextInt();
						}while(m<1 || m>3);
						switch(m) {
						case 1:
							gen=gender.Female;
							break;
						case 2:
							gen=gender.Male;
							break;
						case 3:
							gen=gender.Hermaphrodite;
							break;
						}
						java.lang.System.out.println("Please enter his weight:");
						weight=s.nextDouble();
						java.lang.System.out.println("Please enter his speed:");
						speed=s.nextDouble();
						java.lang.System.out.println("Please enter amount of medals:");
						medal=s.nextInt();
						Medal[] medals=new Medal[medal];
						for(int j=0;j<medal;++j) {
							java.lang.System.out.println("Please enter a medal:");
							java.lang.System.out.println("Please enter the city where the medal was won:");
							city=s.next();
							java.lang.System.out.println("Please enter the year the medal was won:");
							year=s.nextInt();
							int c;
							do {
								java.lang.System.out.println("Please enter the type of the medal:\nFor gold|Press-1\nFor silver|Press-2\nFor bronze|Press-3");
							c=s.nextInt();
							}while(c<1 || c>3);
							type t = null;
							switch(c) {
							case 1: 
								t=type.gold;
								break;
							case 2:
								t=type.silver;
								break;
							case 3:
								t=type.bronze;
								break;
							}
							medals[j]=new Medal(city,year,t);
						}
						java.lang.System.out.println("Please enter the span of the wings of the pigeon:");
						wing=s.nextDouble();
						java.lang.System.out.println("Please enter the pigeon's family:");
						family=s.next();
						Point p=new Point(X,Y);
						animals[i]=new Pigeon(p,dist,name,gen,weight,speed,medals,wing,family);
					}
					break;// end of pigeon
			 	}
			 break;//end of air animals
			}
		}//end of loop
		int choice5;
		do {
		do {
			java.lang.System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			java.lang.System.out.println(
					"Please choose one of the following options: Press-1 |To print all animals details,Press-2 |To make the animals speak ,Press-3 |To quit the Menu.");
			java.lang.System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			choice5 = s.nextInt();
			}while (choice5<1 || choice5>3);
		 
		switch(choice5) {
		case 1:
			java.lang.System.out.println("\nAnimals details are :\n");
			for(int i=0;i<numOfAnimals;++i) {
				java.lang.System.out.println(animals[i].toString());
			}
			break;
		case 2:
			java.lang.System.out.println("\nAnimals are going to speak : \n");

			for(int i=0;i<numOfAnimals;++i) {
				animals[i].makeSound();
			}
			break;
		case 3:
			java.lang.System.out.println("GoodBye!");
			s.close();
			java.lang.System.exit(0);
			}
		}while (choice5!=3);
	}
}

