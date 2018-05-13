package proxy;

public class HugeObject implements HugeObjectInterface{
	//Pretend that we need a lot of time to get this object beacuse it's on the internet
	private String hugeString;
	private long hugeNumber;
	
	public HugeObject() {}
	

	public HugeObject(String hugeString, long hugeNumber) {
		super();
		this.hugeString = hugeString;
		this.hugeNumber = hugeNumber;
	}


	public String getHugeString() {
		return hugeString;
	}

	public void setHugeString(String hugeString) {
		this.hugeString = hugeString;
	}

	public long getHugeNumber() {
		return hugeNumber;
	}

	public void setHugeNumber(long hugeNumber) {
		this.hugeNumber = hugeNumber;
	}
	
	
	
}
