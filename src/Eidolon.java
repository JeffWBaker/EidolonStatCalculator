
public class Eidolon {
	private String name;
	private String type;
	private String grade;
	private int stars;
	private int level;
	private int[] stats;
	private int hp;
	private int atk;
	private int def;
	private int crit;
	private int eva;
	//
	//-------------------------Constructor-------------------------------------------
	//
	public Eidolon(String name, String type, String grade, int stars, int level, int hp, int atk, int def, int crit, int eva){
		this.name = name;
		this.type = type;
		this.grade = grade;
		this.stars = stars;
		this.level = level;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.crit = crit;
		this.eva = eva;
	}
	//
	//-------------------------Setters-------------------------------------------
	//
	public void setName(String x){
		name = x;
	}
	public void setType(String x){
		type = x;
	}
	public void setGrade(String x){
		grade = x;
	}
	public void setStars(int x){
		stars = x;
	}
	public void setLevel(int x){
		level = x;
	}
	public void setStats(int[] x){
		stats = x;
	}
	//
	//---------------------------getters--------------------------
	//
	public String getName(){
		return name;
	}
	public String getType(){
		return type;
	}
	public String getGrade(){
		return grade;
	}
	public int getStars(){
		return stars;
	}
	public int getLevel(){
		return level;
	}
	public int getHp(){
		return hp;
	}
	public int getAtk(){
		return atk;
	}
	public int getDef(){
		return def;
	}
	public int getCrit(){
		return crit;
	}
	public int getEva(){
		return eva;
	}
	//
	//-------------------------toString method-------------------------------------------
	//
	public String toString(){
		String str = "";
		str = "Name:\t" + name + "\tType:\t" + type + "\tGrade:\t" + grade + "\tStars:\t" + stars + "*\tLevel:\t"  + level + 
				"\nStats:\n\tHP:\t" + hp + 
							"\n\tATK:\t" + atk + 
							"\n\tDEF:\t" + def + 
							"\n\tCRIT:\t" + crit + 
							"\n\tEVA:\t" + eva + "\n\n";
									
			  
		return str;
	}

}
