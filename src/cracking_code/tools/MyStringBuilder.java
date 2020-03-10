package cracking_code.tools;

public class MyStringBuilder {
	char[] buffer;
	int currentUsedBuffer;

	public MyStringBuilder(int initialBufferSize) {
		super();
		this.buffer = new char[initialBufferSize];
		this.currentUsedBuffer = 0;
	}

	public MyStringBuilder() {
		this(100);
	}

	public void append(String str) {
		if ((currentUsedBuffer + str.length()) > buffer.length) {
			char[] newBuffer = new char[buffer.length * 2 + str.length()];
			System.arraycopy(buffer, 0, newBuffer, 0, buffer.length);
			buffer = newBuffer;
		}

		for (int i = 0; i < str.length(); i++) {
			buffer[currentUsedBuffer++] = str.charAt(i);
		}
	}
	
	public String getStr() {
		String result = new String(buffer);
		return result;		
	}

	public static void main(String[] args) {
		MyStringBuilder str = new MyStringBuilder(1);
		str.append("Ola");
		str.append(" ");
		str.append("mundo!");
		String res = str.getStr();
		System.out.println(res);
	}
}
