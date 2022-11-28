package task2;

public class Main {

	public static void main(String [] args) {
		
		CompositeOlympicsTeam teams = new CompositeOlympicsTeam("Olympics 2024 Teams");
		
		CompositeOlympicsTeam asia = new CompositeOlympicsTeam("Asia");
		SubTeam africa = new SubTeam("Africa",0,0);
		CompositeOlympicsTeam europe = new CompositeOlympicsTeam("Europe");
		SubTeam southAmerica = new SubTeam("South America",0,0);
		
		CompositeOlympicsTeam china = new CompositeOlympicsTeam("China");
		SubTeam afghanistan = new SubTeam("Afghanistan",0,0);
		CompositeOlympicsTeam germany = new CompositeOlympicsTeam("Germany");
		CompositeOlympicsTeam italy = new CompositeOlympicsTeam("Italy");
		
		CompositeOlympicsTeam chinaWomen = new CompositeOlympicsTeam("Women's Team");
		CompositeOlympicsTeam chinaMen = new CompositeOlympicsTeam("Men's Team");
		CompositeOlympicsTeam germanyWomen = new CompositeOlympicsTeam("Women's Team");
		CompositeOlympicsTeam germanyMen = new CompositeOlympicsTeam("Men's Team");
		CompositeOlympicsTeam italyWomen = new CompositeOlympicsTeam("Women's Team");
		CompositeOlympicsTeam italyMen = new CompositeOlympicsTeam("Men's Team");
		
		SubTeam taekwando = new SubTeam("Taekwando",4,2);
		SubTeam waterpolo = new SubTeam("Waterpolo",1,0);
		SubTeam artGym = new SubTeam("Artistic Gymnastics",3,1);
		SubTeam shoot = new SubTeam("Shooting",6,0);
		SubTeam cycle = new SubTeam("Cycling",5,1);
		SubTeam tennis = new SubTeam("Tennis",4,0);
		SubTeam tableTennis = new SubTeam("Table Tennis",8,4);
		SubTeam football = new SubTeam("Football",11,0);
		SubTeam alpineSki = new SubTeam("Alpine Ski",7,2);
		SubTeam footbal = new SubTeam("Football",11,1);
		SubTeam swim = new SubTeam("Swimming Team",12,3);
		
		italyMen.add(swim);
		italyMen.add(footbal);
		italyWomen.add(alpineSki);
		italy.add(italyMen);
		italy.add(italyWomen);
		
		germanyMen.add(football);
		germanyMen.add(tableTennis);
		germanyWomen.add(tennis);
		germanyWomen.add(cycle);
		germany.add(germanyMen);
		germany.add(germanyWomen);
		
		chinaMen.add(shoot);
		chinaWomen.add(artGym);
		chinaWomen.add(waterpolo);
		chinaWomen.add(taekwando);
		china.add(chinaMen);
		china.add(chinaWomen);

		asia.add(china);
		asia.add(afghanistan);
		europe.add(germany);
		europe.add(italy);
		
		teams.add(asia);
		teams.add(africa);
		teams.add(southAmerica);
		teams.add(europe);
		
		TreeSearcher searcher = new TreeSearcher();
		
		//4.1
//		searcher.getNumberOfAthletes(germanyMen);
		
		//4.2
//		searcher.getNumberOfAthletes(germany);
		
		//4.3
//		searcher.getNumberOfGoldMedals(asia);
		
		//4.4
		searcher.getNumberOfAthletes(teams);
//		
	}
}
