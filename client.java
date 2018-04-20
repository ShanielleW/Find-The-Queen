import java.net.*;
import java.io.*;

class Person{
	
	
	protected int position;
	protected int points;
	
	
	Person(String name, String password){
		this.name=name;
		this.password=password;
	}
	
	public String getpassword(){
		return password;
	}
	
	public String getname(){
		return name;
	}
	
}

public class Spotter extends Person{
	
	public void pick(){
		System.out.println("Please enter the position you think the Queen is");
	}
	
}

public class Dealer extends Person{
	
	public void setPosition(int position){
		super.position=position;
	}
	
	public int getposition(){
		return position
	}
	
}







public class LogIn{
  /*private String uname1 = "dannyboi";
  private String uname2 = "matty7";
  private String upass1 = "dre@margh_shelled";
  private String upass2 = "win&win99";*/
  Pair<String , String> creden1 = new Pair<>("dannyboi","dre@margh_shelled");
  Pair<String , String> creden2 = new Pair<>("matty7","win&win99");

  public String getUsername(){
    if (uname == uname1 or uname == uname2){
      return uname;
    }
  }

  public String getPassword(){
    if (upass == upass1 or upass == upass2){
      return upass;
    }
  }
}
public class client{
  private static Socket socket;
  private static PrintWriter player;
  public static void main(String[] args){
    try{
      socket = new Socket ("localhost",7621);
      player = new PrintWriter(socket.getOutputStream(),true);
      connect = new LogIn();
    }catch(IOException e){
      System.out.println("Client could not connect to game. Please Try Again Later. Error: " + e.getMessage());
    }
  }
}
