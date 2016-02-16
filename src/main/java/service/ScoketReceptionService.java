package service;
/**
 * ソケットの受信を行うサービスインターフェース。
 * @author 22226
 *
 */
interface ScoketReceptionService {

	/**
	 * 受信用ソケットを作成し、受信を待機する。
	 * @param port
	 * @return true 成功、false 失敗
	 * @throws Exception
	 */
	public boolean createReceptionScoket(int port)throws Exception;
}
