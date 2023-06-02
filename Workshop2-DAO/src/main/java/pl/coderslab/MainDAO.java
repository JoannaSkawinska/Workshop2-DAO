package pl.coderslab;

public class MainDAO {
    public static void main(String[] args) {

        UserDAO usersDAO = new UserDAO();
        

        User[] all = usersDAO.findAll();

        for (User u : all) {

            System.out.println(u);

        }


    }
}
