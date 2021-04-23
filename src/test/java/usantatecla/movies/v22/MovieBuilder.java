package usantatecla.movies.v22;

import usantatecla.movies.v21.ChildrenPrice;
import usantatecla.movies.v21.Movie;
import usantatecla.movies.v21.NewReleasePrice;
import usantatecla.movies.v21.Price;
import usantatecla.movies.v21.RegularPrice;

public class MovieBuilder {

	private String title;
	
	private Price price;
	
	public MovieBuilder() {
		title = "movieName";
	}
	
	public MovieBuilder title(String title) {
		this.title = title;
		return this;
	}
	
	public MovieBuilder childrens() {
		this.price = new ChildrenPrice();
		return this;
	}
	
	public MovieBuilder regular() {
		this.price = new RegularPrice();
		return this;
	}
	
	public MovieBuilder newRelease() {
		this.price = new NewReleasePrice();
		return this;
	}
	
	public usantatecla.movies.v21.Movie build() {
		return new Movie(title, price);
	}
}