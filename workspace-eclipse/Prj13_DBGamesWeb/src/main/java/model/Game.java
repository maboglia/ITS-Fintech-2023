package model;

public class Game {

	private int id;
	private String game;
	private String genre;
	private String publisher;
	private String originalPlatform;
	private int year;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getOriginalPlatform() {
		return originalPlatform;
	}
	public void setOriginalPlatform(String originalPlatform) {
		this.originalPlatform = originalPlatform;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Game [id=");
		builder.append(id);
		builder.append(", game=");
		builder.append(game);
		builder.append(", genre=");
		builder.append(genre);
		builder.append(", publisher=");
		builder.append(publisher);
		builder.append(", originalPlatform=");
		builder.append(originalPlatform);
		builder.append(", year=");
		builder.append(year);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
