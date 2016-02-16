package view;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * 接続画面(トップ画面)
 *
 * @author 22226
 *
 */
public class Connect extends Application {

	// コンストラクタ
	public Connect() {

	}

	// 画面作成
	public void create(String[] args){
		launch(args);
	}

	// スタート
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();
	}

}
