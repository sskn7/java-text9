
public class switchbunn {

	public static void main(String[] args) {
		// Switch文
		//もし○○○と
		//××× が等しければ、
		//△△△と処理しなさい
		
		//if文と同じ意味として書ける
		int a = 1;
		if (a==0) {
			System.out.println("aは０に等しい");
		} else if (a==1) {
			System.out.println("aは１に等しい");
		}
		
		//Switch文
		int b = 1;
		switch (b) {
		case 0:
			System.out.println("bは０に等しい");
			break;
		case 1:
			System.out.println("bは１に等しい");
			break;
		} 
		
		int c = 5;
		switch (c) {
		case 0:
			System.out.println ("cは0に等しい");
			break;
		case 1:
		    System.out.println ("cは1に等しい");
		    break;
		    default:
		    	System.out.println("cは0でも1でもない");
		}
		
		//もしｄが赤の場合、赤組ですと表示
		//もしくはｄが白の場合、白組ですと表示
		String d = "赤";
		switch (d) {
		case "赤":
		System.out.println("赤組です");
		break;
		
		case "白":
		System.out.println("白組です");
		break;
		}
		
		//エラー文を追加
		String e = "青";
		switch (e) {
		case "赤":
		System.out.println("赤組です");
		break;
		
		case "白":
		System.out.println("白組です");
		break;
		
		default:
			System.out.println("エラーです");
			break;
		}

	}

}
