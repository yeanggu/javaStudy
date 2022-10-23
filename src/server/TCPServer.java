package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {//클라이언트보다 먼저, 항상 실행중, 여러개 클라이언트 처리

	public static void main(String[] args) {
		//1. 서버시작 = ServerSocket생성
		try {
		ServerSocket ss = new ServerSocket(50000);
		System.out.println("[==서버 : 50000 포트에서 시작==]");
		while(true) {
		Socket s = ss.accept();
		System.out.println("[==서버 : "+s.getInetAddress().getHostAddress()+"클라이언트와 연결==]");
		
		//System.out.println("요청 응답 반복 가능");
		InputStream is = s.getInputStream();
		Scanner sc = new Scanner(is);
		System.out.println("[==서버 : 클라이언트로부터 받은 인사말==]"+sc.nextLine());//\n 나오면 한줄 인식
		
		OutputStream o = s.getOutputStream();
		PrintStream p = new PrintStream(o);
		p.print(" 클라이언트님도 안녕하신가요? \n"); 
		p.flush();
		
		
		
		s.close();
		System.out.println("[==서버 : 클라이언트와 연결 해제==]");
//			if(true/*서버종료조건*/) {
//				ss.close();
//				System.out.println("[==서버 : 종료==]");
//			}		
		}
		
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
