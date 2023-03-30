public class Sample31 {

	public static void main(String[] args) {
		Category category = new Category("SPORTS_BASEBALL", "野球用品");

		Item[] items = new Item[3];
		items[0] = new Item("XB4862", "金属バット", 21000);
		items[1] = null;
		items[2] = new Item("2H-3Z", "硬式ボール", 399);

		// ▲ここより上は修正しないでください▲
                
		for (Item item : items) {
		
		  try {
			category.setItem(item);
		  }
		  catch (NullItemException e) {
		    System.out.println("nullのItemオブジェクトがリストに追加されました。");
		  }
		}

		// ▼ここより下は修正しないでください▼

		for (Item item : category.getItems()) {
			System.out.println(item.getName());
		}
	}
}
