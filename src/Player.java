import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Player extends Entity{

	public Player(int x, int y, Scene scene) {
		super(x, y, scene);
	}
	
	public void init() {
		width = 32;
		height = 32;
		texture = "chicken.jpg";
	}
	
	public void update() {
		x++;
		
		if(KeyInput.get(KeyEvent.VK_W)) {
			System.out.println("coo");
		}
	}


}
