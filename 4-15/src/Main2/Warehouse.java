package Main2;

public class Warehouse<T> {
        // TODO: 商品を格納するフィールドを作成
        private T item;
    
        // TODO: 商品を格納するメソッド
        public void store(T items) {
            // TODO: itemを設定し、"商品追加: [商品名]" を表示
            this.item = items;
            System.out.println("商品追加: " + "[" + this.item + "]");
        }
        
        // TODO: 商品を取り出すメソッド
        public T retrieve() {
            T nowItem = this.item;
            this.item = null;
            System.out.println("取り出し: [" + nowItem + "]");
            return nowItem;
        }
        
        // TODO: 倉庫が空かどうかをチェックするメソッド
        public boolean isEmpty() {
            // TODO: itemがnullならtrue、そうでなければfalseを返す
            if(this.item == null){
                return true;
            }
            return false;
        }
}
