public class TestingFinch{
	public static void main(String[] args) {
		Finch a = new Finch();
		
		while(true) {
			while(a.getDistance() < 15) {
				System.out.println(a.getDistance());
				a.setTurn("R", 10, 5);
			}
			a.setMove("F", 10, 10);
			
		}
	}
}
