
public class Review01 {

    public static void main(String[] args) {
        // 税抜き価格と税率の宣言と初期化
        int beforeTax = 23000;
        double taxRate = 0.1;
        double tax = taxMethod(beforeTax, taxRate);
        
     // 課題文の出力
        System.out.print(beforeTax + "円の商品の税込み価格は" + (int)(beforeTax + tax) + "円（消費税は" + (int)tax +"円）です。");
        
    }
    
    public static double taxMethod(int beforeTax, double taxRate) {
        double tax = beforeTax * taxRate;
        return tax;
            
    }

}
