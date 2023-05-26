import java.util.Scanner;
class MainDriver{
	private static CrudOperation crud;
	private static Scanner sc = new Scanner(System.in);
	private static boolean data = true;
	private static boolean data1 = true;
	public static void main(String[] args) {
		do{
			System.out.println("please enter your choice :");
			System.out.println("--------------------------");
			System.out.println("1.developer");
			System.out.println("2.Tester");
			System.out.println("3.manager");
			System.out.println("4.trainer");
			System.out.println("5.exit");
			int choice = sc.nextInt();
			switch(choice){
				case 1 : {
					do{
						System.out.println("choice is developer");
						System.out.println("--------------------------");
						System.out.println("1.create");
						System.out.println("2.read");
						System.out.println("3.update");
						System.out.println("4.delete");
						System.out.println("5.exit");
						int option1 = sc.nextInt();
						switch(option1){
							case 1 : {
								crud = new CrudOperation();
								System.out.println("create operation performed successfully");
							}
							break;
							case 2 : {
								System.out.println("read operation performed successfully");
								System.out.println("-------------------------------------");
								System.out.println("crudoperation id is : "+crud.getId());
								System.out.println("crudoperation name is : "+crud.getName());
							}
							break;
							case 3 : {
								System.out.println("update the id");
								int id = sc.nextInt();
								crud.setId(id);
								System.out.println("update the name");
								String name = sc.next();
								crud.setName(name);
							}
							break;
							case 4 : {
								crud = null;
								System.out.println("delete operation performed successfully");
							}
							break;
							case 5 : {
								data1 = false;
								System.out.println("thank you! visit again");
							}
							break;
							default : {
								System.out.println("invalid data please enter the correct data");
							}
						}
					}while(data1);
				}
				break;
				case 2 : {
					do{
						System.out.println("choice is Tester");
						System.out.println("--------------------------");
						System.out.println("1.create");
						System.out.println("2.read");
						System.out.println("3.update");
						System.out.println("4.delete");
						System.out.println("5.exit");
						int option2 = sc.nextInt();
						switch(option2){
							case 1 : {
								crud = new CrudOperation();
								System.out.println("create operation performed successfully");
							}
							break;
							case 2 : {
								System.out.println("read operation performed successfully");
								System.out.println("-------------------------------------");
								System.out.println("crudoperation id is : "+crud.getId());
								System.out.println("crudoperation name is : "+crud.getName());
							}
							break;
							case 3 : {
								System.out.println("update the id");
								int id = sc.nextInt();
								crud.setId(id);
								System.out.println("update the name");
								String name = sc.next();
								crud.setName(name);
							}
							break;
							case 4 : {
								crud = null;
								System.out.println("delete operation performed successfully");
							}
							break;
							case 5 : {
								data1 = false;
								System.out.println("thank you! visit again");
							}
							break;
							default : {
								System.out.println("invalid data please enter the correct data");
							}
							break;
						}
					}while(data1);
				}
				break;
				case 3 : {
					do{
						System.out.println("choice is manager");
						System.out.println("--------------------------");
						System.out.println("1.create");
						System.out.println("2.read");
						System.out.println("3.update");
						System.out.println("4.delete");
						System.out.println("5.exit");
						int option3 = sc.nextInt();
						switch(option3){
							case 1 : {
								crud = new CrudOperation();
								System.out.println("create operation performed successfully");
							}
							break;
							case 2 : {
								System.out.println("read operation performed successfully");
								System.out.println("-------------------------------------");
								System.out.println("crudoperation id is : "+crud.getId());
								System.out.println("crudoperation name is : "+crud.getName());
							}
							break;
							case 3 : {
								System.out.println("update the id");
								int id = sc.nextInt();
								crud.setId(id);
								System.out.println("update the name");
								String name = sc.next();
								crud.setName(name);
							}
							break;
							case 4 : {
								crud = null;
								System.out.println("delete operation performed successfully");
							}
							break;
							case 5 : {
								data1 = false;
								System.out.println("thank you! visit again");
							}
							break;
							default : {
								System.out.println("invalid data please enter the correct data");
							}
							break;
						}
					}while(data1);
				}
				break;
				case 4 : {
					do{
						System.out.println("choice is Trainer");
						System.out.println("--------------------------");
						System.out.println("1.create");
						System.out.println("2.read");
						System.out.println("3.update");
						System.out.println("4.delete");
						System.out.println("5.exit");
						int option4 = sc.nextInt();
						switch(option4){
							case 1 : {
								crud = new CrudOperation();
								System.out.println("create operation performed successfully");
							}
							break;
							case 2 : {
								System.out.println("read operation performed successfully");
								System.out.println("-------------------------------------");
								System.out.println("crudoperation id is : "+crud.getId());
								System.out.println("crudoperation name is : "+crud.getName());
							}
							break;
							case 3 : {
								System.out.println("update the id");
								int id = sc.nextInt();
								crud.setId(id);
								System.out.println("update the name");
								String name = sc.next();
								crud.setName(name);
							}
							break;
							case 4 : {
								crud = null;
								System.out.println("delete operation performed successfully");
							}
							break;
							case 5 : {
								data1 = false;
								System.out.println("thank you! visit again");
							}
							break;
							default : {
								System.out.println("invalid data please enter the correct data");
							}
							break;
						}
					}while(data1);
				}
				break;
				case 5 : {
					data = false;
					System.out.println("thank you! bye vist again");
				}
				break;
				default : {
					System.out.println("invalid choice");
				}
			}
		}while(data);

	}
}