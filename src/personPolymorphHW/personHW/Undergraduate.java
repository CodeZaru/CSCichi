package personHW;

public class Undergraduate extends Student {
	private int level; // 1 for freshman, 2 for sophomore
						// 3 for junior, or 4 for senior.

	public Undergraduate() 
		{ 
			super(); 
			level = 1; 
		}

	public Undergraduate(String initialName, int initialStudentNumber, int initialLevel) 
	{ 
		super(initialName, initialStudentNumber); 
		setLevel(initialLevel); 
		//checks 1 <= initialLevel <= 4 
		}
	
	Undergraduate(int level){
		super();
		this.level = level;
	}

//	Prof added this in class
//	Undergraduate(String ID, String name, int level){
//		super(ID, name);
//		this.level = level;
//	}

	public void reset(String newName, int newStudentNumber, int newLevel) 
	{
		reset(newName, newStudentNumber);// Student's reset
		setLevel(newLevel); // Checks 1 <= newLevel <= 4
	}

	public int getLevel() 
	{
		return level;
	}

	public void setLevel(int newLevel) 
	{
		if ((1 <= newLevel) && (newLevel <= 4))
			level = newLevel;
		else {
			System.out.println("Illegal level!");
			System.exit(0);
		}
	}

	public void writeOutput() 
	{
		super.writeOutput();
		System.out.println("StudentLevel: " + level);
	}

	public boolean equals(Undergraduate otherUndergraduate) 
	{ 
		return equals ((Student) otherUndergraduate) && (this.level == otherUndergraduate.level); 
	}
}

