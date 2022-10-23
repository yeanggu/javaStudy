package server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		DatagramSocket receiver = new DatagramSocket(40000);
		System.out.println("수신 시작");
		//비어있는 datagrampacket 생성
		byte b[] = new byte[100];
		DatagramPacket data = new DatagramPacket(b,b.length);
		receiver.receive(data);
		b = data.getData();
		String receivedata = new String(b);
		System.out.println(receivedata+"내용을 "+data.getAddress());
		
		
		System.out.println("수신 종료");
		receiver.close();

	}

}
