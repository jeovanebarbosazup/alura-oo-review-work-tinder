import java.util.List;

public abstract class Client {
    private static int userCount = 0;

    protected String username;
    protected String password;
    protected boolean logStatus;
    public static int CLIENTCOUNT = 0;


    public Client(){}

    public Client(String username, String password){
        this.username = username;
        this.password = password;
        this.logStatus = false;
    }

    public static boolean checkAvaliability (List<Client> clientList, String username){
        for (Client client : clientList){
            if (client.username.equals(username)){
                System.out.println("User already exists");
                return false;
            }
        }
        System.out.println("Username avaliable");
        return true;
    }

    public abstract boolean register (List<Client> clientList, String username, String password);

    public Client logIn (List<Client> clientList, String username, String password){
        for (Client client : clientList){
            if((client.username.equals(username)) && (client.password.equals(password))){
                System.out.println("Login successfull, " + client.username);
                client.logStatus = true;
                return client;
            }
        }
        System.out.println("Login failed");
        return null;
    }

    public void logOut(){
        this.logStatus = false;
    }

    public static void showClientCount(){
        System.out.println("Total of registered clients: " + CLIENTCOUNT);
    }

    @Override
    public String toString() {
        return  "{username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", logstatus='" + logStatus + '\'' +
                '}';
    }


}

