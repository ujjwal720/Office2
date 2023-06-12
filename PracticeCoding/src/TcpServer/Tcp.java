package TcpServer;

import java.io.*;
import java.net.*;

class TCPServer
{
    public static void main(String argv[]) throws Exception
    {
        String fromclient;
        String toclient;        

        ServerSocket Server = new ServerSocket (5000);
        System.out.println ("TCPServer Waiting for client on port 5000");

        while(true)
        {
            Socket connected = Server.accept();
            System.out.println( " THE CLIENT"+" "+
            connected.getInetAddress() +":"+connected.getPort()+" IS CONNECTED ");
          
            BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));  
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader (connected.getInputStream()));
                
            PrintWriter outToClient = new PrintWriter(connected.getOutputStream(),true);
          
            while ( true )
            {
                toclient = "OK";
                outToClient.println(toclient);
                connected.close();
                break;
            }
        }
    }
} 
