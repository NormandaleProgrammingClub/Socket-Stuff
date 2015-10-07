//This is Ben's Exmple for a Server
//Just an example

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import Card.java;
import Deck.java;
import java.util.*;


public class GameHost
{
  public static void main(String[] args) throws IOException
  {
      ServerSocket listener = new ServerSocket(3399);
      try
      {
          while (true)
          {
              Socket socket = listener.accept();
              try
              {
                PrintWriter out =
                  new PrintWriter(socket.getOutputStream(), true);
                out.println("Hello");
              }
              finally
              {
                socket.close();
              }
          }
      }
      finally{listener.close();}
      
  }
}
              

