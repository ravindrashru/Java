package assisted;
import java.util.ArrayList;
import java.util.Scanner;

class BugFix {
	public static void main(String args[]) throws Exception {
		System.out.println("\n**************************************\n");
		System.out.println("\tWelcome to TheDesk \n");
		System.out.println("**************************************");
		BugFix.optionsSelection();

	}

	private static void optionsSelection() {
		String[] arr = { "1. I wish to review my expenditure", "2. I wish to add my expenditure",
				"3. I wish to delete my expenditure", "4. I wish to sort the expenditures",
				"5. I wish to search for a particular expenditure", "6. Close the application" };
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int slen = arr1.length;
		for (int i = 0; i < slen; i++) {
			System.out.println(arr[i]);
			// display the all the Strings mentioned in the String array
		}
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		ArrayList<Integer> expenses = new ArrayList<Integer>();
		expenses.add(1000);
		expenses.add(2300);
		expenses.add(45000);
		expenses.add(32000);
		expenses.add(110);
		expenses.addAll(arrlist);
		System.out.println("\nEnter your choice:\t");
		Scanner sc = new Scanner(System.in);
		int options = sc.nextInt();
		/*for (int j = 1; j <= slen; j++) {*/
			if (options <= slen) {
				switch (options) {
				case 1:
					System.out.println("Your saved expenses are listed below: \n");
					System.out.println(expenses + "\n");
					BugFix.optionsSelection();
					break;
				case 2:
					System.out.println("Enter the value to add your Expense: \n");
					int value = sc.nextInt();
					expenses.add(value);
					System.out.println("Your value is updated\n");
					expenses.addAll(arrlist);
					System.out.println(expenses + "\n");
					BugFix.optionsSelection();
					break;
				case 3:
					System.out.println(
							"You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
					int con_choice = sc.nextInt();
					if (con_choice == options) {
						expenses.clear();
						System.out.println(expenses + "\n");
						System.out.println("All your expenses are erased!\n");
					} else {
						System.out.println("Oops... try again!");
					}
					BugFix.optionsSelection();
					break;
				case 4:
					sortExpenses(expenses);
					BugFix.optionsSelection();
					break;
				case 5:
					searchExpenses(expenses);
					BugFix.optionsSelection();
					break;
				case 6:
					closeApp();
					break;
				
				}
			}
			else {
				System.out.println("You have made an invalid choice!..");
				
				
			}
			
			
		}
	

	private static void closeApp() {
		System.out.println("Closing your application... \nThank you!");
	}

	private static void searchExpenses(ArrayList<Integer> arrayList) {
		int leng = arrayList.size();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type the expenditure you are looking for!");
		int searchItem = sc.nextInt();
		int i = 0;
		Integer[] arr = new Integer[leng];
		arr = arrayList.toArray(arr);
		boolean isSearched = false;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == searchItem) {
				isSearched = true;
				break;
			}
		}

		if (isSearched) {
			System.out.println("Hurray! The expense you are searching is present at location " + i);
		} else {
			System.out.println("Sorry! The expense you are searching is not present");
		}

		// Complete the method
	}

	private static void sortExpenses(ArrayList<Integer> arrayList) {
		int arrlength = arrayList.size();
		Integer[] arr = new Integer[arrlength];
		arr = arrayList.toArray(arr);
		int size = arr.length;
		for (int i = 1; i < size; i++) {
			for (int j = 1; j < size; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}

		}
		System.out.println("Printing Expenses after sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		// Complete the method. The expenses should be sorted in ascending order.
	}
}