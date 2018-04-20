import java.io.*;
import java.net.*;

class server{
  public static void main(String[] args){
      ServerSocket server = null;
      try{
        ServerSocket server = new ServerSocket(7621);

      }catch(IOException e){
        System.err.println("Port 7621 is current Uunavailable. Please try making connection later " + e.getMessage());
        System.exit(-1);
      }
      Socket player1 = null;
      Socket player2 = null;

      try{
        player1 = server.accept();
      }catch(IOException e){
        System.err.println("Player 1 could not connect to game. Error: " + e.getMessage());
        System.exit(-1);
      }

      try{
        player2 = server.accept();
      }catch(IOException e){
        System.err.println("Player 2 could not connect to game. Error: " + e.getMessage());
        System.exit(-1);
      }
      BufferedReader dealerIn = null;
      BufferedReader spotterIn = null;
      PrintWriter dealerOut = null;
      PrintWriter spotterOut = null;

      try{
        dealerIn = new BufferedReader(new InputStreamReader(player1.getInputStream()));
        spotterIn = new BufferedReader(new InputStreamReader(player2.getInputStream()));

        dealerOut = new PrintWriter(player1.getOutputStream(),true);
        spotterOut = new PrintWriter(player2.getOutputStream(),true);

        dealerOut.println("You are the dealer for this round");
        spotterOut.println("You are the spotter for this round");
      }catch(IOException e){

      }
  }
}
