package constructor;

public class Citizen extends Person {
	int voterid;
	String wardno;
	
	public Citizen() {
		this(10,"50");
	}

	public Citizen(int voterid) {
		this.voterid = voterid;
	}

	public Citizen(int voterid, String wardno) {
		this(200,"40","Hritik","o+ve");
		this.voterid = voterid;
		this.wardno = wardno;
	}

	public Citizen(int voterid, String wardno,String name) {
		this(500);
		this.voterid = voterid;
		this.wardno = wardno;
	}

	public Citizen(int voterid, String wardno,String name,String bloodgroup) {
		this(300,"450","Hidayat");
		this.voterid = voterid;
		this.wardno = wardno;
	}
	
	
	
	
}