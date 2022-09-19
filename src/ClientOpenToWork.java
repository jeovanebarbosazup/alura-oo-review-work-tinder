import java.util.ArrayList;
import java.util.List;

public class ClientOpenToWork extends Client {

    private List<String> workExperiences = new ArrayList<>();
    private List<String> educationList = new ArrayList<>();

    public ClientOpenToWork(){}

    public ClientOpenToWork(String username, String password){
        super(username, password);
    }

    @Override
    public boolean register(List<Client> clientList, String username, String password) {
        boolean canCreate = Client.checkAvaliability(clientList, username);
        if (canCreate) {
            System.out.println("Executed OpenToWork method.");
            Client newClient = new ClientOpenToWork(username, password);
            Client.CLIENTCOUNT ++;
            clientList.add(newClient);
            return true;
        }
        return false;
    }

    public void addEducation(String educationDescription){
        educationList.add(educationDescription);
    }

    public void addWorkExperience(String workExperienceDescription){
        workExperiences.add(workExperienceDescription);
    }

    public void showCurriculum(){
        for(String workExperience : workExperiences) System.out.println(workExperience);
        for(String education : educationList) System.out.println(education);
    }



}
