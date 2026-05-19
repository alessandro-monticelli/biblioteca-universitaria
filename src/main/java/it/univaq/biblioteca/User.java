//package...
public class User {
    //controllare istanze se uguali al prof, aggiustare type e student..
    private String name;
    private String surname;
    private String email;
    private long id; //meglio farlo intero(numerico), piu agile un po come le matricole
   /* private String student;
    private String professor; 
    private String librarian;
    raggruppare in type 
*/ 
    private String type; 
    private String birthDate;
    private boolean bioGender; //masci sono true e donne false
    private String gender; 
    private String mobileNumber; //non numerico perche numeri che iniiano per zero me li perderei 
    private String phoneNumber; //numero fisso , can be shareD AMONG FAMILY 
    private float budget; 
    private short feePlan;
    private short creditScore; // e uguale per i membri della famiglia 
    private String taxCode; //codice fiscale  

/* public User(String name, String surname, String email, long id, String student, String professor, String librarian){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.id = id;
        this.student = student;
        this.professor = professor;
        this.librarian = librarian;
    }
    //get e setter
    public String getName
    public String getSurname
  
    public String getEmail
    public long getId
    public String getStudent
    public String getProfessor
    public String getLibrarian
    */
    
}
