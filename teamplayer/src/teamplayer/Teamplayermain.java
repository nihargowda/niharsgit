package teamplayer;

public class Teamplayermain {

	public Teamplayermain() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
	Team t1 = new Team(11,"rcb", "gary");
	Player p1 = new Player(301,"virat",t1);
	Player p2= new Player(401,"msd", new Team(22,"csk","fleming"));
p1.printpalyer();
p2.printpalyer();
}}
