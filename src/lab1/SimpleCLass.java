package lab1;

public class SimpleCLass {
	private int value;

	public SimpleCLass(int number) {
		value = number * 2;
	}

	public String toString() {
		return "" + value;
	}

	public void incr() {
		value++;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
