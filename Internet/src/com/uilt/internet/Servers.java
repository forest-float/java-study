package com.uilt.internet;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servers {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		ServerSocket server = new ServerSocket(9999);
		boolean flag = true;
		while(flag) {
			Socket client = server.accept();
			new Thread(new EchoThread(client)).start();
		}
	}

}

class EchoThread implements Runnable{

	public Socket client;
	
	public EchoThread(Socket client) {
		super();
		this.client = client;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		try {
			Scanner sacn = new Scanner(client.getInputStream());
			PrintStream out = new PrintStream(client.getOutputStream());
			boolean flag = true;
			while(flag) {
				if(sacn.hasNext()) {
					String str = sacn.next().trim();
					if(str.equalsIgnoreCase("byebye")) {
						out.println("拜拜，下次见");
						flag = false;
					}
				}
			}
			sacn.close();
			out.close();
			client.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
	
}