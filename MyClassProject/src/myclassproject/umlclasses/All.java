package myclassproject.umlclasses;

import com.entities.Character;
import com.entities.Furniture;
import com.entities.Item;
import com.entities.Place;
import com.enums.BodyTypes;
import com.enums.Clothing;
import com.enums.Colors;
import com.enums.FurnitureTypes;
import com.enums.HairStyle;
import com.enums.Items;
import com.enums.Places;

public final class All {
	public static final Character player = new MyCharacter("Player", BodyTypes.D, Clothing.Peasant, HairStyle.Short, Colors.Black, 6);
	public static final Character bandit = new MyCharacter("Bandit", BodyTypes.F, Clothing.Bandit, HairStyle.Bald, Colors.Black, 4);
	public static final Place cottage = new MyPlace("Home", Places.Cottage);
	public static final Place town = new MyPlace("Town", Places.City);
	public static final Item sword = new MyItem("Sword", Items.Sword);
	public static final Furniture cottageDoor = new MyFurniture(cottage, FurnitureTypes.Door);
	public static final Furniture table = new MyFurniture(cottage, FurnitureTypes.Table);
	public static final Furniture chair = new MyFurniture(cottage, FurnitureTypes.Chair);
	public static final Furniture cityDoor = new MyFurniture(town, FurnitureTypes.RedHouseDoor);
	public static final Furniture cityExit = new MyFurniture(town, FurnitureTypes.NorthEnd);
}
