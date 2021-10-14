

package beans;

public class MyData {
     private int value1,value2;
     public int getValue1() {
		return value1;
	}
	public void setValue1(int value1) {
		this.value1 = value1;
	}
	public int getValue2() {
		return value2;
	}
	public void setValue2(int value2) {
		this.value2 = value2;
	}
	public MyData() {}
     public MyData(int v1,int v2) {
    	 value1=v1;
    	 value2=v2;
     }
     
}