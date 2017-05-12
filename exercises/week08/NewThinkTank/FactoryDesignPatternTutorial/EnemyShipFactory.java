// This is a factory thats only job is creating ships
// By encapsulating ship creation, we only have one
// place to make modifications

public class EnemyShipFactory{
	
	// This could be used as a static method if we
	// are willing to give up subclassing it
	
	public EnemyShip makeEnemyShip(String newShipType){
		
		EnemyShip newShip = null;
		
		if (newShipType.equals("U")){
			
			return new UFOEnemyShip();
			
		} else 
		
		if (newShipType.equals("R")){
			
			return new RocketEnemyShip();
			
		} else 
		
		if (newShipType.equals("B")){
			
			return new BigUFOEnemyShip();
			
		} else return null;
		
	}
	
}

/*E:\SDP\day07\NewThinkTank\FactoryDesignPatternTutorial>java EnemyShipTesting
What type of ship? (U / R / B)U
UFO Enemy Ship is on the screen
UFO Enemy Ship is following the hero
UFO Enemy Ship attacks and does 20.0 damage to hero

E:\SDP\day07\NewThinkTank\FactoryDesignPatternTutorial>java EnemyShipTesting
What type of ship? (U / R / B)R
Rocket Enemy Ship is on the screen
Rocket Enemy Ship is following the hero
Rocket Enemy Ship attacks and does 10.0 damage to hero

E:\SDP\day07\NewThinkTank\FactoryDesignPatternTutorial>java EnemyShipTesting
What type of ship? (U / R / B)B
Big UFO Enemy Ship is on the screen
Big UFO Enemy Ship is following the hero
Big UFO Enemy Ship attacks and does 40.0 damage to hero*/