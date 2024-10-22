import java.util.Scanner;

class Player {
    String name;
    int age;
    String gameName;
    int noOfGamesPlayed;
    String address;

    Player(String name, int age, String gameName, int noOfGamesPlayed, String address) {
        this.name = name;
        this.age = age;
        this.gameName = gameName;
        this.noOfGamesPlayed = noOfGamesPlayed;
        this.address = address;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Game Name: " + gameName);
        System.out.println("Number of Games Played: " + noOfGamesPlayed);
        System.out.println("Address: " + address);
    }
}

class Cricket_player extends Player {

    Cricket_player(String name, int age, String gameName, int noOfGamesPlayed, String address) {
        super(name, age, gameName, noOfGamesPlayed, address);
    }


    void display() {
        super.display();
        System.out.println("Sport: Cricket");
    }
}

class Football_player extends Player {

    Football_player(String name, int age, String gameName, int noOfGamesPlayed, String address) {
        super(name, age, gameName, noOfGamesPlayed, address);
    }

 
    void display() {
        super.display();
        System.out.println("Sport: Football");
    }
}

class Hockey_player extends Player {

    Hockey_player(String name, int age, String gameName, int noOfGamesPlayed, String address) {
        super(name, age, gameName, noOfGamesPlayed, address);
    }

 
    void display() {
        super.display();
        System.out.println("Sport: Hockey");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input for a Cricket player
        System.out.println("Enter details for a Cricket Player:");
        System.out.print("Name: ");
        String cricketName = sc.nextLine();
        System.out.print("Age: ");
        int cricketAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Game Name: ");
        String cricketGameName = sc.nextLine();
        System.out.print("Number of Games Played: ");
        int cricketNoOfGamesPlayed = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Address: ");
        String cricketAddress = sc.nextLine();

        Cricket_player cricketer = new Cricket_player(cricketName, cricketAge, cricketGameName, cricketNoOfGamesPlayed, cricketAddress);

        // Get input for a Football player
        System.out.println("\nEnter details for a Football Player:");
        System.out.print("Name: ");
        String footballName = sc.nextLine();
        System.out.print("Age: ");
        int footballAge = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Game Name: ");
        String footballGameName = sc.nextLine();
        System.out.print("Number of Games Played: ");
        int footballNoOfGamesPlayed = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Address: ");
        String footballAddress = sc.nextLine();

        Football_player footballer = new Football_player(footballName, footballAge, footballGameName, footballNoOfGamesPlayed, footballAddress);

        // Get input for a Hockey player
        System.out.println("\nEnter details for a Hockey Player:");
        System.out.print("Name: ");
        String hockeyName = sc.nextLine();
        System.out.print("Age: ");
        int hockeyAge = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Game Name: ");
        String hockeyGameName = sc.nextLine();
        System.out.print("Number of Games Played: ");
        int hockeyNoOfGamesPlayed = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Address: ");
        String hockeyAddress = sc.nextLine();

        Hockey_player hockeyPlayer = new Hockey_player(hockeyName, hockeyAge, hockeyGameName, hockeyNoOfGamesPlayed, hockeyAddress);

        // Display the player details
        System.out.println("\nCricket Player Details:");
        cricketer.display();

        System.out.println("\nFootball Player Details:");
        footballer.display();

        System.out.println("\nHockey Player Details:");
        hockeyPlayer.display();
    }
}
