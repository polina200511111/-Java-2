public class Decanat {
   
    private String nameFaculty;  // Название факультета
    private String room;         // Аудитория
    private int corps;           // Корпус
    private String telephone;    // Телефон
    private String nameDean;     // Фамилия декана
    
    
    public Decanat() {
        this.nameFaculty = "";
        this.room = "";
        this.corps = 0;
        this.telephone = "";
        this.nameDean = "";
    }
    
   
    public Decanat(String nameFaculty, String room, int corps, String telephone, String nameDean) {
        this.nameFaculty = nameFaculty;
        this.room = room;
        this.corps = corps;
        this.telephone = telephone;
        this.nameDean = nameDean;
    }
    
   
    public String getNameFaculty() {
        return nameFaculty;
    }
    
    public String getRoom() {
        return room;
    }
    
    public int getCorps() {
        return corps;
    }
    
    public String getTelephone() {
        return telephone;
    }
    
    public String getNameDean() {
        return nameDean;
    }
    
    
    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }
    
    public void setRoom(String room) {
        this.room = room;
    }
    
    public void setCorps(int corps) {
        this.corps = corps;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    public void setNameDean(String nameDean) {
        this.nameDean = nameDean;
    }
    
    
    @Override
    public String toString() {
        return "Деканат факультета '" + nameFaculty + "'\n" +
               "Декан: " + nameDean + "\n" +
               "Местоположение: корпус " + corps + ", аудитория " + room + "\n" +
               "Телефон: " + telephone;
    }
}