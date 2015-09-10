package jp.ac.hal;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Product {

	/*
	JAN(Japanese Article Number)コードは、日本の共通商品コードとして流通情報システムの重要な基盤となっています。
	JANコードはバーコード（JANシンボル）として商品などに表示され、
	POSシステムをはじめ、受発注システム、棚卸、在庫管理システムなどに利用されており、
	さらに公共料金等の支払システムへの利用など利用分野の拡大がみられます。
	JANコードは日本国内のみの呼称で、国際的にはEANコード(European Article Number)と呼称され、
	アメリカ、カナダにおけるUPC（Universal Product Code）と互換性のある国際的な共通商品コードです。
	JANコードには、標準タイプ（13桁）と短縮タイプ（8桁）の2つの種類があります。
	さらに、標準タイプには、最初の7桁がGS1事業者コード(JAN企業コード)となっているものと、
	9桁がGS1事業者コード(JAN企業コード)となっているものに分けられます。
	標準タイプ（13桁）は、GTIN-13、短縮タイプ（8桁）はGTIN-8と呼ばれることもあります。
	*/
	//商品名　商品名（カナ）　価格　メーカー名　カテゴリ　JANコード　原産国　横幅　縦幅 高さ　重さ　商品説明
	String name;
	String nameKana;
	int price;
	String maker;
	String category;
	String janCode;
	String madeIn;
	int x,y,z,weight;
	String detail;
	HashMap<String, String> map;
	int count = 0;
	int checkNum = 0;
	Random r = new Random();
	
	String categorys[] = {
			"ボールペン",
			"ボールペン替芯",
			"油性マーカー",
			"水性マーカー・サインペン",
			"筆ペン",
			"蛍光ペン",
			"ボードマーカー",
			"ホワイトボードイレーザー",
			"修正テープ",
			"修正ペン／修正液",
			"シャープペンシル／替芯",
			"鉛筆／色鉛筆",
			"鉛筆削り",
			"消しゴム",
			"画材",
			"書道用品",
			"万年筆",
			"ペンケース／筆箱",
			"その他筆記用具",
			"ふせん（付箋）",
			"ノート",
			"リングノート",
			"キャンパスノート",
			"メモ",
			"レポート用紙／集計用紙",
			"ルーズリーフ／バインダー",
			"下敷き",
			"接着テープ",
			"のり",
			"カッター",
			"はさみ",
			"クリップ",
			"インデックス／ラベル",
			"ホッチキス／ステープラー",
			"穴あけパンチ",
			"裁断機",
			"製本用品",
			"製図用品",
			"デスク収納",
			"デスクマット",
			"その他 文房具",
			"わけあり品",
			"定規／コンパス",
			"マグネット"
	};
	String[] madeIns = {"日本","アメリカ","中国","オーストラリア","ロシア","イタリア","ドイツ","フランス","イギリス","インド","タイ"};
	
	String[] makers = {
			"トラスコ中山",
			"アズワン",
			"ミドリ安全",
			"パナソニック",
			"キヤノン",
			"エプソン",
			"東芝",
			"ピーアンドジー",
			"キングジム",
			"スリーエム ジャパン",
			"エスコ",
			"プラス",
			"コクヨ",
			"ニチバン",
			"アスクル"
	};
	
	public Product(int count) {
		this.count = count;
		map = new HashMap<String, String>();
		map.put("トラスコ中山","1234567");
		map.put("アズワン","2234567");
		map.put("ミドリ安全","3234567");
		map.put("パナソニック","4234567");
		map.put("キヤノン","5234567");
		map.put("エプソン","6234567");
		map.put("東芝","7234567");
		map.put("ピーアンドジー","8234567");
		map.put("キングジム","9234567");
		map.put("スリーエム ジャパン","1456789");
		map.put("エスコ","1134555");
		map.put("プラス","2252267");
		map.put("コクヨ","8434567");
		map.put("ニチバン","9934567");
		map.put("アスクル","1934567");
		
		setCategory();
		setName();
		setPrice();
		setX();
		setY();
		setZ();
		setWeight();
		setMaker();
		setMadeIn();
		setJanCode();
		setDetail();
	}
	
	public String getName() {
		return name;
	}

	public void setName() {
		this.name = "サンプル"  + count;
		setNameKana(name);
		this.name = name + category;
	}

	public String getNameKana() {
		return nameKana;
	}

	public void setNameKana(String nameKana) {
		this.nameKana = nameKana;
	}

	public void setPrice() {
		int i = r.nextInt(99) + 1;
		this.price = i * 100;
	}
	
	public int getPrice() {
		return price;
	}

	public String getMaker() {
		return maker;
	}
	
	public void setMaker() {
		maker = makers[r.nextInt(makers.length)];
	}
	public void setCategory() {
		category = categorys[r.nextInt(categorys.length)];
	}
	
	public String getCategory() {
		return category;
	}

	public String getJanCode() {
		return janCode;
	}

	public void setJanCode() {
		this.janCode = map.get(maker)+ count + checkNum;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public void setMadeIn() {
		this.madeIn = madeIns[r.nextInt(madeIns.length)];
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}
	public int getWeight() {
		return weight;
	}

	public void setX() {
		this.x = r.nextInt(99) + 1;
	}
	
	public void setY() {
		this.y = r.nextInt(99) + 1;
	}
	
	public void setZ() {
		this.z = r.nextInt(99) + 1;
	}
	
	public void setWeight() {
		this.weight = r.nextInt(99) + 1;
	}

	public String getDetail() {
		setDetail();
		return detail;
	}

	public void setDetail() {
		this.detail = name + "は、横幅が"+ x + "、縦幅が" + y + "、高さが" + z + "、重さが" + weight + "の" + category + "です。"
				+ "製造元が" + maker + "。"+"価格が"+price + "円です。原産国は"+madeIn;
	}
	
	public String csvProduct() {
		//"商品名,商品名カナ,価格,メーカー名,カテゴリ,原産国,横幅,縦幅,高さ,重さ,商品説明,JANコード"
		StringBuffer sb = new StringBuffer();
		sb.append(getName());
		sb.append(",");
		sb.append(getNameKana());
		sb.append(",");
		sb.append(getPrice());
		sb.append(",");
		sb.append(getMaker());
		sb.append(",");
		sb.append(getCategory());
		sb.append(",");
		sb.append(getMadeIn());
		sb.append(",");
		sb.append(getX());
		sb.append(",");
		sb.append(getY());
		sb.append(",");
		sb.append(getZ());
		sb.append(",");
		sb.append(getWeight());
		sb.append(",");
		sb.append(getDetail());
		sb.append(",");
		sb.append(getJanCode());		
		return sb.toString();
	}
}
