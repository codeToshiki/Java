package test.main;

public class NetworkReader extends TextReader{
	void open(String name) {
		System.out.println("ファイルをopenしました");
	}

	void close() {
		System.out.println("ファイルをcloseしました");
	}

	//1文字読み込む
	public char read() {
		// 処理
		return 0;
	}
}