package com.chainsys.classandmethods;

public class Movie {
	private String MovieName;
	private int TicketPrice;
	private String HeroName;
	private int NoOfSongs;
	public Movie(String Name) {
		this.MovieName=Name;
	}
	
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName=movieName;
	}
	public int getTicketPrice() {
		return TicketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		TicketPrice = ticketPrice;
	}
	public String getHeroName() {
		return HeroName;
	}
	public void setHeroName(String heroName) {
		HeroName = heroName;
	}
	public int getNoOfSongs() {
		return NoOfSongs;
	}
	public void setNoOfSongs(int noOfSongs) {
		NoOfSongs = noOfSongs;
	}

}
