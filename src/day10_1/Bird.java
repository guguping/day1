package day10_1;

public class Bird extends Animal {

	String cry;
	String move;
	String food;

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return cry;
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return move;
	}

	@Override
	public String food() {
		// TODO Auto-generated method stub
		return food;
	}

	@Override
	public void print() {
		System.out.println(getName()+"/"+cry+"/"+move+"/"+food);
	}

}
