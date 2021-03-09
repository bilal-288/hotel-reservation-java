
package hostalreservation1.logic;

import java.io.Serializable;

public class ReservedVacencyClass implements Serializable
{
  public String fname,lname,Age,Address,num,cnic,Religion,Nationality,Gander;

    public ReservedVacencyClass(String fname, String lname, String Age, String Address, String num, String cnic, String Religion, String Nationality, String Gander) {
        this.fname = fname;
        this.lname = lname;
        this.Age = Age;
        this.Address = Address;
        this.num = num;
        this.cnic = cnic;
        this.Religion = Religion;
        this.Nationality = Nationality;
        this.Gander = Gander;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getReligion() {
        return Religion;
    }

    public void setReligion(String Religion) {
        this.Religion = Religion;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public String getGander() {
        return Gander;
    }

    public void setGander(String Gander) {
        this.Gander = Gander;
    }
  
   
}
