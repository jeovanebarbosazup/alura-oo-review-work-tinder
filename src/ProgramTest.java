import java.util.ArrayList;
import java.util.List;

public class ProgramTest {
    public static void main(String[] args) {
    Client cl1 = new ClientOpenToWork();
    Client cl2 = new ClientCompany();
    Client cl3 = new ClientCompany();
    ClientOpenToWork cl4;
    ClientCompany cl5;

    List<Client> clientList = new ArrayList<>();

    cl1.register(clientList,"jeo","1234");
    cl2.register(clientList,"ada","1234");
    cl3.register(clientList,"ada","1234");
    System.out.println();

    System.out.println(clientList);
    Client.showClientCount();
    System.out.println();

    cl4 = (ClientOpenToWork) cl1.logIn(clientList, "jeo","1234");
    System.out.println(cl4);
    System.out.println();

    cl4.addEducation("ZupEdu");
    cl4.addWorkExperience("Ios Development ZCoders.");
    cl4.showCurriculum();
    System.out.println();

    cl5 = (ClientCompany) cl2.logIn(clientList, "ada","1234");
    System.out.println(cl5);
    System.out.println();

    cl5.addJob("Zcoders: BEST IOS development program in history.");
    cl5.listOportunities();



    }
}
