//******* Client program *******//

import java.io.*;
import java.net.*;
import java.util.*;

// Client class
class Client {
	public static void main(String[] args)
	{
		try (Socket socket = new Socket("localhost", 2241)) // establish a connection
		{
			PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);//to write to server			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));// to read from server

			Scanner sc = new Scanner(System.in);
			String message = null;

			while (!"exit".equals(message)) {
				message = sc.nextLine();// reading from user
				pw.println(message);// sending the user input to server
				pw.flush();
				System.out.println("Server: "+ br.readLine());// Reply from server
			}
			pw.close();
			br.close();
			sc.close();
			socket.close();//close socket
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
