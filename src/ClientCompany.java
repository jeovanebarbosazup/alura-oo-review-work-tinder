import java.util.ArrayList;
import java.util.List;

public class ClientCompany extends Client {

    private List<String> jobOpennings = new ArrayList<>();

    public ClientCompany(){}
    public ClientCompany(String username, String password){
        super(username, password);
    }

    @Override
    public boolean register(List<Client> clientList, String username, String password) {
        boolean canCreate = Client.checkAvaliability(clientList, username);
        if (canCreate) {
            System.out.println("Executed Company method");
            Client newClient = new ClientCompany(username, password);
            Client.CLIENTCOUNT ++;
            clientList.add(newClient);
            return true;
        }
        return false;
    }

    public void addJob(String jobDescription){
        jobOpennings.add(jobDescription);
    }

    public void listOportunities(){
        for (String job : jobOpennings) System.out.println(job);
    }
}



