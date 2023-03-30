// ââèK31
public class Item {
	private String id;
	private String name;
	private int price;

	public Item() {
		this(null, null, -1);
	}

	public Item(String id, String name, int price) {
		setId(id);
		setName(name);
		setPrice(price);
	}

	public void setId(String id) {
		this.id = id;
		if (id == null) {
			this.id = "NO_ID";
		}
	}

	public String getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
		if (name == null) {
			this.name = "NO_NAME";
		}
	}

	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
		if (price < 0) {
			this.price = 0;
		}
	}

	public int getPrice() {
		return price;
	}

}
