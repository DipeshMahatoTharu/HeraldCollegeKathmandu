
public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] fruits = {"Red","Blue","Purple","Orange","Yellow"};
		
		String search = "Blue";
		
		boolean found = false;
		
		for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(search)) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
		
		
	}

}
}
