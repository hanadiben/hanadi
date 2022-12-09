package p2p_partier4;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class client2 {

		// TODO Auto-generated method stub
	static String myAdr ="127.0.0.1";
	static int numPort=7456;
	static int numPortS=1234;

	 public static void main(String[] args) {
		 System.out.println("Connection accepted ...");
		 System.out.println("client 2 is running ...");
		 int i=1;
		 while(i<10) {
		 try {
			 Socket s = new Socket("127.0.0.1", 7456);
			 ServerSocket ss = new ServerSocket(7456);
			 Socket sk = ss.accept();
			 InputStream is = s.getInputStream();
			 OutputStream os = s.getOutputStream();
			 System.out.println("Donnez un entier? ");
			 Scanner sc = new Scanner(System.in);
			 int A = sc.nextInt();
			 os.write(A);
			 os.close(); s.close();
			 
			 ServerSocket ss1 = new ServerSocket(1234);
				Socket s1 = ss1.accept();
		 		InputStream is1 = s1.getInputStream();
				System.out.println("je recois de serveur : " + is1.read());
				
				is1.close(); s1.close(); ss1.close();
				
				
			  } catch (Exception e) {
				  }
		 }
			 
	 }
}
