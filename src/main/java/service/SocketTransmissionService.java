package service;
/**
 * ソケットの送信を行うクラス。
 * @author 22226
 *
 */
interface SocketTransmissionService {

	/**
	 * @param host 接続先
	 * @param port 接続先ポート
	 * @return true 成功、 false 失敗
	 * @throws Exception
	 */
	public boolean createTransmissionSocket(String host, int port)throws Exception;
}
