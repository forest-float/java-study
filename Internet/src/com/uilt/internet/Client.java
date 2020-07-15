package com.uilt.internet;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO 自动生成的方法存根
		Socket client = new Socket("localhost", 9999);
		Scanner input = new Scanner(System.in);
		Scanner scan = new Scanner(client.getInputStream());
		PrintStream out = new PrintStream(client.getOutputStream());
		input.useDelimiter("\n");
		scan.useDelimiter("\n");
		boolean flag = true;
		while(flag) {
			System.out.print("input:");
			if(input.hasNext()) {
				String str = input.next().trim();
				out.println(str);
				if(str.equalsIgnoreCase("byebye")) {
					flag = false;
				}
				if(scan.hasNext()) {
					System.out.println(scan.next());
				}
			}
		}
		input.close();
		scan.close();
		client.close();
		out.close();
	}

}
