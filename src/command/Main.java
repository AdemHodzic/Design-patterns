package command;

public class Main {
	
	public static void main(String[] args) {
		
		Light[] lights = {new Light(), new Light(), new Light(), new Light()};
		
		checkLights(lights);
		
		LightOnCommand[] ons = {
				new LightOnCommand(lights[0]),new LightOnCommand(lights[1]),
				new LightOnCommand(lights[2]),new LightOnCommand(lights[3])};
		
		LightOffCommand[] offs = {
				new LightOffCommand(lights[0]),new LightOffCommand(lights[1]),
				new LightOffCommand(lights[2]),new LightOffCommand(lights[3])};
		
		
		Invoker invoker = new Invoker(ons[0]);
		invoker.execute();
		
		checkLights(lights);
		
		invoker.setCommand(offs[0]);
		invoker.execute();
		checkLights(lights);
		invoker.unexecute();
		checkLights(lights);
		
		
		
	}
	
	public static void checkLights(Light[] lights) {
		for(Light light : lights) {
			System.out.print(light.getState() + " ");
		}
		System.out.println();
	}
	
}
