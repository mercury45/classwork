package ru.kpfu.itis.group302.players;

public class EasyBot extends Bot {
	private int damage = 2;

	public EasyBot(int hp){
		super(hp);
	}

	public boolean attack(AbstractPlayer enemy){
		return this.attack(enemy, damage);
	}
}