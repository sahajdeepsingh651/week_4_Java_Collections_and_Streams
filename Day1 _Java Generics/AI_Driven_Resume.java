package day1;
import java.util.*;
abstract class JobRole{
    protected String name;
    protected int score;
    JobRole(String name,int score){
        this.name = name;
        this.score = score;

    }
    abstract public void getname();
    abstract public void getscore();
}
class SoftwareEngineer extends JobRole{
SoftwareEngineer(String name,int score){
    super(name,score);

}
    public void getname(){
        System.out.println("software engineer name is "+ name);
    }
    public void getscore(){
        System.out.println("software engineer score is "+ score);
    }
}
class DataScientist extends JobRole{
    DataScientist(String name,int score){
        super(name,score);

    }
    public void getname(){
        System.out.println("DataScientist name is "+ name);
    }
    public void getscore(){
        System.out.println("DataScientist score is "+ score);
    }
}

class ProductManager extends JobRole{
    ProductManager(String name,int score){
        super(name,score);

    }
    public void getname(){
        System.out.println("ProductManager name is "+ name);
    }
    public void getscore(){
        System.out.println("ProductManager score is "+ score);
    }
}

class Resume<T extends JobRole>{//THIS CLASS CREATES LIST OF ONE TYPE RESUME
private List<T> Resumes = new ArrayList<>();
public void addResume(T resume){
    Resumes.add(resume);

}
public List<T> getAllResumes(){
    return Resumes;
}
}
class ResumeUtiles{
    public static void iterateResumes(List<? extends  JobRole> Resumes){
        for(JobRole jb: Resumes){
            jb.getname();
            jb.getscore();

        }
    }
}
public class AI_Driven_Resume {
    public static void main(String args[]){
        SoftwareEngineer Milan = new SoftwareEngineer("MILAN", 100);
        SoftwareEngineer Sahaj = new SoftwareEngineer("SAHAJ", 80);
        DataScientist Charly = new DataScientist("charly", 10);
        DataScientist parly = new DataScientist("parly", 10);
        ProductManager mi = new ProductManager("parly", 10);
        Resume<JobRole> SoftwareEngineerResume = new Resume<>();
        Resume<JobRole> DataScientistResume = new Resume<>();
        Resume<JobRole> ProductManagerResume = new Resume<>();
        SoftwareEngineerResume.addResume(Milan);
        SoftwareEngineerResume.addResume(Sahaj);
        DataScientistResume.addResume(Charly);
        DataScientistResume.addResume(parly);
        ProductManagerResume.addResume(mi);
        ResumeUtiles.iterateResumes(SoftwareEngineerResume.getAllResumes());

    }
}
