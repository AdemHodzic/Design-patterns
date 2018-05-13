package proxy;

public class HugeObjectProxy implements HugeObjectInterface{
	
	private HugeObjectInterface hugeObject;

	public HugeObjectProxy(HugeObject hugeObject) {
		super();
		this.hugeObject = hugeObject;
	}
	
	public HugeObjectProxy(String hugeString, long hugeNumber) {
		super();
		this.hugeObject = new HugeObject(hugeString,hugeNumber);
	}
	
	public String getHugeString() {
		return hugeObject.getHugeString();
	}

	public void setHugeString(String hugeString) {
		this.hugeObject.setHugeString(hugeString);
	}

	public long getHugeNumber() {
		return this.hugeObject.getHugeNumber();
	}

	public void setHugeNumber(long hugeNumber) {
		this.hugeObject.setHugeNumber(hugeNumber);
	}
	
}
