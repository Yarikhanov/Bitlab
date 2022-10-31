package Nasledovanie2;

public class User {
    protected int id;
    protected String login;
    protected String password;
    protected String name;
    protected String surname;
    public User () {

    }
    public User (int id, String login, String password, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
    }
    public void getData () {
        System.out.println("ID: "+id+" "+"login: "+login+" "+"password: "+password+" "+"Name: "+name+" "+"Surname: "+surname );
    }
}
