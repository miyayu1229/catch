public class Sample31 {

	public static void main(String[] args) {
		Category category = new Category("SPORTS_BASEBALL", "�싅�p�i");

		Item[] items = new Item[3];
		items[0] = new Item("XB4862", "�����o�b�g", 21000);
		items[1] = null;
		items[2] = new Item("2H-3Z", "�d���{�[��", 399);

		// ����������͏C�����Ȃ��ł���������
                
		for (Item item : items) {
		
		  try {
			category.setItem(item);
		  }
		  catch (NullItemException e) {
		    System.out.println("null��Item�I�u�W�F�N�g�����X�g�ɒǉ�����܂����B");
		  }
		}

		// ��������艺�͏C�����Ȃ��ł���������

		for (Item item : category.getItems()) {
			System.out.println(item.getName());
		}
	}
}
