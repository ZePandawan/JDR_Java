public static final Experience getPlayerXPLevel(Player player) {
		new Experience(player);
		}

public class Experience {
	private int xp = 0;
	private int level = 1;
	private Player player;

	public Experience(Player player) {
		this.player = player;
	}

	public int getxp() {
		return xp;
	}

	public int getLevel() {
		return level;
	}

	public void addXP(int xpToAdd) {
		xp += xpToAdd;

		int experiencelevelup = ExperienceNecessaire(level);
		while (xp >= experiencelevelup) {
			level += 1;
			xp -= experiencelevelup;
			System.out.println("Gain de niveau ! Tu passes niveau: " + level);
		}
	}

	public static int ExperienceNecessaire(int level) {
		return 50 + level * 100;
	}
}