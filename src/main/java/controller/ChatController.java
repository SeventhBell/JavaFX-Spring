package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import view.Connect;

/**
 * このプログラムの全体的なコントローラ。
 * エントリポイント。
 * @author 22226
 *
 */
public class ChatController {
	// エントリポイント
	public static void main(String[] args) {
		// springの初期化
		ApplicationContext context = new AnnotationConfigApplicationContext();
		
		// 接続画面 
		Connect connect = new Connect();
		connect.create(args);
	}
}
