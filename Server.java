//******* Server program *******//

import java.io.*;
import java.net.*;

// Server class
class Server {
	public static void main(String[] args)
	{
		ServerSocket ss = null;
		int n=0; //client number or id
		try {
			ss = new ServerSocket(2241); // server listening on port 
			ss.setReuseAddress(true);

			// tp get client request infinitely
			while (true) {
				n++; // client number			
				Socket client = ss.accept(); // socket object for client requests
		        System.out.println("Client#" + n + " connected!"); // Displaying that new client is connected
		        ClientHandler ch = new ClientHandler(client,n);
				new Thread(ch).start(); // Thread to handle each client separately
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) {
				try {
					ss.close();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	//ClientHandler class
	private static class ClientHandler implements Runnable {
		private Socket cs;
		private int n;

		//Constructor
		public ClientHandler(Socket cs,int n)
		{
			this.cs = cs;
			this.n = n;
		}

		public void run()
		{
			PrintWriter pw = null;
			BufferedReader br = null;
			try {
				pw = new PrintWriter(cs.getOutputStream(), true); //to get the outputstream of client

				br = new BufferedReader(new InputStreamReader(cs.getInputStream()));//to get the inputstream of client

				String message;
				while ((message = br.readLine()) != null) {

				    if (message.equals("exit")) {
				    	System.out.printf("Client#%d left",n);
				    	break;
				    }
		
				    System.out.printf(" Client#%d: %s\n",n,message);
					pw.println(message);// to write the received message from client
					
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				try {
                    if (pw != null) {
                        pw.close();
                    }
                    if (br != null) {
                        br.close();
                        cs.close();//close client socket
                    }
                }
				catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
