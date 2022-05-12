bpackage com.chainsys.unittest;

import com.chainsys.classandmethods.Movie;

public class MovieTester {
	public static void testMovie() {
		Movie firstMovie=new Movie("Beast");
		firstMovie.setTicketPrice(500);
		firstMovie.setHeroName("Vijay");
		firstMovie.setNoOfSongs(4);
		System.out.println(firstMovie.getMovieName());
		System.out.println(firstMovie.getTicketPrice());
		System.out.println(firstMovie.getHeroName());
		System.out.println(firstMovie.getNoOfSongs());
	}

}
