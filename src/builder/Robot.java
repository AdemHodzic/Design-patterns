package builder;

import java.util.List;

public interface Robot {
	
	public void setCommands(List<Integer> list);
	public void start();
	public void assemble();
	public void test();
	public void end();
	public void go();
}
