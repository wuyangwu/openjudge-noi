package test;

public class dog {
private String name;
	
	private String year;
	
	private String typeString;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getTypeString() {
		return typeString;
	}

	public void setTypeString(String typeString) {
		this.typeString = typeString;
	}

	@Override
	public String toString() {
		return "猫 的名字=" + name + ", 年龄=" + year + ", 类型=" + typeString + "";
	}   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog dog = new dog();
		dog.setName("小白");
		dog.setYear("2岁");
		dog.setTypeString("白猫");
		System.out.print(dog.toString());
	}

}
