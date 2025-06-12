public class RandomAction{
	public static void main(String[] args) {
		Finch a = new Finch();
		boolean canKeepGoing = true;
		while(canKeepGoing) {	
			int move = (int)(Math.random()*100+1);
			int turn = (int)(Math.random()*360+1);
			int soundM = (int)(Math.random()*(135-31)+32);
			System.out.println("Before Move: " + move +" Turn: "+turn + " Sound: "+soundM);
			if(a.getDistance() <= move) {
				move = a.getDistance();
			}
			System.out.println("After Move: " + move +" Turn: "+turn + " Sound: "+soundM);
			System.out.println("Orientation: " + a.getOrientation());
			a.setMove("F", move, 10);
			a.setTurn("R", turn, 10);
			a.playNote(soundM, .5);
		}
	}
}
