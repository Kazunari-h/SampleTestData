package jp.ac.hal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
    	HashMap<String,String> map = new HashMap<String,String>();
    	map.put("", "");
    	
   
    	for (int i = 0; i < 20000; i++) {
			
		}

        
        //各メソッドの作成。
        //各データの組み合わせ
        //重複データの排除
        //CSVで吐き出し
        
		// 書き込み先
		String writePath = "/Users/hirosawak/Desktop/testdata.csv";
		try {
			// 出力先設定			
			FileWriter fw = new FileWriter(writePath);
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			pw.println("商品名,商品名カナ,価格,メーカー名,カテゴリ,原産国,横幅,縦幅,高さ,重さ,商品説明,JANコード");
			for (int i = 0; i < 20000; i++) {
				Product p = new Product(i);
				System.out.println(p.csvProduct());
				pw.println(p.csvProduct());
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
    }
}
