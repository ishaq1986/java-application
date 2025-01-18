public class TrafficLightState{
	public static void main(String args[]){
		enum TrafficLight {RED, YELLOW, GREEN;}
		
		TrafficLight currentLight = TrafficLight.RED;
		
		switch (currentLight){
			case RED:
				System.out.println("Stop");
			break;
			case YELLOW:
				System.out.println("Prepare to Stop");
			break;
			case GREEN:
				System.out.println("Go");
			break;
			}
	}
}